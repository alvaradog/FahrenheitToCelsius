
import javax.swing.JRadioButton;

public class TempCalculations implements CalculationManager {

    @Override
    public final double convertTemps(String input,JRadioButton rdoF, JRadioButton rdoC) {
        double temp= Double.parseDouble(input);
        double convertedTemp=0;
        if (rdoF.isSelected()) {
            //CONVERTS TO FAHRENHEIT
            convertedTemp = (temp - 32) / 1.8;
        } else if (rdoC.isSelected()) {
            convertedTemp = (temp * 1.8)+32;
        }
        return convertedTemp;
    }
}
