public class Vehicle {

    private String model;
    private String marca;
    private int categoria;
    public final static int BASIC = 1;
    public final static int GENERAL = 2;
    public final static int LUXE = 3;

    public Vehicle(String model, String marca, int categoria) {
        this.model = model;
        this.marca = marca;
        this.categoria = categoria;
    }

    public int getCategoriaNumber() {
        return categoria;
    }

    public int getCategoria() {
        if (getCategoriaNumber() == 1){
            return BASIC;
        }
        else if (getCategoriaNumber() == 2){
            return GENERAL;
        }
        else{
            return LUXE;
        }
    }

    public void setCategoria(int categoria) {
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
