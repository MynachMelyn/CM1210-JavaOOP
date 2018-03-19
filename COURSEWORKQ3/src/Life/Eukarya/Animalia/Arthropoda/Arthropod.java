package Life.Eukarya.Animalia.Arthropoda;

import Life.Eukarya.Animalia.Animal;

public abstract class Arthropod extends Animal {
    public Arthropod() {
        super(true);
        setLegs(8);
    }
}
