package herencia.Clase;

public abstract class Vehiculo {
    private String marca;

    public Vehiculo() {
        marca = "No tiene";
    }

    public abstract double precio();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return this.precio();
    }

}
