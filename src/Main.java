public class Main {
    public static void main(String[] args){
        Mornar m1 = new Mornar("A", 50), m2 = new Mornar("B", 100), m3 = new Mornar("C", 60), m4 = new
                Mornar("D", 40);
        GusarskiBrod g1 = new GusarskiBrod("Pearl", 5, m1);
        KraljevskiBrod k1 = new KraljevskiBrod("St. John", 2, m3);
        try {
            g1.dodajMorn(m2);
            g1.dodajMorn(new Mornar("E", 60));
            k1.dodajMorn(m4);
            System.out.println("Broj mornara na gusarskom brodu: " + g1.dohvBr());
            System.out.println("Kapetan gusarskog broda: " + g1.dohvatiKapetana());
            try {
                System.out.println("Mornar kraljevskog broda na poziciji 1: " + k1.dohvMorn(1));
            } catch(GIndeks e) {}
            System.out.println("*** Ispis brodova ***");
            System.out.println(g1);
            System.out.println(k1);
            g1.napadni(k1);
            System.out.println("*** Ispis brodova nakon napada ***");
            System.out.println(g1);
            System.out.println(k1);
            Flota flota = new Flota("F");
            flota.dodaj(k1);
            try {
                flota.dodaj(g1); //neuspesno dodavanje gusarskog broda u flotu
            } catch(GNeadekvatan e) {}
            flota.dodaj(new KraljevskiBrod("Santa Maria", 3, new Mornar("F", 40)));
            System.out.println("*** Izgled flote ***");
            System.out.println(flota);
            flota.dohvBrod(0).dodajMorn(new Mornar("G", 50));
            System.out.println("*** Nakon obnove flote ***");
            System.out.println(flota);
        } catch (Exception e) {
            System.err.println(e);
        }

    }
}
