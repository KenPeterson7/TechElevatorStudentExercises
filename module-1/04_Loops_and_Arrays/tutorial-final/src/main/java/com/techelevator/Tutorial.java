package com.techelevator;

public class Tutorial {

    public static void main(String[] args) {

        // write your code here

        int i;

        for (i = 0; i <= 5; i++) {
            System.out.println(i);
        }
        int sum = 0;
        int t;
        for (t = 0; t < 10; t++) {
            sum += t;
        }
        int count = t;
        System.out.println(count);


        int[] forecastTemperatures = new int[5];
        forecastTemperatures[0] = 72;
        forecastTemperatures[1] = 78;
        forecastTemperatures[2] = 58;
        forecastTemperatures[3] = 79;
        forecastTemperatures[4] = 74;

        forecastTemperatures[2] = forecastTemperatures[2] + 10;
        // or forecastTemperatures[2] += 10;

        for (i = 0; i < forecastTemperatures.length; i++) {
            System.out.println(forecastTemperatures[i]);
        }

        int highestTemperatureValue = forecastTemperatures[0];
        int highestTemperatureIndex = 0;

        for (int j = 1; j < forecastTemperatures.length; j++) {
            if (forecastTemperatures[j] > highestTemperatureValue) {
                highestTemperatureValue = forecastTemperatures[j];
                highestTemperatureIndex = j;
            }
        }

        System.out.println("The highest temperature is " + highestTemperatureValue);
        System.out.println("The highest temperature is in " + (highestTemperatureIndex + 1) + " days");
    }


    int[] numbers = new int[10];
    for(int ix = 0; ix < numbers.length; ix++) {
        numbers[ix] = ix * 2;
    }

    int result = numbers[3];
}
