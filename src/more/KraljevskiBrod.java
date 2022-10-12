package more;

public class KraljevskiBrod extends Brod {


    public KraljevskiBrod(String ime, int maxMornara, Mornar m) {
        super(ime, maxMornara, m);
        super.vrsta = 'K';
    }

    public void napadni(Brod ime) {
        Brod kvalitetBroda;
        if (super.dohvKvalitet() > ime.dohvKvalitet()) {

        }
    }
}