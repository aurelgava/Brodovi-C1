package more;

public class Brod {
    protected String ime;
    protected int maxMornara;

    protected int trenutniBroj;

    protected Mornar[] mornari;

    protected char vrsta;

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
        if(trenutniBroj==0) {
            mornari[0]=m;
            trenutniBroj=1;
            return;
        }
        if(m.dohvKvalitet()>mornari[0].dohvKvalitet()) {
            mornari[trenutniBroj++] = mornari[0];
            mornari[0] = m;
        }else {
            mornari[trenutniBroj++] = m;

        }

        }


    public int dohvBr(){
        return trenutniBroj;
    }

    public Mornar dohvatiKapetana(){
        return mornari[0];
    }

    public Mornar dohvMorn(int index) throws GIndeks{
        if(index<trenutniBroj){
            return mornari[index];
        }else throw new GIndeks();
    }

    public Mornar dohvNajgoregMornara(){
        return mornari[trenutniBroj-1];
    }

    public char dohvVrsta(){
        return vrsta;
    }

    public double dohvKvalitet(){
        int zbir = 0;
        if(trenutniBroj>0){
            for(int i = 0; i<trenutniBroj; i++){
                zbir += mornari[i].dohvKvalitet();
            }
            return (double)zbir/trenutniBroj;
        }else return 0;
    }

    public void ukloniPosadu(){
        for(int i = 0; i<trenutniBroj; i++){
            mornari[i] = null;
        }
        trenutniBroj = 0;
    }
    public String toString(){
        return vrsta + " - " + ime + " : " + dohvKvalitet();

    }


}
