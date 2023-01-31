public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 90;
        double height = 1.82;
        double index = service.calculate(90, 1.82);
        System.out.println("bmi = " + index + " kg/m2");
    }
}