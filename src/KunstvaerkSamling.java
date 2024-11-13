import java.util.ArrayList;

public class KunstvaerkSamling {
    private ArrayList<Kunstvaerk> kunstvaerker;

    public KunstvaerkSamling() {
        this.kunstvaerker = new ArrayList<>();
    }


    public void add(Kunstvaerk kunstvaerk) {
        kunstvaerker.add(kunstvaerk);
    }


    public void findSangeMedFlereKomponister() {
        for (Kunstvaerk kv : kunstvaerker) {
            if (kv instanceof Komposition && kv.getAntalOphavsmænd() > 1) {
                System.out.println(kv.titel);
            }
        }
    }


    public void findMalerierPaaMuseum(String museumNavn) {
        for (Kunstvaerk kv : kunstvaerker) {
            if (kv instanceof Maleri) {
                Maleri maleri = (Maleri) kv;
                if (maleri.getMuseum().getNavn().equals(museumNavn)) {
                    System.out.println(maleri.titel);
                }
            }
        }
    }

    // Calculate the total number of pages from books in the collection
    public void beregnAntalLaesteSider() {
        int totalSider = 0;
        for (Kunstvaerk kv : kunstvaerker) {
            if (kv instanceof Bog) {
                totalSider += ((Bog) kv).getAntalSider();
            }
        }
        System.out.println(totalSider);
    }
}