public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightM = 1.87;
        int weightKG = 98;
        int bmi = service.calculate((int) heightM, weightKG);
        System.out.println(bmi);
    }
}