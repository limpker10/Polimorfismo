package herencia.tipoInterfaces;

public class Manzana extends Fruta{

    public Manzana(){

    }
    private String tipo;
    public Manzana(String color, String tipo) {
        super(color);
        this.tipo = tipo;
    }

    @Override
    public double precio() {
        return 2.5;
    }
}
