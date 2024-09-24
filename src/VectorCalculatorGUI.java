import javax.swing.*;
import java.awt.*;
@SuppressWarnings("all")
/**
 * GUI doesn't work with the VectorCalculator class.
 * Its a separate class, this version has a gui the other doesnt
 * but they essentially do the same thing
 */
public class VectorCalculatorGUI extends JFrame {

    private JTextField vector1X, vector1Y, vector1Z;

    private JTextField vector2X, vector2Y, vector2Z;

    private JComboBox<String> operationComboBox;

    public VectorCalculatorGUI() {
        setTitle("Vector Operation GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel leftBrace1 = new JLabel("<html>{<br>{<br>{</html>");
        JLabel rightBrace1 = new JLabel("<html>}<br>}<br>}</html>");
        JLabel leftBrace2 = new JLabel("<html>{<br>{<br>{</html>");
        JLabel rightBrace2 = new JLabel("<html>}<br>}<br>}</html>");

        vector1X = new JTextField(5);
        vector1Y = new JTextField(5);
        vector1Z = new JTextField(5);

        vector2X = new JTextField(5);
        vector2Y = new JTextField(5);
        vector2Z = new JTextField(5);

        String[] operations = { "*", "-" };
        operationComboBox = new JComboBox<>(operations);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 3;
        gbc.insets = new Insets(0, 10, 0, 10);
        add(leftBrace1, gbc);

        gbc.gridheight = 1;
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(vector1X, gbc);
        gbc.gridy = 1;
        add(vector1Y, gbc);
        gbc.gridy = 2;
        add(vector1Z, gbc);
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridheight = 3;
        add(rightBrace1, gbc);
        gbc.gridheight = 1;
        gbc.gridx = 3;
        gbc.gridy = 1;
        add(operationComboBox, gbc);

        gbc.gridx = 4;
        gbc.gridy = 0;
        gbc.gridheight = 3;
        add(leftBrace2, gbc);

        gbc.gridheight = 1;
        gbc.gridx = 5;
        gbc.gridy = 0;
        add(vector2X, gbc);

        gbc.gridy = 1;
        add(vector2Y, gbc);

        gbc.gridy = 2;
        add(vector2Z, gbc);

        gbc.gridx = 6;
        gbc.gridy = 0;
        gbc.gridheight = 3;
        add(rightBrace2, gbc);

        setVisible(true);
    }
}
