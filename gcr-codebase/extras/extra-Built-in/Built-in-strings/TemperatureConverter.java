// a program to convert temprature

public class TemperatureConverter {

    static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        double f = 98.6;
        double c = 37;

        System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(f));
        System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(c));
    }
}
