package Kontaktbuch.Kontakt_Klassen;

/**
 * Created by hanut on 21.05.2016.
 */
public class Adresse {

    String strase;
    String postleitzahl;
    String stadt;
    String land;

    Adresse() {}

    Adresse(String strase, String stadt, String postleitzahl, String land) {
        this.strase = strase;
        this.postleitzahl = postleitzahl;
        this.stadt = stadt;
        this.land = land;
    }

    Adresse(String strase, String stadt, String land) {
        this.strase = strase;
        this.stadt = stadt;
        this.land = land;
    }

    Adresse(String strase, String stadt) {
        this.strase = strase;
        this.stadt = stadt;
    }

    // getter - setter

    public void setLand(String land) {
        this.land = land;
    }

    public void setPostleitzahl(String postleitzahl) {
        this.postleitzahl = postleitzahl;
    }

    public void setStadt(String stadt) {
        this.stadt = stadt;
    }

    public void setStrase(String strase) {
        this.strase = strase;
    }

    public String getLand() {
        return land;
    }

    public String getPostleitzahl() {
        return postleitzahl;
    }

    public String getStadt() {
        return stadt;
    }

    public String getStrase() {
        return strase;
    }
}
