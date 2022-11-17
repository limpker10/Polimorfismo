package herencia.tipoInterfaces;

public abstract class VehiculoT {

    private String matriculaT;
    private String marcaT;
    private String modeloT;

    public VehiculoT() {
        matriculaT = "No tiene";
        marcaT = "No tiene";
        modeloT = "No tiene";
    }
    public VehiculoT(String matriculaT, String marcaT, String modeloT) {
        this.matriculaT = matriculaT;
        this.marcaT = marcaT;
        this.modeloT = modeloT;
    }

    public String getMatriculaT() {
        return matriculaT;
    }

    public void setMatriculaT(String matriculaT) {
        this.matriculaT = matriculaT;
    }

    public String getMarcaT() {
        return marcaT;
    }

    public void setMarcaT(String marcaT) {
        this.marcaT = marcaT;
    }

    public String getModeloT() {
        return modeloT;
    }

    public void setModeloT(String modeloT) {
        this.modeloT = modeloT;
    }

    public abstract int capCombustible();

    public void getcapCombustible(){this.capCombustible();}
}
