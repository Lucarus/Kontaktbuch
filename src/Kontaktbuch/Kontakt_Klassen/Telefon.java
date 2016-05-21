package Kontaktbuch.Kontakt_Klassen;

/**
 * Created by hanut on 21.05.2016.
 */
public class Telefon {

    String telefonName;
    String telefonNummer;

    Telefon(String telefonName, String telefonNummer) {
        this.telefonName = telefonName;
        this.telefonNummer = telefonNummer;
    }


    // getter - setter

    public String getTelefonName() {
        return telefonName;
    }

    public String getTelefonNummer() {
        return telefonNummer;
    }

    public void setTelefonName(String telefonName) {
        this.telefonName = telefonName;
    }

    public void setTelefonNummer(String telefonNummer) {
        this.telefonNummer = telefonNummer;
    }
}
