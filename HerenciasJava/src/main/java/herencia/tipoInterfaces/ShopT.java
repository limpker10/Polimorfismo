package herencia.tipoInterfaces;

public class ShopT {
    double sum = 0.0;
    public void reset () {
        sum = 0.0;
    }
    public double getTotal() {
        return sum;
    }
    public void regSale( Valuable itemSold) {
       sum += itemSold.precio();
    }
}
