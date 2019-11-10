import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите расход топлива: ");
        int FuelConsumption = 8;

        System.out.println("Введите количество топлива в баке: ");
        int FuelAmount = 10;
        int WayOnFuel = (FuelAmount / FuelConsumption) * 100;
        System.out.println("Данного топлива хватит на: " + WayOnFuel + " км");

    }
}