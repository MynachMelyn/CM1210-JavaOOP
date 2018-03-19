package Life.Eukarya;

import Data.DNA;
import Life.Life;

public abstract class Eukaryote extends Life {

    private DNA geneticInformation;

    public enum cellType {CELLULOSE, CHITIN, MEMBRANE}

    private cellType cellType;

    public Eukaryote() {
        super();
    }

    public void live() {
        System.out.println("The Eukaryote lives.");
    }

    public abstract void respire();

    public abstract void grow();

    public abstract void reproduce();

    public abstract void consume();

    public abstract void excrete();

    public DNA getGeneticInformation() {
        return geneticInformation;
    }

    public void setGeneticInformation(DNA geneticInformation) {
        this.geneticInformation = geneticInformation;
    }

    public Eukaryote.cellType getCellType() {
        return cellType;
    }

    public void setCellType(Eukaryote.cellType cellType) {
        this.cellType = cellType;
    }
}
