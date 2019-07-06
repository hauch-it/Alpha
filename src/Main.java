import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main {
    //Variablen GUI

    JFrame fr = null;
    JMenuBar jmb = null;
    JMenu jm = null;
    JMenu jm1 = null;
    JPanel contantPane = null;
    JLabel label = null;
    JMenuItem jmI = null;
//Konstruktor Gui
    public Main(){
        this.fr = new JFrame("Coutinius Integration");
        this.fr.setSize(666,900);

        this.jmb = new JMenuBar();
        this.fr.setJMenuBar(jmb);
        this.jm = new JMenu("Menu");
        this.jmb.add(jm);
        this.jmI = new JMenuItem("Exit");
        this.jm.add(jmI);
        this.jmI.addActionListener(new ActionListener1());
        this.jm1 = new JMenu("Info");
        this.jmb.add(jm1);

        this.contantPane = new JPanel();
        
        this.fr.setContentPane(contantPane);


        this.contantPane.add(new JLabel("Ein Tool der CI!"));
        
        this.contantPane.add(new JLabel("1) Tools von Daniel"));

        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButton hzeit = new JRadioButton("Hochzeit");
        hzeit.setBounds(100, 170, 100, 20);
        buttonGroup.add(hzeit);
        this.contantPane.add(hzeit);
        JRadioButton gtag = new JRadioButton("Geburtstag");
        gtag.setBounds(250, 170, 100, 20);
        buttonGroup.add(gtag);
        this.contantPane.add(gtag);

        JLabel auswahl = new JLabel("Ihre Auswahl:");
        auswahl.setBounds(10, 200, 100, 20);
        this.contantPane.add(auswahl);
        final JTextField text1 = new JTextField();
        text1.setBounds(100, 200, 300, 20);
        this.contantPane.add(text1);

        hzeit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ie) {
                text1.setText("MALE");
            }
        });

        gtag.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ie) {
                text1.setText("FEMALE");
            }
        });



        this.contantPane.add(new JLabel("2) Tools von Eugen"));








        this.contantPane.add(new JLabel("3) Tools von Michael"));


        this.contantPane.setVisible(true);
        this.fr.setVisible(true);
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Main mn = new Main();

    }
// Action Listener
    private class ActionListener1 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

            System.exit(0);
        }
    }


}
