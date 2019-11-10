import java.util.Scanner;

public class Main {
    public void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите расход топлива: ");
        int FuelConsumption = in.nextInt();

        System.out.println("Введите количество топлива в баке: ");
        int FuelAmount = in.nextInt();

        System.out.println("Данного топлива хватит на: " + (FuelAmount / FuelConsumption) * 100 + " км");
    }
}

