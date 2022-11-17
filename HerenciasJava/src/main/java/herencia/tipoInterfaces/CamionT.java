package herencia.tipoInterfaces;

public class CamionT extends VehiculoT implements Valuable{

    public CamionT() {
        super();
    }

    public CamionT(String matriculaT, String marcaT, String modeloT) {
        super(matriculaT, marcaT, modeloT);
    }

    @Override
    public double precio() {
        return 1313.4;
    }

    @Override
    public int capCombustible() {
        return 0;
    }
}
