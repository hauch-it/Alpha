import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main {
    //Variablen GUI

    JFrame fr = null;
    JMenuBar jmb = null;
    JMenu jm = null;
    JMenu jm1 = null;
    JPanel contantPane = null;
    JLabel label = null;
    JMenuItem jmI = null;
    JComboBox combobox_1;
    //Konstruktor Gui
    public Main(){
        fr = new JFrame("Coutinius Integration SS 2019");
        fr.setSize(600,900);
        fr.setFont(new Font("Helvetica", Font.PLAIN, 12));

        jmb = new JMenuBar();
        fr.setJMenuBar(jmb);
        jm = new JMenu("Menu");
        jmb.add(jm);
        jmI = new JMenuItem("Exit");
        jm.add(jmI);
        jmI.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ie) {

                System.exit(-1);
            }
        });
        jm1 = new JMenu("Info");
        jmb.add(jm1);

        contantPane = new JPanel();

        fr.setContentPane(contantPane);

        contantPane.add(new JLabel("Ein Tool der CI!"));

        contantPane.add(new JLabel("Tools von Daniel, Eugen, Michael"));

        ButtonGroup buttonGroup = new ButtonGroup();

        fr.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        combobox_1 = new JComboBox();
        combobox_1.addItem("Daniels Tools");
        combobox_1.addItem("Eugen Tools");
        combobox_1.addItem("Michaels Tools");
        fr.add(combobox_1);


        JRadioButton DTools = new JRadioButton("Daniels Tools");    DTools.setBounds(100, 100, 100, 20);
        buttonGroup.add(DTools);    contantPane.add(DTools);
        
        JRadioButton ETools = new JRadioButton("Eugen Tools"); ETools.setBounds(200, 100, 100, 20);
        buttonGroup.add(ETools);  contantPane.add(ETools);

        JRadioButton MTools = new JRadioButton("Eugen Tools"); MTools.setBounds(300, 100, 100, 20);
        buttonGroup.add(MTools);  contantPane.add(MTools);

        JLabel auswahl = new JLabel("Ihre Auswahl:");
        auswahl.setBounds(10, 200, 100, 20);
        contantPane.add(auswahl);
        final JTextField text1 = new JTextField("..Bisher keine Auswahl!..");
        text1.setBounds(100, 200, 300, 20);
        contantPane.add(text1);

        DTools.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ie) {
                text1.setText("Daniel Tools");

            }
        });
        ETools.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ie) {
                text1.setText("Eugens Tools");


            }
        });

        MTools.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ie) {
                text1.setText("Michaels Tools");

            }
        });


        contantPane.setVisible(true);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Main mn = new Main();

    }


}







