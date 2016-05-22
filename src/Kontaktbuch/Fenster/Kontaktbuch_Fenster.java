package Kontaktbuch.Fenster;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import Kontaktbuch.Kontakt_Klassen.*;

public class Kontaktbuch_Fenster extends JFrame{

    JPanel hauptfenster = new JPanel();
    JTabbedPane tabControl = new JTabbedPane();

    public Kontaktbuch_Fenster(ArrayList<Kontakt> kontakte) {

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        for (Kontakt kontakt:kontakte) {
            tabControl.add(kontakt.getVorname(), new KontaktPanel(kontakt));
        }

        hauptfenster.setLayout(new BorderLayout());
        hauptfenster.add(tabControl, BorderLayout.CENTER);

        getContentPane().add(hauptfenster);

        pack();
        setVisible(true);

    }
}
