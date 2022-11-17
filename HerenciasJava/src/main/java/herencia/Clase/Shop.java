package herencia.Clase;

public class Shop {
    double sum = 0.0;
    public void reset () {
        sum = 0.0;
    }
    public double getTotal() {
        return sum;
    }
        public void regSale( Vehiculo itemSold) {
       sum += itemSold.precio();
    }
}
