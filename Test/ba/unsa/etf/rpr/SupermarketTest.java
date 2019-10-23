package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
class SupermarketTest {
    private Supermarket supermarket;
    private Artikl artikl;

    @BeforeEach
    void postavi() {
        supermarket=new Supermarket();
        artikl=new Artikl("biciklo",300,"biciklo");
    }

    @Test
    void dodajArtikl() {
        supermarket.dodajArtikl(artikl);
        assertEquals(1,supermarket.getBrojArtikala());
    }

    @Test
    void izbaciArtiklSaKodom() {
        supermarket.dodajArtikl(artikl);
        supermarket.izbaciArtiklSaKodom("biciklo");
        assertEquals(0,supermarket.getBrojArtikala());
    }
    /*@Test
    void izbaciArtiklSaKodom() {
        assertFalse(supermarket.izbaciArtiklSaKodom("biciklo"));
    }*/

}