import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите расход топлива: ");
        int FuelConsumption = 10;

        System.out.println("Введите количество топлива в баке: ");
        int FuelAmount = 10;

        System.out.println("Данного топлива хватит на: " + (FuelAmount / FuelConsumption) * 100 + " км");

    }

}