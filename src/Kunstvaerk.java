public abstract class Kunstvaerk  {

    protected String titel;
    protected int aar;
    protected Person[] ophavsmænd;
    protected int antalOphavsmænd;

    public Kunstvaerk(String titel, int aar) {;
        this.titel = titel;
        this.aar = aar;
        this.ophavsmænd = new Person[5];
        this.antalOphavsmænd = 0;
    }

    public void addOphavsmand(Person p) {
        if (antalOphavsmænd < ophavsmænd.length) {
            ophavsmænd[antalOphavsmænd] = p;
            antalOphavsmænd++;
        } else {
            System.out.println("Kan ikke tilføje flere ophavsmænd. Maksimum er nået.");
        }
    }

    public int getAntalOphavsmænd() {
        return antalOphavsmænd;
    }
}