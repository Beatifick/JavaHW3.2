public class BmiService {
    public int calculate(int weight, double height) {
        int Bmi = (int) (weight / (height * height));
        return Bmi;
    }
}
