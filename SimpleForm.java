import javax.swing.*;

    public class SimpleForm {
        public static void main(String[] args) {
            JFrame frame = new JFrame("Simple Form");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JLabel label = new JLabel("Enter your name:");
            label.setBounds(50, 50, 150, 30);

            JTextField textField = new JTextField();
            textField.setBounds(200, 50, 150, 30);

            JButton button = new JButton("Submit");
            button.setBounds(150, 100, 100, 30);

            frame.add(label);
            frame.add(textField);
            frame.add(button);

            frame.setLayout(null);
            frame.setVisible(true);
        }
    }

