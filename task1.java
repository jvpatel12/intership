//build teperature conversion program using java 

import java.util.Scanner;

public class task1{

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return celsiusToKelvin(fahrenheitToCelsius(fahrenheit));
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return celsiusToFahrenheit(kelvinToCelsius(kelvin));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("temperature converter");
        System.out.println("Enter the temperature value:");
        double temp = scanner.nextDouble();
        System.out.println("Enter the unit C/F/K:");
        char unit = scanner.next().toUpperCase().charAt(0);

        switch (unit) {
            case 'C':
                double fahrenheitFromCelsius = celsiusToFahrenheit(temp);
                double kelvinFromCelsius = celsiusToKelvin(temp);
                System.out.printf("%.2f°C is %.2f°F and %.2fK%n", temp, fahrenheitFromCelsius, kelvinFromCelsius);
                break;
            case 'F':
                double celsiusFromFahrenheit = fahrenheitToCelsius(temp);
                double kelvinFromFahrenheit = fahrenheitToKelvin(temp);
                System.out.printf("%.2f°F is %.2f°C and %.2fK%n", temp, celsiusFromFahrenheit, kelvinFromFahrenheit);
                break;
            case 'K':
                double celsiusFromKelvin = kelvinToCelsius(temp);
                double fahrenheitFromKelvin = kelvinToFahrenheit(temp);
                System.out.printf("%.2fK is %.2f°C and %.2f°F%n", temp, celsiusFromKelvin, fahrenheitFromKelvin);
                break;
            default:
                System.out.println("Invalid unit entered. Please use C, F, or K.");
                break;
        }

        scanner.close();
    }
}
