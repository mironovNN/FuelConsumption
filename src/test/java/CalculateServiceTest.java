import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculateServiceTest {
    @Test
    void mileageCalculationNull(){
        CalculateService service = new CalculateService();
        int result = (int) service.mileageCalculation(0, 8.5);
        assertEquals(0, result);

    }
    @Test
    void mileageCalculation(){
        CalculateService service = new CalculateService();
        int result = (int) service.mileageCalculation(10, 8.5);
        assertEquals(117, result);

    }

}
