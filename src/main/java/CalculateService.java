public class CalculateService {

        public double mileageCalculation(double FuelAmount, double FuelConsumption){

            if (FuelAmount <= 0){
                return 0;
            }
            double result = (FuelAmount / FuelConsumption) * 100;

            return result;

        }
}


