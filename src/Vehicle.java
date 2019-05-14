public class Vehicle {

    private String model;
    private String marca;
    private String categoria;

    public Vehicle(String model, String marca, String categoria) {
        this.model = model;
        this.marca = marca;
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
