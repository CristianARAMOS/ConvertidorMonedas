public class Conversion {
    double conversion_result ;

    public double getConversion_rate() {
        return conversion_result;
    }

    @Override
    public String toString() {
        return
                "Monto Convertido = " + conversion_result;
    }
}
