package Kontaktbuch.Fenster;

import Kontaktbuch.Kontakt_Klassen.Kontakt;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import Kontaktbuch.Kontakt_Klassen.*;

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


        // Allgemeine Info
        allgemeineKontaktInfoPanel = getAllgemeineInfo(kontakt);

        // Anschriften / Adressen
        for (JPanel anschriftPanel:getAnschriftenPanel(kontakt.getAdressen())) {
            botPart.add(anschriftPanel);
        }

        //Telefon Email Accounts
        for (JLabel label:getTelefonEmailAccounts(kontakt)) {
            topright_SidePanel.add(label);
        }


        //Panels hinzufügen
        topPart.add(allgemeineKontaktInfoPanel, BorderLayout.WEST);
        topPart.add(topright_SidePanel, BorderLayout.EAST);

        this.add(topPart, BorderLayout.NORTH);
        this.add(botPart, BorderLayout.SOUTH);
    }

    private ArrayList<JLabel> getTelefonEmailAccounts(Kontakt kontakt) {

        ArrayList<JLabel> labels = new ArrayList<>();

        for (Telefon telefon:kontakt.getTelefons()) {
            labels.add(new JLabel(telefon.getTelefonName() + "  -  " + telefon.getTelefonNummer()));
        }

        for (Email email:kontakt.getEmails()) {
            labels.add(new JLabel(email.getEmailName() + "  -  " + email.getEmailAdresse()));
        }

        for (Account account:kontakt.getAccounts()) {
            labels.add(new JLabel(account.getAccountWebsite() + "  -  " + account.getAccountUserName()));
        }

        return labels;
    }

    private ArrayList<JPanel> getAnschriftenPanel(ArrayList<Adresse> adressen) {

        ArrayList<JPanel> anschriftenPanels = new ArrayList<>();
        ArrayList<JLabel> labels = new ArrayList<>();

        JPanel anschriftPanel = null;

        for (Adresse adresse: adressen) {

            // label Liste löschen
            labels.clear();

            // wenn es die bestimmten Objekte in der Adresse gibt
            // zur LabelListe hinzufügen
            if (adresse.getName() != null)
                labels.add(new JLabel(adresse.getName()));

            if (adresse.getStrase() != null)
                labels.add(new JLabel(adresse.getStrase()));

            if (adresse.getPostleitzahl() != null && adresse.getStadt() != null) {
                labels.add(new JLabel(adresse.getPostleitzahl() + " " + adresse.getStrase()));
            } else if (adresse.getStadt() != null) {
                labels.add(new JLabel(adresse.getStadt()));
            }

            if (adresse.getLand() != null)
                labels.add(new JLabel(adresse.getLand()));


            //neues Panel mit GridLayout und richtiger Anzahl an zeilen
            anschriftPanel = new JPanel(new GridLayout(labels.size(), 1));

            // jedes Label zum Panel hinzufügen
            for (JLabel label: labels) {
                anschriftPanel.add(label);
            }

            // Panel zur PanelListe hinzufügen
            anschriftenPanels.add(anschriftPanel);

        }

        return anschriftenPanels;
    }

    private JPanel getAllgemeineInfo(Kontakt kontakt) {
        ArrayList<JLabel> labels = new ArrayList<>();

        if (kontakt.getNickname() != null)
            labels.add(new JLabel(kontakt.getNickname() + "\n"));

        if (kontakt.getNachname() != null) {
            labels.add(new JLabel(kontakt.getVorname() + " " + kontakt.getNachname() + "\n"));
        } else {
            labels.add(new JLabel(kontakt.getVorname() + "\n"));
        }

        if (kontakt.getAlter() != 0)
            labels.add(new JLabel("Alter: " + kontakt.getAlter() + "\n"));

        if (kontakt.getBeschreibung() != null) {
            labels.add(new JLabel("Beschreibung:"));
            labels.add(new JLabel(kontakt.getBeschreibung()));
        }

        JPanel returnPanel = new JPanel(new GridLayout(labels.size(), 1));

        for (JLabel label: labels) {
            returnPanel.add(label);
        }

        return returnPanel;
    }
}
