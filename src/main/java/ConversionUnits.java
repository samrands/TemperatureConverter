public class ConversionUnits {
    private Units input;
    private Units output;
    private double degrees;

    public ConversionUnits(Units input, Units output, double degrees) {
        this.input = input;
        this.output = output;
        this.degrees = degrees;
    }

    public enum Units {
        CELSIUS,
        FAHRENHEIT
    }

    public Units getInput() {
        return input;
    }

    public Units getOutput() {
        return output;
    }

    public double getDegrees() {
        return degrees;
    }
}
