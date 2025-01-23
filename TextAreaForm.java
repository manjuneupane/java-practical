import javax.swing.*;

    public class TextAreaForm {
        public static void main(String[] args) {
            JFrame frame = new JFrame("Text Area Form");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JLabel label = new JLabel("Enter your address:");
            label.setBounds(50, 50, 150, 30);

            JTextArea textArea = new JTextArea();
            textArea.setBounds(50, 100, 300, 100);

            JButton submit = new JButton("Submit");
            submit.setBounds(150, 220, 100, 30);

            frame.add(label);
            frame.add(textArea);
            frame.add(submit);

            frame.setLayout(null);
            frame.setVisible(true);
        }
    }

