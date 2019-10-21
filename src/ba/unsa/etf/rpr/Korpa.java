package ba.unsa.etf.rpr;

public class Korpa {
    private int brojArtikala=0;
    Artikl [] artikli=new Artikl[50];


    public boolean dodajArtikl(Artikl a) {
        if(brojArtikala+1<=50) {
            artikli[brojArtikala-1]=new Artikl(a);
            brojArtikala++;
            return true;
        }
        return false;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl izbaceni=null;
        for(int i=0;i<brojArtikala;i++){
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

    public int dajUkupnuCijenuArtikala() {
        int suma=0;
        for(int i=0;i<brojArtikala;i++) {
            suma=suma+artikli[i].getCijena();
        }
        return suma;
    }
}
