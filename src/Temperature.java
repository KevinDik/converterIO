public class Temperature {

    public double celsiusToKelvin(double convertValue) {
        return convertValue + 273.15;
    }

    public double celsiusToFarenheith(double convertValue) {
        return convertValue = (convertValue * 1.8) + 32;
    }

    public double FarenheithToKelvin(double convertValue) {
        return convertValue = (convertValue - 32) / 1.8;
    }
}
