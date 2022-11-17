package herencia.tipoInterfaces;

public class ExcavadoraT extends VehiculoT implements Valuable{

    public ExcavadoraT() {
        super();
    }

    public ExcavadoraT(String matriculaT, String marcaT, String modeloT) {
        super(matriculaT, marcaT, modeloT);
    }

    @Override
    public double precio() {
        return 1213.50;
    }

    @Override
    public int capCombustible() {
        return 0;
    }
}