public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightM;
        int weightKG;
        int bmi = service.calculate(98, 1.87);
        System.out.println(bmi);
    }
}