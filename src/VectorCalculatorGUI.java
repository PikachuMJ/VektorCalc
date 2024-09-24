import javax.swing.*;
import java.awt.*;

public class VectorWithGUI extends JFrame {
    // Text fields for vector 1 coordinates
    private JTextField vector1X, vector1Y, vector1Z;

    // Text fields for vector 2 coordinates
    private JTextField vector2X, vector2Y, vector2Z;

    // ComboBox for selecting the operation
    private JComboBox<String> operationComboBox;

    public VectorWithGUI() {
        setTitle("Vector Operation GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Creating large braces for the vectors
        JLabel leftBrace1 = new JLabel("<html>{<br>{<br>{</html>");
        JLabel rightBrace1 = new JLabel("<html>}<br>}<br>}</html>");
        JLabel leftBrace2 = new JLabel("<html>{<br>{<br>{</html>");
        JLabel rightBrace2 = new JLabel("<html>}<br>}<br>}</html>");

        // Initializing vector 1 text fields
        vector1X = new JTextField(5);
        vector1Y = new JTextField(5);
        vector1Z = new JTextField(5);

        // Initializing vector 2 text fields
        vector2X = new JTextField(5);
        vector2Y = new JTextField(5);
        vector2Z = new JTextField(5);

        // Initializing the ComboBox with operations
        String[] operations = { "*", "-" };
        operationComboBox = new JComboBox<>(operations);

        // Adding components for Vector 1 (with braces)
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 3;
        gbc.insets = new Insets(0, 10, 0, 10);
        add(leftBrace1, gbc);  // Left brace for vector 1

        gbc.gridheight = 1; // Resetting height
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(vector1X, gbc);    // X coordinate for vector 1

        gbc.gridy = 1;
        add(vector1Y, gbc);    // Y coordinate for vector 1

        gbc.gridy = 2;
        add(vector1Z, gbc);    // Z coordinate for vector 1

        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridheight = 3;
        add(rightBrace1, gbc); // Right brace for vector 1

        // Adding ComboBox for selecting the operation
        gbc.gridheight = 1; // Resetting height
        gbc.gridx = 3;
        gbc.gridy = 1; // Centered between vectors
        add(operationComboBox, gbc); // Operation ComboBox

        // Adding components for Vector 2 (with braces)
        gbc.gridx = 4;
        gbc.gridy = 0;
        gbc.gridheight = 3;
        add(leftBrace2, gbc);  // Left brace for vector 2

        gbc.gridheight = 1; // Resetting height
        gbc.gridx = 5;
        gbc.gridy = 0;
        add(vector2X, gbc);    // X coordinate for vector 2

        gbc.gridy = 1;
        add(vector2Y, gbc);    // Y coordinate for vector 2

        gbc.gridy = 2;
        add(vector2Z, gbc);    // Z coordinate for vector 2

        gbc.gridx = 6;
        gbc.gridy = 0;
        gbc.gridheight = 3;
        add(rightBrace2, gbc); // Right brace for vector 2

        setVisible(true);
    }
}
