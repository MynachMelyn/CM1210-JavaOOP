package Life.Eukarya.Animalia.Mollusca;

import Life.Eukarya.Animalia.Animal;

public abstract class Mollusc extends Animal {
    public Mollusc() {
        super(true);
        setLegs(1);
    }

    @Override
    public void grow() {
        System.out.println("The mollusc grows.");
    }

    @Override
    public void respire() {
        System.out.println("The mollusc respires oxygen.");
    }

    @Override
    public void reproduce() {
        super.reproduce();
    }

    @Override
    public void consume() {
        System.out.println("The mollusc consumes organic material.");
    }

    @Override
    public void excrete() {
        System.out.println("The mollusc excretes waste matter and toxins.");
    }
}
