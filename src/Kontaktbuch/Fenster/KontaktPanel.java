package Kontaktbuch.Fenster;

import Kontaktbuch.Kontakt_Klassen.Kontakt;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Created by Simlerbauer on 22.05.2016.
 */
public class KontaktPanel extends JPanel {

    public KontaktPanel(Kontakt kontakt) {

        super(new BorderLayout());

        // Variablen
        int anzahl_Adressen = kontakt.getAdressen().size();
        int anzahl_zusatzInfo = kontakt.getAmmountEmailTelefonAccounts();

        // Neue Unterteilung...
        JPanel topPart = new JPanel(new BorderLayout());
        topPart.setBackground(Color.orange);
        JPanel botPart = new JPanel(new GridLayout(1, anzahl_Adressen));
        botPart.setBackground(Color.CYAN);

        // Unterteilung top Part
        // links
        JPanel allgemeineKontaktInfoPanel = new JPanel();
        allgemeineKontaktInfoPanel.setBackground(Color.green);
        // rechts
        JPanel topright_SidePanel = new JPanel(new GridLayout(anzahl_zusatzInfo, 1));
        topright_SidePanel.setBackground(Color.magenta);

        // Test sachen

        allgemeineKontaktInfoPanel.add(new JLabel("Test"));
        topright_SidePanel.add(new JLabel("Test"));
        botPart.add(new JLabel("Test"));
        botPart.add(new JLabel("Test"));
        botPart.add(new JLabel("Test"));

        // Allgemeine Info
        topPart.add(allgemeineKontaktInfoPanel, BorderLayout.WEST);
        topPart.add(topright_SidePanel, BorderLayout.EAST);

        this.add(topPart, BorderLayout.NORTH);
        this.add(botPart, BorderLayout.SOUTH);
    }
}
