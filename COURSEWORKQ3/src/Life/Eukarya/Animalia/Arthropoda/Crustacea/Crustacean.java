package Life.Eukarya.Animalia.Arthropoda.Crustacea;

import Data.BloodDomain;
import Life.Eukarya.Animalia.Arthropoda.Arthropod;

public abstract class Crustacean extends Arthropod {
    public Crustacean() {
        super();
        this.setBloodOxygenTransporterType(BloodDomain.domain.Haemocyanin);
    }

    @Override
    public void grow() {
        System.out.println("The crustacean sheds its shell and expands.");
    }

    @Override
    public void consume() {
        System.out.println("The crustacean eats other biological matter.");
    }

    @Override
    public void excrete() {
        System.out.println("The crustacean excretes waste toxins and biological matter.");
    }

    @Override
    public void respire() {
        System.out.println("The crustacean filters water to respire the dissolved Oxygen.");
    }
}
