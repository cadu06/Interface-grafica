import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Maininterface extends JFrame {
    private JLabel LabelTitle1;
    private JTextField TextField;
    private JButton cliqueAquiButton;
    private JPanel section1, section2;
    private JButton próximaPáginaButton;

    public Maininterface(){
        setContentPane(section1);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        cliqueAquiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = TextField.getText();
                LabelTitle1.setText(texto);
            }
        });

        próximaPáginaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Section2();
            }
        });
    }
    public static void main(String[] args) {
        new Maininterface();
    }
}
