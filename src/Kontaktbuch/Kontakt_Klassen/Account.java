package Kontaktbuch.Kontakt_Klassen;

/**
 * Created by hanut on 21.05.2016.
 */
public class Account {

    String accountWebsite;
    String accountUserName;

    Account(String accountUserName, String accountWebsite) {
        this.accountUserName = accountUserName;
        this.accountWebsite = accountWebsite;
    }


    // getter - setter

    public void setAccountUserName(String accountUserName) {
        this.accountUserName = accountUserName;
    }

    public void setAccountWebsite(String accountWebsite) {
        this.accountWebsite = accountWebsite;
    }

    public String getAccountUserName() {
        return accountUserName;
    }

    public String getAccountWebsite() {
        return accountWebsite;
    }
}
