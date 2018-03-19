package Life.Eukarya.Protista;

import Life.Eukarya.Eukaryote;

public abstract class Protist extends Eukaryote {
    public Protist() {
        super();
    }
    public void respire() {
        System.out.println("O² is respired.");
    }

    public void grow() {
        reproduce();
    }

    public void reproduce() {
        System.out.println("The protist divides.");
    }

    public void consume() {
        System.out.println("The protist consumes organic material.");
    }

    public void excrete() {
        System.out.println("The protist excretes waste matter.");
    }
}
