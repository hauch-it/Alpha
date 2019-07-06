import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Quiz_E {

  JFrame fr = null;
  JPanel contentPane = null;
  JButton button1 = null;
  JLabel label1 = null;
  JLabel label2 = null;
  JLabel label3 = null;
  JTextField j1 = null;
  JTextField j2 = null;
  JTextField j3 = null;
  JMenuItem menuItem1 = null;
  JMenuItem menuItem2 = null;

  JMenuBar bar =null;
  JMenu mF= null;
  JMenu mH = null;

  int button1warsovielmalgedrückt = 0;

  public Quiz_E() {

    this.fr = new JFrame("GUI");
    this.fr.setSize(750, 900);


    this.contentPane = new JPanel();
    this.fr.setContentPane(this.contentPane);

    this.bar = new JMenuBar();
    this.fr.setJMenuBar(bar);
    this.mF = new JMenu("File");
    this.mH = new JMenu("Help");
    this.bar.add(mF);
    this.bar.add(mH);

    this.menuItem1  = new JMenuItem("Exit");
    this.mF.add(menuItem1);



    this.menuItem2 = new JMenuItem("Info");
    this.mH.add(menuItem2);



    this.label1 = new JLabel("Wie ist Ihr Name?");
    this.contentPane.add(label1);

    this.j1 = new JTextField("", 20);
    this.contentPane.add(j1);
    this.j1.setSize(160,20);;
    this.label2 = new JLabel("Wie alt sind Sie?");
    this.contentPane.add(label2);
    this.j2 = new JTextField("", 20);
    this.contentPane.add(j2);
    this.j2.setSize(160,20);

    this.label3 = new JLabel("Was machen Sie beruflich?");
    this.contentPane.add(label3);
    this.j3 = new JTextField("", 20);
    this.contentPane.add(j3);

    this.button1 = new JButton("Erfahren");
    this.contentPane.add(button1);


    this.fr.setVisible(true);

  }

  public static void main(String[] args) {
    Quiz_E q = new Quiz_E();

  }

}
