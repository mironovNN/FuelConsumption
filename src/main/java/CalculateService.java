public class CalculateService {

        public double mileageCalculation(double fuelAmount, double fuelConsumption){

            if (fuelAmount <= 0){
                return 0;
            }
            double result = (fuelAmount / fuelConsumption) * 100;

            return result;

        }
}


