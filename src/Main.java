import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main {
    //Variablen GUI

    JFrame fr = null;
    JMenuBar jmb = null;
    JMenu jm = null;
    JPanel contantPane = null;
    JLabel label = null;
    JMenuItem jmI = null;
//Konstruktor Gui
    public Main(){
        this.fr = new JFrame("Coutinius Integration");
        this.fr.setSize(666,900);

        this.jmb = new JMenuBar();
        this.fr.setJMenuBar(jmb);
        this.jm = new JMenu("File");
        this.jmb.add(jm);
        this.jmI = new JMenuItem("Exit");
        this.jm.add(jmI);
        this.jmI.addActionListener(new ActionListener1());


        this.contantPane = new JPanel();
        this.fr.setContentPane(contantPane);
        this.contantPane.add(new JLabel("Beispiel JLabel"));
        this.contantPane.setVisible(true);
        this.fr.setVisible(true);
    }
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Main mn = new Main();

    }

    private class ActionListener1 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

            System.exit(0);
        }
    }


}
