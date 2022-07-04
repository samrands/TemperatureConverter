import junit.framework.TestCase;

public class TemperatureConverterTest extends TestCase {
    private TemperatureConverter temperatureConverter;

    public void setUp() {
        temperatureConverter = new TemperatureConverter();
    }

    public void testConvertFreezingPointToF() {
        double freezingInF = temperatureConverter.convertCelsiusToFahrenheit(0);

        assertEquals(32d, freezingInF);
    }

    public void testConvertFreezingPointToC() {
        double freezingInC = temperatureConverter.convertFahrenheitToCelsius(32);

        assertEquals(0d, freezingInC);
    }

    public void testBoilingPointToF() {
        double boilingInF = temperatureConverter.convertCelsiusToFahrenheit(100);

        assertEquals(212d, boilingInF);
    }

    public void testBoilingPointToC() {
        double freezingInC = temperatureConverter.convertFahrenheitToCelsius(212);

        assertEquals(100d, freezingInC);
    }

    public void testGenericConvert() {
        ConversionUnits cToF = new ConversionUnits(ConversionUnits.Units.CELSIUS, ConversionUnits.Units.FAHRENHEIT, 0);

        double freezingInF = temperatureConverter.convert(cToF);

        assertEquals(32d, freezingInF);
    }

    public void testGenericConvertToCelsius() {
        ConversionUnits fToC = new ConversionUnits(ConversionUnits.Units.FAHRENHEIT, ConversionUnits.Units.CELSIUS, 212);

        double boilingInC = temperatureConverter.convert(fToC);

        assertEquals(100d, boilingInC);
    }

    public void testSameInputOutput() {
        ConversionUnits same = new ConversionUnits(ConversionUnits.Units.FAHRENHEIT, ConversionUnits.Units.FAHRENHEIT, 212);

        double boilingInC = temperatureConverter.convert(same);

        assertEquals(212d, boilingInC);
    }

}
