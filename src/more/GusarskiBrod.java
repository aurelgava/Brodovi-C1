package more;

import javax.lang.model.element.NestingKind;

public class GusarskiBrod extends Brod{

    public GusarskiBrod(String ime, int brojMornara, Mornar m){
        super(ime, brojMornara, m);
        super.vrsta = 'G';

    }
    public void napadni(Brod ime){
        Brod kvalitetBroda;
        if (this.kvalitetBroda() > ime.kvalitetBroda()) {

        }
    }
}
