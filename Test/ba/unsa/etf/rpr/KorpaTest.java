package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
    private Korpa korpa;
    private Artikl artikl;


    @BeforeEach
    void postavi() {
        korpa=new Korpa();
        artikl=new Artikl("biciklo",300,"biciklo");
    }

    @Test
    void dodajArtikl() {
        korpa.dodajArtikl(artikl);
        assertEquals(1,korpa.getBrojArtikala());
    }

    @Test
    void izbaciArtiklSaKodom() {
        korpa.dodajArtikl(artikl);
        korpa.dodajArtikl(artikl);
        korpa.izbaciArtiklSaKodom("biciklo");
        assertEquals(1,korpa.getBrojArtikala());
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        korpa.dodajArtikl(artikl);
        korpa.dodajArtikl(artikl);
        assertEquals(600,korpa.dajUkupnuCijenuArtikala());
    }

    /*@Test
    void izbaciArtiklSaKodom() {
        assertFalse(korpa.izbaciArtiklSaKodom("biciklo"));
    }*/
}