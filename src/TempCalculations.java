
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class TempCalculations implements CalculationManager {

    @Override
    public final double convertTemps(String input, JRadioButton rdoF, JRadioButton rdoC) {
        while(input==null||input.isEmpty()){
            JOptionPane.showMessageDialog(rdoC, "Temperature is needed");
        }               
//        try{
//            if(input==null)
//            {
//                throw new MandatoryEntryException();
//            }
//        } catch(MandatoryEntryException mee){
//            System.out.println(mee.getMessage());
//        }
        double temp = Double.parseDouble(input);        
        double convertedTemp = 0;
        if (rdoF.isSelected()) {
            //CONVERTS TO FAHRENHEIT
            convertedTemp = (temp - 32) / 1.8;
        } else if (rdoC.isSelected()) {
            convertedTemp = (temp * 1.8) + 32;
        }
        return convertedTemp;
    }
}
