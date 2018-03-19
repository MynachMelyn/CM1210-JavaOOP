package Life.Eukarya.Plantae;

import Life.Eukarya.Eukaryote;

public abstract class Plant extends Eukaryote {
    private cellType cellType = Eukaryote.cellType.CELLULOSE;

    public void respire() {
        System.out.println("CO² is respired");
    }

    public void grow() {
        System.out.println("The plant grows toward the light.");
    }

    public void reproduce() {
        System.out.println("The plant spreads its pollinated seeds.");
    }

    public void consume() {
        System.out.println("The plant absorbs sunlight.");
    }

    public void excrete() {
        System.out.println("The plant expels Oxygen.");
    }
}
