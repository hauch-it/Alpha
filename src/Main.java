import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main {
    //Variablen GUI

    JButton button = null;
    ImageIcon icon = null;

    JFrame fr = null;
    JPanel Panele = null;

    JMenuItem menuItem1 = null;
    JMenuItem menuItem2 = null;
    JMenuItem menuItem3 = null;
    JMenuBar bar =null;
    JMenu mF= null;
    JMenu mH = null;
    JMenu mI = null;
    
    //Konstruktor Gui
    public Main(){

        fr = new JFrame("Coutinius Integration SS 2019");
        fr.setSize(1920,1080);
        fr.setFont(new Font("Helvetica", Font.PLAIN, 12));
        fr.setLayout(new FlowLayout());

        Panele = new JPanel();

        fr.setContentPane(Panele);

        bar = new JMenuBar();
        fr.setJMenuBar(bar);
        mF = new JMenu("File");
        mH = new JMenu("Help");
        mI = new JMenu("Info");
        bar.add(mF);
        bar.add(mH);
        bar.add(mI);

        menuItem1  = new JMenuItem("Hauptprogramm");    mF.add(menuItem1);
        menuItem2  = new JMenuItem("Exit");    mF.add(menuItem2);
        menuItem3  = new JMenuItem("Über");    mI.add(menuItem3);


        menuItem1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ie) {
                try {
                    JOptionPane.showMessageDialog(fr, "Wir wechseln zum Hauptprogramm");

                    Main mn = new Main();
                    fr.setVisible((false));
                    Panele.setVisible(false);
                    mn.fr.setVisible(true);
                    //System.exit(0);


                }catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Fehler");
                }
            }
        });

        menuItem2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ie) {
                try {
                    System.exit(-1);

                }catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Fehler");
                }
            }
        });

        menuItem3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ie) {
                try {
                    JOptionPane.showMessageDialog(fr, "Tools entwickelt für CI 2019 Copyright by DEM Consulting");

                }catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Fehler");
                }
            }
        });

        this.fr.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(-1);
            }
        });

        Panele.add(new JLabel("CI Tools von "));
        ButtonGroup buttonGroup = new ButtonGroup();

        JButton DTools = new JButton("Daniel");    DTools.setBounds(100, 100, 100, 40);
        buttonGroup.add(DTools);    Panele.add(DTools);
        
        JButton ETools = new JButton("Eugen"); ETools.setBounds(200, 200, 100, 40);
        buttonGroup.add(ETools);  Panele.add(ETools);

        JButton MTools = new JButton("Michael"); MTools.setBounds(300, 300, 100, 40);
        buttonGroup.add(MTools);  Panele.add(MTools);

        DTools.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ie) {
                try {

                    JOptionPane.showMessageDialog(fr, "Aufruf von Daniels Tools");
                    fr.setVisible(false);
                    Tage_D gb = new Tage_D();

                }catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Fehler beim Aufruf von Daniels Tools");
                }
            }
        });

        ETools.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ie) {
                try {

                    JOptionPane.showMessageDialog(fr, "Aufruf von Eugens Tools");
                    //fr.setVisible(false);
                    Quiz_Spiel window = new Quiz_Spiel();
                    window.setTitle("Quiz_Spiel");
                    window.pack();
                    window.show();

                }catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Fehler beim Aufruf von Eugens Tools");
                }
            }
        });

        MTools.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ie) {
                try {

                    JOptionPane.showMessageDialog(fr, "Aufruf von Michaels Tools");
                    fr.setVisible(false);
                    FitnessTest_M M = new FitnessTest_M();


                }catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Fehler beim Aufruf von Michaels Tools");
                }
            }
        });

        Panele.setVisible(true);
        this.fr.setVisible(true);
        this.fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Main mn = new Main();

    }
}