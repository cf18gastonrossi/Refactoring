public class Lloguer {

    private String data;
    private String dies;
    private Vehicle vehicle;

    public Lloguer(String data, String dies, Vehicle vehicle) {
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

    public String getDies() {
        return dies;
    }

    public void setDies(String dies) {
        this.dies = dies;
    }
}
