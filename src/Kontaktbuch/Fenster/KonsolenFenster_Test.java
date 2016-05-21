package Kontaktbuch.Fenster;

import Kontaktbuch.Kontakt_Klassen.*;

public class KonsolenFenster_Test {

    private static Kontakt Lukas = new Kontakt();

    public static void main(String[] args) {
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
            anschrift.setPostleitzahl("2348");
            anschrift.setLand("Deutschland");
            anschrift.setStadt("Berlin");
        }

        anschrift = Lukas.addAdresse();
        {
            anschrift.setName("Vermietete Wohnung");
            anschrift.setStrase("Berlinerweg 33s");
            anschrift.setPostleitzahl("2348");
            anschrift.setLand("Deutschland");
            anschrift.setStadt("Berlin");
        }

        Lukas.addEmail("Arbeit", "lukas.sturm@arbeit.de");
        Lukas.addEmail("Privat", "lukas@googlemail.de");

        Lukas.addTelefon("Zuhause", "08425 1354321678");
        Lukas.addTelefon("Handy", "838230984798");

        Lukas.addAccount("Steam", "lukasGames");
        Lukas.addAccount("Instagramm", "lukas saturm");
        Lukas.addAccount("Twitter", "Lukas St");

        showKontaktInfo(Lukas);
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
