public class Maleri extends Kunstvaerk{

    private int længde;
    private int bredde;
    private Museum museum;

    public Maleri(String titel, int aar, int længde, int bredde, Museum museum) {
        super(titel, aar);
        this.længde = længde;
        this.bredde = bredde;
        this.museum = museum;
    }

    public int getLængde(){
        return længde;
    }

    public int getBredde(){
        return bredde;
    }

    public Museum getMuseum(){
        return museum;
    }
    
}
