import java.util.Scanner;

public class SimpleTmpConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature value: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter unit (C, F, or K): ");
        char unit = scanner.next().toUpperCase().charAt(0);

        double convertedCelsius, convertedFahrenheit, convertedKelvin;

        switch (unit) {
            case 'C':
                convertedCelsius = temperature;
                convertedFahrenheit = celsiusToFahrenheit(temperature);
                convertedKelvin = celsiusToKelvin(temperature);
                break;
            case 'F':
                convertedCelsius = fahrenheitToCelsius(temperature);
                convertedFahrenheit = temperature;
                convertedKelvin = fahrenheitToKelvin(temperature);
                break;
            case 'K':
                convertedCelsius = kelvinToCelsius(temperature);
                convertedFahrenheit = kelvinToFahrenheit(temperature);
                convertedKelvin = temperature;
                break;
            default:
                System.out.println("Invalid unit. Please enter C, F, or K.");
                scanner.close();
                return;
        }

        System.out.println("Converted Temperatures:");
        System.out.println("Celsius: " + convertedCelsius + "°C");
        System.out.println("Fahrenheit: " + convertedFahrenheit + "°F");
        System.out.println("Kelvin: " + convertedKelvin + "K");

        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5 / 9;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin * 9 / 5) - 459.67;
    }
}
