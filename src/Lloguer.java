public class Lloguer {

    private String data;
    private int dies;
    private Vehicle vehicle;

    public Lloguer(String data, int dies, Vehicle vehicle) {
        this.data = data;
        this.dies = dies;
        this.vehicle = vehicle;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getDies() {
        return dies;
    }

    public void setDies(int dies) {
        this.dies = dies;
    }

    public String getMarca(Vehicle vehicle) {
        return vehicle.getMarca();
    }

    public String getModel(Vehicle vehicle) {
        return vehicle.getModel();
    }

    public Vehicle getVehicle(){
        return this.vehicle;
    }

    public double quantitat() {
        double quantitat = 0;
        switch (this.getVehicle().getCategoria()) {
            case Vehicle.BASIC:
                quantitat += 3;
                if (this.getDies() > 3) {
                    quantitat += (this.getDies() - 3) * 1.5;
                }
                break;
            case Vehicle.GENERAL:
                quantitat += 4;
                if (this.getDies() > 2) {
                    quantitat += (this.getDies() - 2) * 2.5;
                }
                break;
            case Vehicle.LUXE:
                quantitat += this.getDies() * 6;
                break;
        }
        return quantitat;
    }
}
