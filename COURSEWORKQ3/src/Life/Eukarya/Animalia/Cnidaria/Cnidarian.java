package Life.Eukarya.Animalia.Cnidaria;

import Life.Eukarya.Animalia.Animal;

public abstract class Cnidarian extends Animal {
    public Cnidarian() {
        super(true);
    }

    @Override
    public void grow() {
        System.out.println("The cnidarian grows, according to its DNA.");
    }

    @Override
    public void respire() {
        System.out.println("The cnidarian filters and respires Oxygen.");
    }

    @Override
    public void reproduce() {
        System.out.println("The cnidarian clones itself.");
    }

    @Override
    public void consume() {
        System.out.println("The cnidarian consumes organic material.");
    }

    @Override
    public void excrete() {
        System.out.println("The cnidarian excretes waste matter and toxins.");
    }
}
