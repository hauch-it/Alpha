import javax.swing.*;

public class Main {
    //Variablen GUI

    JFrame fr = null;
    JMenuBar jmb = null;
    JMenu jm = null;
    JPanel contantPane = null;
    JLabel label = null;

//Konstruktor Gui
    public Main(){
        this.fr = new JFrame("Coutinius Integration");
        this.fr.setSize(666,900);

        this.jmb = new JMenuBar();
        this.fr.setJMenuBar(jmb);
        this.jm = new JMenu("File");
        this.jmb.add(jm);


        this.contantPane = new JPanel();
        fr.setContentPane(contantPane);

        contantPane.add(new JLabel("Beispiel JLabel"));
        // Wir lassen unseren Frame anzeigen
        contantPane.setVisible(true);
        fr.setVisible(true);
    }
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Main mn = new Main();
    }
}
