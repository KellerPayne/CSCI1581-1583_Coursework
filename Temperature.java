package Lab04;

public class Temperature {
    
    static double celsiusToFahrenheit(double celsius){
        return (9.0 / 5.0) * celsius + 32.0;
    }

    static double celsiusToKelvin(double celsius){
        return celsius + 273.15;
    }

    static double fahrenheitToCelsius(double fahrenheit){
        return (5.0 / 9.0) * (fahrenheit - 32.0);
    }

    static double fahrenheitToKelvin(double fahrenheit){
        return (5.0 / 9.0) * (fahrenheit + 459.67);
    }

    static double kelvinToFahrenheit(double kelvin){
        return (9.0 / 5.0) * kelvin - 459.67;
    }

    static double kelvinToCelsius(double kelvin){
        return kelvin - 273.15;
    }
}
