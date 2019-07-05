import java.awt .*;
import javax.swing .*;
import java.awt.event .*;

public class D_Test {


    public class NewStudent {
        public static void main(String[] args) {
            NewStudent st = new NewStudent();
        }

        public NewStudent() {
            JFrame frame = new JFrame("STUDENT REGISTRATION FORM");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.setVisible(true);

            JPanel p1 = new JPanel();
            p1.setLayout(null);
            p1.setBackground(Color.CYAN);

            frame.add(p1);
            ButtonGroup buttonGroup = new ButtonGroup();
            JRadioButton male = new JRadioButton("MALE");
            male.setBounds(100, 170, 100, 20);
            buttonGroup.add(male);
            p1.add(male);
            JRadioButton female = new JRadioButton("FEMALE");
            female.setBounds(250, 170, 100, 20);
            buttonGroup.add(female);
            p1.add(female);
            JLabel sex = new JLabel("SEX:");
            sex.setBounds(10, 200, 100, 20);
            p1.add(sex);
            final JTextField gender = new JTextField();
            gender.setBounds(100, 200, 300, 20);
            p1.add(gender);

            male.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ie) {
                    gender.setText("MALE");
                }
            });

            female.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ie) {
                    gender.setText("FEMALE");
                }
            });
        }
    }
}
