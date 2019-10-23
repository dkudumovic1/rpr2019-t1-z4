package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {
    private Artikl artikl=new Artikl("biciklo",300,"biciklo");

    @Test
    void getCijena() {
        assertEquals(300,artikl.getCijena());
    }
}