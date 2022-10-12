package more;

public class Mornar {
    private String ime;
    private int kvalitet;
    public Mornar(String ime, int kvalitet){
        this.ime = ime;
        this.kvalitet = kvalitet;
    }

    public String dohvIme(){
        return this.ime;
    }

    public int dohvKvalitet(){
        return this.kvalitet;
    }

    @Override
    public String toString() {
        return "M_"+ ime +  ": " + kvalitet;
    }
}
