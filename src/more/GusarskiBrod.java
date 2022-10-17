package more;

import javax.lang.model.element.NestingKind;

public class GusarskiBrod extends Brod{

    public GusarskiBrod(String ime, int brojMornara, Mornar m){
        super(ime, brojMornara, m);
        super.vrsta = 'G';

    }
    public void napadni(Brod x){
        Mornar m1 = this.dohvNajgoregMornara();
        Mornar m2 = x.dohvatiKapetana();
        if (this.dohvBr() > x.dohvBr()) {
            if(m2.dohvKvalitet() > m1.dohvKvalitet() && this.trenutniBroj < 5){
                this.dodajMornara(m2);
                x.ukloniPosadu();
            }else x.ukloniPosadu();
        }else System.out.println("Ovaj napad se ne moze izvrsiti!");
    }
}
