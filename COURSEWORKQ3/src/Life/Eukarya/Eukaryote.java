package Life.Eukarya;

import Data.DNA;
import Life.Life;

public abstract class Eukaryote extends Life{

    private DNA geneticInformation;

    public abstract void live();

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
}
