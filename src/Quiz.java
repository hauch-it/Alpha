import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Random;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Quiz extends JFrame {





    JFrame fr = null;
    JPanel contentPane = null;
    JButton button1 = null;

    JTextField j1 = null;
    JLabel label1 = null;
    JLabel label2 = null;
    JLabel label3 = null;
    JLabel frage1 = null;
    JLabel frage1antworten1 = null;
  JLabel frage2 = null;
  JLabel frage1antworten2 = null;

  JLabel html1 = null;
    JMenuItem menuItem1 = null;
    JMenuItem menuItem2 = null;

    JMenuBar bar =null;
    JMenu mF= null;
    JMenu mH = null;

    int button1warsovielmalgedrückt = 0;

    public Quiz() {

      this.fr = new JFrame("GUI");
      this.fr.setSize(430, 630);

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

      this.menuItem1.addActionListener(new CloseListener());

      this.menuItem2 = new JMenuItem("Info");
      this.mH.add(menuItem2);

      this.menuItem2.addActionListener(new CloseListener3());

      this.label1 = new JLabel("Herzlich Willkommen zu unserem Quiz!");
      this.contentPane.add(label1);




      this.label1.setForeground(Color.BLUE );



      this.label2 = new JLabel("Beantworten Sie uns 5 kurze Fragen und gewinnen Sie 10000 Euro!");
      ;
      this.contentPane.add(label2);




      this.frage1 = new JLabel("Frage 1 lautet: Was gehört nicht zum Test Driven Developement?");

      this.contentPane.add(frage1);

      this.frage1antworten1 = new JLabel("A: Refactoring  B: Transformation  C: Clean Code");
      this.contentPane.add(frage1antworten1);

      this.label3 = new JLabel("Antwort:");
      this.contentPane.add(label3);
      this.j1 = new JTextField("", 20);
      this.contentPane.add(j1);
      this.j1.setSize(250,30);;





      this.button1 = new JButton("Prüfen");
      this.contentPane.add(button1);
      this.button1.addActionListener(new CloseListener2());


      this.fr.setVisible(true);

    }

    public static void main(String[] args) {
      Quiz g = new Quiz();

    }

    private class CloseListener implements ActionListener{
      @Override
      public void actionPerformed(ActionEvent e) {

        System.exit(0);
      }
    }

    public class CloseListener2 implements ActionListener{
      @Override
      public void actionPerformed(ActionEvent a) {
        button1warsovielmalgedrückt++;
        if(j1.getText().startsWith("C")  || j1.getText().startsWith("c") ) {
          System.out.println("ja");
          j1.setText("Richtig !  Gewinn 1000 Euro");
          JOptionPane.showMessageDialog(null,
              "Herzlichen Glückwunsch , Sie sind nicht so dumm, wie ich dachte !",
              "Eine Nachricht",
              JOptionPane.WARNING_MESSAGE);

          button1warsovielmalgedrückt++;
        }else{
          System.out.println("nein");
          j1.setText("Falsch geantwortet! ");
        }



      }

    }

    public class CloseListener3 implements ActionListener{
      @Override
      public void actionPerformed(ActionEvent a) {
        System.out.println("Hier sollen Sie Info bekommen");
      }
    }

  }











