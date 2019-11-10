import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите расход топлива: ");
        double FuelConsumption = in.nextDouble();

        System.out.println("Введите количество топлива в баке: ");
        double FuelAmount = in.nextDouble();

        double WayOnFuel = (FuelAmount / FuelConsumption) * 100;
        System.out.println("Данного топлива хватит на: " + WayOnFuel + " км");
    }
}

