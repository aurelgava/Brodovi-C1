package more;

public class Brod {
    private String ime;
    private int maxMornara;

    private int trenutniBroj;

    private Mornar[] mornari;

    public String getIme() {
        return ime;
    }

    public int getBrojMornara() {
        return maxMornara;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setBrojMornara(int brojMornara) {
        this.maxMornara = brojMornara;
    }

    public Brod(String ime, int maxMornara, Mornar m){
        this.ime = ime;
        this.maxMornara = maxMornara;
        this.mornari = new Mornar[maxMornara];
        mornari[0] = m;
        trenutniBroj = 1;
    }

    public void dodajMornara(Mornar m){
        //trenutniBroj = trenutniBroj + 1;

        if(m.dohvKvalitet()>mornari[0].dohvKvalitet()) {
            mornari[trenutniBroj++] = mornari[0];
            mornari[0] = m;
        }else{
            mornari[trenutniBroj++] = m;
        }
    }

}
