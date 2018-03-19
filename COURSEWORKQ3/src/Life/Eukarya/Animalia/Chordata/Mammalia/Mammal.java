package Life.Eukarya.Animalia.Chordata.Mammalia;

import Life.Eukarya.Animalia.Chordata.Chordate;

public abstract class Mammal extends Chordate {

    public Mammal() {
        super();
    }

    @Override
    public void grow() {
        System.out.println("The mammal grows, according to its DNA.");
    }

    @Override
    public void respire() {
        System.out.println("The mammal respires Oxygen.");
    }

    @Override
    public void reproduce() {
        super.reproduce();
    }

    @Override
    public void consume() {
        System.out.println("The mammal consumes organic material.");
    }

    @Override
    public void excrete() {
        System.out.println("The mammal excretes waste matter and toxins.");
    }
}
