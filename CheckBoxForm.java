import javax.swing.*;

    public class CheckBoxForm {
        public static void main(String[] args) {
            JFrame frame = new JFrame("CheckBox Form");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JLabel label = new JLabel("Select your hobbies:");
            label.setBounds(50, 50, 150, 30);

            JCheckBox reading = new JCheckBox("Reading");
            reading.setBounds(50, 100, 100, 30);

            JCheckBox traveling = new JCheckBox("Traveling");
            traveling.setBounds(50, 150, 100, 30);

            JCheckBox coding = new JCheckBox("Coding");
            coding.setBounds(50, 200, 100, 30);

            JButton submit = new JButton("Submit");
            submit.setBounds(200, 200, 100, 30);

            frame.add(label);
            frame.add(reading);
            frame.add(traveling);
            frame.add(coding);
            frame.add(submit);

            frame.setLayout(null);
            frame.setVisible(true);
        }
    }

