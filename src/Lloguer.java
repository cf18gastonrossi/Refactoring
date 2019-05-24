public class Lloguer {

    private String data;
    private int dies;
    private Vehicle vehicle;
    private static final double COST_PER_QUANTITAT_BASIC = 3;
    private static final double COST_PER_QUANTITAT_GENERAL = 2;

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

    public Vehicle getVehicle() {
        return this.vehicle;
    }

    public double costPerTipusDeCategoria() {
        double quantitat = 0;
        switch (this.getVehicle().getCategoria()) {
            case Vehicle.BASIC:
                quantitat += COST_PER_QUANTITAT_BASIC;
                if (this.getDies() > COST_PER_QUANTITAT_BASIC) {
                    quantitat += (this.getDies() - COST_PER_QUANTITAT_BASIC) * 1.5;
                }
                break;
            case Vehicle.GENERAL:
                quantitat += 4;
                if (this.getDies() > COST_PER_QUANTITAT_GENERAL) {
                    quantitat += (this.getDies() - COST_PER_QUANTITAT_GENERAL) * 2.5;
                }
                break;
            case Vehicle.LUXE:
                quantitat += this.getDies() * 6;
                break;
        }
        return quantitat;
    }

    public int bonificacions() {

        if (this.getVehicle().getCategoria() == Vehicle.LUXE &&
                this.getDies() > 1) {
            return 2;
        } else {
            return 1;
        }
    }
}
