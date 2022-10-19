package more;

public class Flota {
    private String naziv;
    private int brojBrodova;

    private char vrstaFlote;
    private Element lista;
    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public static class Element{
        Brod b;
        Element next;
        public Element(Brod b){
            this.b = b;

        }
    }
    public Flota(String naziv){
        this.naziv = naziv;
        brojBrodova=0;
    }

    public void dodaj(Brod b)throws GNeadekvatan{
        Element novi = new Element(b), temp;
        novi.next = null;

        if(lista==null){
            if(b.dohvVrsta()=='K'){
                vrstaFlote = 'K';
                lista=novi;return;
            }else if(b.dohvVrsta()=='G') {
                vrstaFlote = 'G';
                lista=novi;return;
            }
            brojBrodova++;
        }else {
            if(this.vrstaFlote != b.dohvVrsta()) throw new GNeadekvatan();
            for (temp = lista; temp.next != null; temp = temp.next) ;
            temp.next = novi;
            brojBrodova++;
        }

    }
    public Brod dohvBrod(int i){
        int j=0;
        Element temp = lista;
        while(temp.next!=null && i>j){
            temp=temp.next;
            j++;

        }return temp.b;

    }
    public double kvalitetFlote(){
        double zbir=0;
        brojBrodova = 0;
        for(Element temp=lista; temp != null; temp= temp.next){
            zbir += temp.b.dohvKvalitet();
            brojBrodova++;
        }
        return (double) zbir/brojBrodova;

    }





    @Override
    public String toString() {
    String prikaz = "Flota" + '(' + vrstaFlote + ')' + naziv + ':' + kvalitetFlote() + '\n';
    Element temp = lista;
    while(temp != null){

        prikaz += temp.b + " ";
        temp = temp.next;
    }
        return prikaz;
    }

}
