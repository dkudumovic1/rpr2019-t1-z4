package ba.unsa.etf.rpr;

public class Supermarket {
    private int brojArtikala =0;
    private Artikl[] artikli=new Artikl[1000];

    public void dodajArtikl(Artikl biciklo) {
        if(brojArtikala+1<=50) {
            artikli[brojArtikala]=new Artikl(biciklo);
            brojArtikala++;
        }

    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl izbaceni=null;
        for(int i=0;i<brojArtikala;i++) {
            if(kod.equals(artikli[i].getKod())) {
                izbaceni=artikli[i];
                for(int j=i;j<brojArtikala-1;j++) {
                    artikli[j]=artikli[j+1];
                }
                brojArtikala--;
            }
        }
        return izbaceni;
    }

    public int getBrojArtikala() {
        return brojArtikala;
    }
}
