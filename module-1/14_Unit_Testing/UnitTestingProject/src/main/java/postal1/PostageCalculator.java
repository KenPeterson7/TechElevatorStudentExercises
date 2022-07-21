package postal1;

import java.util.Scanner;

public class PostageCalculator {
    private int ounces;
    private int postClass;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the weight of the package: ");
        String value = input.nextLine();
        int weight = Integer.parseInt(value);
        System.out.println("(P)ounds or (O)unces?");
        value = input.nextLine();
        String units = value;
        System.out.println("What distance will it be traveling?");
        value = input.nextLine();
        int distance = Integer.parseInt(value);

        PostalService ps1 = new PostalService(.035,.040,.047,.195,.450,.500);
        PostalService ps2 = new PostalService(.0035,.0040,.0047,.0195,.0450,.0500);
        PostalService ps3 = new PostalService(.0020, .0022, .0024, .0150, .0160, .0170);

        FexEd fedex = new FexEd();
        SPU ups4 = new SPU("4 day");
        SPU ups2 = new SPU("2 day");
        SPU upsN = new SPU("Next day");


        System.out.print("Postal Service (1st Class): $");
        System.out.printf("%.2f", ps1.calculateRate(distance, weight, units));
        System.out.println("");

        System.out.print("Postal Service (2nd Class): $");
        System.out.printf("%.2f", ps2.calculateRate(distance, weight, units));
        System.out.println("");

        System.out.print("Postal Service (3rd Class): $");
        System.out.printf("%.2f", ps3.calculateRate(distance, weight, units));
        System.out.println("");

        System.out.print("FexEd: $");
        System.out.printf("%.2f", fedex.calculateRate(distance, weight, units));
        System.out.println("");

        System.out.print("SPU (4 day ground): $");
        System.out.printf("%.2f", ups4.calculateRate(distance, weight, units));
        System.out.println("");

        System.out.print("SPU (2 day business): $");
        System.out.printf("%.2f", ups2.calculateRate(distance, weight, units));
        System.out.println("");

        System.out.print("SPU (Next day): $");
        System.out.printf("%.2f", upsN.calculateRate(distance, weight, units));
        System.out.println("");
    }


}
