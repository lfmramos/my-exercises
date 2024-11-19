import javax.persistence.*;

@Entity(name="BoatSingleTable")
@DiscriminatorValue("boat")
public class Boat extends Vehicle {
    Integer engines;
    public Integer getEngines() {
        return engines;
    }

    @Override
    public void setGears(Integer gears) {
        this.setGears(gears);
    }

    @Override
    public void setEngines(Integer engines) {
        this.engines = engines;
    }
}