package Kontaktbuch.Fenster;

import Kontaktbuch.Kontakt_Klassen.*;

import java.util.ArrayList;

public class KonsolenFenster_Test {

    public static void main(String[] args) {

        ArrayList<Kontakt> kontakts = new ArrayList<>();

        Kontakt Lukas = new Kontakt();
        Kontakt Peter = new Kontakt();


        Peter.setNickname("Peti<3");
        Peter.setAlter(19);
        Peter.setNachname("Meter");
        Peter.setVorname("Peter");
        Peter.setBeschreibung("Echt netter Kerl");

        Adresse peterAnschrift = Peter.addAdresse();
        {
            peterAnschrift.setName("Zuhause");
            peterAnschrift.setStrase("Petersweg 7a");
            peterAnschrift.setPostleitzahl("06342");
            peterAnschrift.setLand("Russland");
        }

        peterAnschrift = Peter.addAdresse();
        {
            peterAnschrift.setName("Wohnung De");
            peterAnschrift.setStrase("Hauptstraße 1b");
            peterAnschrift.setPostleitzahl("93342");
            peterAnschrift.setLand("Deutschland");
        }

        Peter.addTelefon("Zuhause", "0842934872");
        Peter.addAccount("LinkedIn", "Peter Meter");
        Peter.addEmail("Arbeit", "ichbinPeter@arbeit.de");
        Peter.addEmail("Bestimmt", "emailAdresse@email.ru");

        // zu liste
        kontakts.add(Peter);


        Lukas.setAlter(17);
        Lukas.setNickname("Lucarus");
        Lukas.setVorname("Lukas");
        Lukas.setNachname("Sturm");
        Lukas.setBeschreibung("Ein sehr netter Mensch");

        Adresse anschrift = Lukas.addAdresse();
        {
            anschrift.setName("Zuhause");
            anschrift.setStrase("Berlinerweg 33s");
            anschrift.setPostleitzahl("2348");
            anschrift.setLand("Deutschland");
            anschrift.setStadt("Berlin");
        }

        anschrift = Lukas.addAdresse();
        {
            anschrift.setName("Arbeit");
            anschrift.setStrase("Berlinerweg 33s");
            anschrift.setLand("Deutschland");
        }

        anschrift = Lukas.addAdresse();
        {
            anschrift.setName("Vermietete Wohnung");
            anschrift.setStrase("Berlinerweg 33s");
            anschrift.setLand("Deutschland");
            anschrift.setStadt("Berlin");
        }

        anschrift = Lukas.addAdresse();
        {
            anschrift.setName("Kunde Mayer");
            anschrift.setStadt("Berlin");
        }


        Lukas.addEmail("Arbeit", "lukas.sturm@arbeit.de");
        Lukas.addEmail("Privat", "lukas@googlemail.de");

        Lukas.addTelefon("Zuhause", "08425 1354321678");
        Lukas.addTelefon("Handy", "838230984798");

        Lukas.addAccount("Steam", "lukasGames");
        Lukas.addAccount("Instagramm", "lukas saturm");
        Lukas.addAccount("Twitter", "Lukas St");

        // zu liste
        kontakts.add(Lukas);

        Kontaktbuch_Fenster myWindow = new Kontaktbuch_Fenster(kontakts);
    }

    private static void showKontaktInfo(Kontakt kontakt) {

        String tempString;

        if((tempString = kontakt.getNickname()) != null) System.out.println(tempString);
        if((tempString = kontakt.getVorname()) != null) System.out.print(tempString + " ");
        if((tempString = kontakt.getNachname()) != null) System.out.println(tempString);
        if(kontakt.getAlter() != 0) System.out.println(kontakt.getAlter());
        if((tempString = kontakt.getBeschreibung()) != null) System.out.println(tempString);
        System.out.println();

        System.out.println("Anschrift:");
        for (Adresse anschrift: kontakt.getAdressen()) {
            if((tempString = anschrift.getStrase()) != null) System.out.println(tempString);
            if((tempString = anschrift.getPostleitzahl()) != null) System.out.print(tempString + " ");
            if((tempString = anschrift.getStadt()) != null) System.out.println(tempString);
            if((tempString = anschrift.getLand()) != null) System.out.println(tempString);
            System.out.println("");
        }

        System.out.println("");

        System.out.println("Email:");
        for (Email email: kontakt.getEmails()) {
            if((tempString = email.getEmailName()) != null) System.out.print(tempString + "\t");
            if((tempString = email.getEmailAdresse()) != null) System.out.println(tempString);
        }

        System.out.println("");

        System.out.println("Telefon:");
        for (Telefon telefon: kontakt.getTelefons()) {
            if((tempString = telefon.getTelefonName()) != null) System.out.print(tempString + "\t");
            if((tempString = telefon.getTelefonNummer()) != null) System.out.println(tempString);
        }

        System.out.println("");

        System.out.println("Accounts:");
        for (Account account: kontakt.getAccounts()) {
            if((tempString = account.getAccountWebsite()) != null) System.out.print(tempString + "\t");
            if((tempString = account.getAccountUserName()) != null) System.out.println(tempString);
        }
    }
}
