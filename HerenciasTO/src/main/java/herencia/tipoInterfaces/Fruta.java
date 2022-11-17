package herencia.tipoInterfaces;

public abstract class Fruta implements Valuable{
    private String color;
    public Fruta(){

    }
    public Fruta(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setNombre(String nombre) {
        this.color = nombre;
    }

}
