package Kontaktbuch.Kontakt_Klassen;

/**
 * Created by hanut on 21.05.2016.
 */
public class Email {

    String emailName;
    String emailAdresse;

    Email(String emailName, String emailAdresse) {
        this.emailAdresse = emailAdresse;
        this.emailName = emailName;
    }


    // getter - setter

    public void setEmailAdresse(String emailAdresse) {
        this.emailAdresse = emailAdresse;
    }

    public void setEmailName(String emailName) {
        this.emailName = emailName;
    }

    public String getEmailAdresse() {
        return emailAdresse;
    }

    public String getEmailName() {
        return emailName;
    }
}
