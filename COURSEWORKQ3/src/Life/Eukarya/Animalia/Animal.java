package Life.Eukarya.Animalia;

import Data.BloodDomain.domain;
import Life.Eukarya.Eukaryote;

public abstract class Animal extends Eukaryote {

    private boolean exoskeletal;
    private domain oxygenTransporter;
    private cellType cellType = Eukaryote.cellType.MEMBRANE;

    private int legs;

    public Animal(boolean exoskeletal) {
        this.exoskeletal = exoskeletal;
    }

    @Override
    public void reproduce() {
        sexuallyReproduce();
    }

    // Some animals may asexually reproduce, and should override this function therefore.
    private void sexuallyReproduce() {
        System.out.println("The animal reproduces sexually.");
    }

    public boolean isExoskeletal() {
        return exoskeletal;
    }

    public void setExoskeletal(boolean exoskeletal) {
        this.exoskeletal = exoskeletal;
    }

    public domain getBloodOxygenTransporterType() {
        return oxygenTransporter;
    }

    public void setBloodOxygenTransporterType(domain type) {
        oxygenTransporter = type;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        legs = legs;
    }
}
