public class TemperatureConverter {

    public double convertCelsiusToFahrenheit(double degrees) {
        return (degrees * 9/5) + 32;
    }

    public double convertFahrenheitToCelsius(double degrees) {
        return (degrees - 32) * 5/9;
    }

    public double convert(ConversionUnits conversionUnits) {
        double degrees = conversionUnits.getDegrees();
        ConversionUnits.Units output = conversionUnits.getOutput();

        if (conversionUnits.getInput() == output) {
            return conversionUnits.getDegrees();
        }

        if (output == ConversionUnits.Units.CELSIUS) return convertFahrenheitToCelsius(degrees);

        return convertCelsiusToFahrenheit(degrees);
    }

}
