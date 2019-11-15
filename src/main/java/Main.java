public class Main {
    public static void main(String[] args) {
        CalculateService service = new CalculateService();
        int result = (int) service.mileageCalculation(10, 8.5);
        System.out.println(result);
    }
}

