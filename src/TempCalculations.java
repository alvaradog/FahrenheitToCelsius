
import java.text.DecimalFormat;


public class TempCalculations implements CalculationManager {
    
    @Override
    public final double calcFahToCels(double fahrenheit){
        double celsius = (fahrenheit-32)/1.8;
        return celsius;
    }
}
