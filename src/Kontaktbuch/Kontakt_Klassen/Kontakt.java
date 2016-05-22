package Kontaktbuch.Kontakt_Klassen;

import java.util.ArrayList;

public class Kontakt {

    // Kontakt Variablen
    String nickname;
    String vorname;
    String nachname;
    int alter;
    String beschreibung;

    //Listen für andere Dinge
    ArrayList<Email> emails = new ArrayList<>();
    ArrayList<Telefon> telefons = new ArrayList<>();
    ArrayList<Account> accounts = new ArrayList<>();
    ArrayList<Adresse> adressen = new ArrayList<>();

    // leerer Konstruktor (ist einfacher später)
    public Kontakt() {}

    // Konstruktor, der alles nimmt
    public Kontakt(String nickname, String vorname, String nachname, int alter, String beschreibung) {
        this.nickname = nickname;
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
        this.beschreibung = beschreibung;
    }

    //alle zusatz infos wie Email Telefon Accounts zurückgeben
    public int getAmmountEmailTelefonAccounts() {
        int zahl = 0;
        zahl += emails.size();
        zahl += telefons.size();
        zahl += accounts.size();
        return zahl;
    }

    // arraylist getter - setter

    //Email
    public void addEmail(String emailName, String emailAdresse) {
        emails.add(new Email(emailName, emailAdresse));
    }

    public void removeEmail(int index) {
        emails.remove(index);
    }

    public Email getEmail(int index) {
        return emails.get(index);
    }

    public ArrayList<Email> getEmails() {
        return emails;
    }

    //Telefon
    public void addTelefon(String telefonName, String telfonAdresse) {
        telefons.add(new Telefon(telefonName, telfonAdresse));
    }

    public void removeTelefon(int index) {
        telefons.remove(index);
    }

    public Telefon getTelefon(int index) {
        return telefons.get(index);
    }

    public ArrayList<Telefon> getTelefons() {
        return telefons;
    }

    //accounts
    public void addAccount(String accountWebsite, String accountUserName) {
        accounts.add(new Account(accountUserName, accountWebsite));
    }

    public void removeAccount(int index) {
        accounts.remove(index);
    }

    public Account getAccount(int index) {
        return accounts.get(index);
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    //adresse
    public Adresse addAdresse() {
        adressen.add(new Adresse());
        return adressen.get((adressen.size() - 1));
    }

    public Adresse getAdresse(int index) {
        return adressen.get(index);
    }

    public ArrayList<Adresse> getAdressen() {
        return adressen;
    }

    public void removeAdresse(int index) {
        adressen.remove(index);
    }

    // getter - setter

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public int getAlter() {
        return alter;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public String getNachname() {
        return nachname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getVorname() {
        return vorname;
    }
}
