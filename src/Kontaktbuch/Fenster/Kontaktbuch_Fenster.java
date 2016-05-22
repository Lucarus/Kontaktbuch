package Kontaktbuch.Fenster;

import javax.swing.*;
import java.awt.*;

public class Kontaktbuch_Fenster extends JFrame{

    JPanel hauptfenster = new JPanel();
    JTabbedPane tabControl = new JTabbedPane();
    JPanel startSeite = new JPanel();
    JPanel testSeite = new JPanel();

    public Kontaktbuch_Fenster() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setMinimumSize( new Dimension(300, 300));

        startSeite.add(new JLabel("Das ist ein Test"));
        testSeite.add(new JButton("Hey"));


        for (int i = 0; i < 5; i++) {
            testSeite = new JPanel();
            testSeite.add(new JLabel("töööscht" + i));
            tabControl.add("Neee" + i, testSeite);
        }


        hauptfenster.setLayout(new BorderLayout());

        hauptfenster.add(tabControl, BorderLayout.CENTER);

        getContentPane().add(hauptfenster);

        pack();

        setVisible(true);

    }
}
