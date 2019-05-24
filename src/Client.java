import java.util.*;

public class Client {
    private String nif;
    private String nom;
    private String telefon;
    private ArrayList<Lloguer> lloguers;
    private static final double EUROS_PER_UNITAT_DE_COST = 30;

    public Client(String nif, String nom, String telefon) {
        this.nif = nif;
        this.nom = nom;
        this.telefon = telefon;
        this.lloguers = new ArrayList<Lloguer>();
    }

    public String getNif()     {
        return nif;
    }

    public String getNom()     {
        return nom;
    }

    public String getTelefon() {
        return telefon;
    }

    public ArrayList<Lloguer> getLloguers() {
        return lloguers;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    public void afegeix(Lloguer lloguer) {
        if (! lloguers.contains(lloguer) ) {
            lloguers.add(lloguer);
        }
    }
    public void elimina(Lloguer lloguer) {
        if (lloguers.contains(lloguer) ) {
            lloguers.remove(lloguer);
        }
    }
    public boolean conte(Lloguer lloguer) {
        return lloguers.contains(lloguer);
    }

    public String informe() {
        return composaCapsalera() +
                composaDetall() +
                composaPeu();
    }

    public String composaCapsalera() {
        return "Informe de lloguers del client " +
                getNom() +
                " (" + getNif() + ")\n";
    }

    public String composaDetall() {
        String resultat = "";
        for (Lloguer lloguer: lloguers) {
            // composa els resultats d'aquest lloguer
            resultat += "\t" +
                    lloguer.getVehicle().getMarca() +
                    " " +
                    lloguer.getVehicle().getModel() + ": " +
                    (lloguer.quantitat() * EUROS_PER_UNITAT_DE_COST) + "€" + "\n";
        }
        return resultat;
    }

    public String composaPeu() {
        return "Import a pagar: " + importTotal() + "€\n" +
                "Punts guanyats: " + bonificacionsTotals() + "\n";
    }

    public double importTotal() {
        double total = 0;
        for (Lloguer lloguer: lloguers){
            total += lloguer.quantitat() * EUROS_PER_UNITAT_DE_COST;
        }
        return total;
    }

    public int bonificacionsTotals() {
        int bonificacions = 0;
        for (Lloguer lloguer: lloguers) {
            bonificacions += lloguer.bonificacions();
        }
        return bonificacions;
    }

    public int size() {
        return lloguers.size();
    }

    public String getMarca(Lloguer lloguer) {
        return lloguer.getMarca(lloguer.getVehicle());
    }

    public String getModel(Lloguer lloguer) {
        return lloguer.getModel(lloguer.getVehicle());
    }

    public String getData(Lloguer lloguer) {
        return lloguer.getData();
    }

    public int getDies(Lloguer lloguer) {
        return lloguer.getDies();
    }
}