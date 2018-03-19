package Life.Eukarya.Fungi;

import Life.Eukarya.Eukaryote;

public abstract class Fungus extends Eukaryote {
    private cellType cellType = Eukaryote.cellType.CHITIN;

    public void respire() {
        System.out.println("O² is respired, if available. Otherwise, anaerobic respiration is performed.");
    }

    public void grow() {
        System.out.println("The fungus' cells divide, growing the fungus.");
    }

    public void reproduce() {
        System.out.println("The fungus disperses its spores.");
    }

    public void consume() {
        System.out.println("The fungus decomposes surrounding organic matter.");
    }

    public void excrete() {
        System.out.println("The protist excretes waste matter.");
    }
}
