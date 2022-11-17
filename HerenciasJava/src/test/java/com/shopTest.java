package com;

import herencia.Clase.Camion;
import herencia.Clase.Shop;
import herencia.tipoInterfaces.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class shopTest {
    @Test
    public void testShop() {
        Shop s = new Shop();
        s.regSale(new Camion());
        assertEquals(new Camion().getPrecio(), s.getTotal(), 0.01);
    }

    @Test
    public void testShopT() {
        ShopT s = new ShopT();
        s.regSale(new Manzana());
        s.regSale(new CamionT());
        double total = 1313.4 + 2.5;
        assertEquals(total, s.getTotal(), 0.01);
    }
}
