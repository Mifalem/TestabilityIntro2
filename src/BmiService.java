public class BmiService {

    public double calculate(double heighMeter, double weightKg) {
        double result;
        result = weightKg / Math.pow(heighMeter, 2);
        return (int) result;

    }
}
