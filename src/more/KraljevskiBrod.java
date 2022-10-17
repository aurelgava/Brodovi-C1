package more;

public class KraljevskiBrod extends Brod {


    public KraljevskiBrod(String ime, int maxMornara, Mornar m) {
        super(ime, maxMornara, m);
        super.vrsta = 'K';
    }

    public void napadni(Brod x) {

        if (x.dohvVrsta() == "G") {
            for(int i = 0; this.maxMornara - this.trenutniBroj; i++){
                if(x.mornari[trenutniBroj].dohvKvalitet() > this.dohvNajgoregMornara().dohvKvalitet()){
                    this.dodajMornara(x.mornari[trenutniBroj]);
                }
            }
        }else System.out.println("Ovaj napad se ne moze izvrsiti!");
    }
}