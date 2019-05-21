import java.util.ArrayList;

public class GestorLloguersLite {

    public static void InformacionCliente(Client cliente, ArrayList<Lloguer> lloguers){
        System.out.println("Client:\t" + cliente.getNom());
        System.out.println("\t\t"+ cliente.getNif());
        System.out.println("\t\t"+ cliente.getTelefon());
        System.out.println("Lloguers: " + cliente.size());
        for (int i = 0; i < cliente.size(); i++) {
            System.out.println("\t" + (i+1) + ". vehicle: " + cliente.getMarca(lloguers.get(i)) +" "+ cliente.getModel(lloguers.get(i)));
            System.out.println("\t   data d'inici: " + cliente.getData(lloguers.get(i)));
            System.out.println("\t   dies llogats: " + cliente.getDies(lloguers.get(i)));
        }
    }

    public static Client CreaClient() {

        Vehicle Moto = new Vehicle("Tote","Toyota", 1);
        Vehicle Coche = new Vehicle("C4","Citroen", 2);
        Vehicle Triciclo = new Vehicle("Light","Dora", 3);

        Lloguer Lloguer1 = new Lloguer("13-05-2019", 3, Moto);
        Lloguer Lloguer2 = new Lloguer("02-01-2019", 3, Coche);
        Lloguer Lloguer3 = new Lloguer("23-07-2018", 3, Triciclo);

        Client Gaston = new Client("X5432457H", "Gastón Rossi", "6543238721");

        Gaston.afegeix(Lloguer1);
        Gaston.afegeix(Lloguer2);
        Gaston.afegeix(Lloguer3);

        //InformacionCliente(Gaston, Gaston.getLloguers());

        return Gaston;
    }
}
