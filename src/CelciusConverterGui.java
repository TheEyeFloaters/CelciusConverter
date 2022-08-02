import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelciusConverterGui extends JFrame {
    private JPanel CelciusConverter;
    private JTextField CelciusTextField;
    private JLabel Celciuslabel;
    private JButton ConvertButton;
    private JLabel fahrenheitLabel;

    public CelciusConverterGui(String tittle){
        super(tittle);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(CelciusConverter);
        this.pack();
        ConvertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Grab the text from the celciusTextField convert to double and update to fahreneit
                int tempFahr = (int) ((Double.parseDouble(CelciusTextField.getText())) * 1.8 + 32);
                fahrenheitLabel.setText(tempFahr + " Fahrenheit");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new CelciusConverterGui("Celcius Converter");
        frame.setVisible(true);
    }
}
