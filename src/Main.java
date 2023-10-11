public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double MyBmi = service.calculate(1.81, 80);
        System.out.println(MyBmi);

    }
}
