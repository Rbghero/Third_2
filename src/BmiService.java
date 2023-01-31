public class BmiService {

    public double calculate(double a, double b) {
        double bmi = a / (b * b);
        return (double) bmi;
    }
}
