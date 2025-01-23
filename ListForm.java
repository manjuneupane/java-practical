import javax.swing.*;

    public class ListForm {
        public static void main(String[] args) {
            JFrame frame = new JFrame("List Form");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JLabel label = new JLabel("Select a programming language:");
            label.setBounds(50, 50, 200, 30);

            String[] languages = {"Java", "Python", "C++", "JavaScript"};
            JList<String> list = new JList<>(languages);
            list.setBounds(50, 100, 150, 100);

            JButton submit = new JButton("Submit");
            submit.setBounds(250, 100, 100, 30);

            frame.add(label);
            frame.add(list);
            frame.add(submit);

            frame.setLayout(null);
            frame.setVisible(true);
        }
    }

