package Life.Eukarya.Animalia.Chordata;

import Data.BloodDomain;
import Life.Eukarya.Animalia.Animal;

public abstract class Chordate extends Animal {
    public Chordate() {
        super(false);
        this.setBloodOxygenTransporterType(BloodDomain.domain.Haemoglobin);
    }
}
