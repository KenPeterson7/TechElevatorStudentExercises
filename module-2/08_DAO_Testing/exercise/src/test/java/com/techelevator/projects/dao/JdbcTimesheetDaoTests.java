package com.techelevator.projects.dao;

import com.techelevator.projects.model.Timesheet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.verification.Times;

import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JdbcTimesheetDaoTests extends BaseDaoTests {

    private static final Timesheet TIMESHEET_1 = new Timesheet(1, 1, 1,
            LocalDate.parse("2021-01-01"), 1.0, true, "Timesheet 1");
    private static final Timesheet TIMESHEET_2 = new Timesheet(2, 1, 1,
            LocalDate.parse("2021-01-02"), 1.5, true, "Timesheet 2");
    private static final Timesheet TIMESHEET_3 = new Timesheet(3, 2, 1,
            LocalDate.parse("2021-01-01"), 0.25, true, "Timesheet 3");
    private static final Timesheet TIMESHEET_4 = new Timesheet(4, 2, 2,
            LocalDate.parse("2021-02-01"), 2.0, false, "Timesheet 4");
    
    private JdbcTimesheetDao sut;

    private Timesheet testTimeSheet;


    @Before
    public void setup() {
        sut = new JdbcTimesheetDao(dataSource);
        testTimeSheet = new Timesheet(0, 1, 2, LocalDate.now(), 1.25, true, "Timesheet 5");
    }

    @Test
    public void getTimesheet_returns_correct_timesheet_for_id() {
        Timesheet timesheet = sut.getTimesheet(1);
        assertTimesheetsMatch(TIMESHEET_1, timesheet);

    }

    @Test
    public void getTimesheet_returns_null_when_id_not_found() {
        Timesheet timesheet = sut.getTimesheet(17);
        Assert.assertNull(timesheet);
    }

    @Test
    public void getTimesheetsByEmployeeId_returns_list_of_all_timesheets_for_employee() {
        List<Timesheet> timesheets = sut.getTimesheetsByEmployeeId(1);
        Assert.assertEquals(2, timesheets.size());
        assertTimesheetsMatch(TIMESHEET_1, timesheets.get(0));
        assertTimesheetsMatch(TIMESHEET_2, timesheets.get(1));

    }

    @Test
    public void getTimesheetsByProjectId_returns_list_of_all_timesheets_for_project() {
        List<Timesheet> timesheets = sut.getTimesheetsByProjectId(1);
        Assert.assertEquals(3, timesheets.size());
        assertTimesheetsMatch(TIMESHEET_1, timesheets.get(0));
        assertTimesheetsMatch(TIMESHEET_2, timesheets.get(1));
        assertTimesheetsMatch(TIMESHEET_3, timesheets.get(2));

    }

    @Test
    public void createTimesheet_returns_timesheet_with_id_and_expected_values() {
        Timesheet timesheet = sut.createTimesheet(testTimeSheet);
        Integer newId = timesheet.getTimesheetId();
        Assert.assertTrue(newId > 0);
        testTimeSheet.setTimesheetId(newId);
        assertTimesheetsMatch(testTimeSheet, timesheet);

    }

    @Test
    public void created_timesheet_has_expected_values_when_retrieved() {
        Timesheet createdTimeSheet = sut.createTimesheet(testTimeSheet);
        Integer newId = createdTimeSheet.getTimesheetId();
        Timesheet retrievedTimeSheet = sut.getTimesheet(newId);

        assertTimesheetsMatch(createdTimeSheet, retrievedTimeSheet);

    }

    @Test
    public void updated_timesheet_has_expected_values_when_retrieved() {
        Timesheet timeSheetToUpdate = sut.getTimesheet(3);
        timeSheetToUpdate.setEmployeeId(2);
        timeSheetToUpdate.setProjectId(2);
        timeSheetToUpdate.setDateWorked(LocalDate.now());
        timeSheetToUpdate.setHoursWorked(20.00);
        timeSheetToUpdate.setBillable(false);
        timeSheetToUpdate.setDescription("Test description update");

        sut.updateTimesheet(timeSheetToUpdate);

        Timesheet retrieveTimeSheet = sut.getTimesheet(3);
        assertTimesheetsMatch(timeSheetToUpdate, retrieveTimeSheet);
    }

    @Test
    public void deleted_timesheet_cant_be_retrieved() {
        sut.deleteTimesheet(1);

        Timesheet retrievedTimeSheet = sut.getTimesheet(1);
        Assert.assertNull(retrievedTimeSheet);

        List<Timesheet> timesheets = sut.getTimesheetsByProjectId(1);
        Assert.assertEquals(2, timesheets.size());

        assertTimesheetsMatch(TIMESHEET_3, timesheets.get(1));
        assertTimesheetsMatch(TIMESHEET_2, timesheets.get(0));
    }

    @Test
    public void getBillableHours_returns_correct_total() {

        double test = sut.getBillableHours(1, 1);  //2.50
        double testTwo = sut.getBillableHours(2, 1);  //.25
        double testThree = sut.getBillableHours(2,2);  //0.00 (false)

        double expectedResult = 2.50;
        double expectedResultTwo = .25;
        double expectedResultThree = 0.00;

        Assert.assertEquals(expectedResult, test, 0.001);
        Assert.assertEquals(expectedResultTwo, testTwo, 0.001);
        Assert.assertEquals(expectedResultThree, testThree, 0.001);

    }

    private void assertTimesheetsMatch(Timesheet expected, Timesheet actual) {
        Assert.assertEquals(expected.getTimesheetId(), actual.getTimesheetId());
        Assert.assertEquals(expected.getEmployeeId(), actual.getEmployeeId());
        Assert.assertEquals(expected.getProjectId(), actual.getProjectId());
        Assert.assertEquals(expected.getDateWorked(), actual.getDateWorked());
        Assert.assertEquals(expected.getHoursWorked(), actual.getHoursWorked(), 0.001);
        Assert.assertEquals(expected.isBillable(), actual.isBillable());
        Assert.assertEquals(expected.getDescription(), actual.getDescription());
    }

}
