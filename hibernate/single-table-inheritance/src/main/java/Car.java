import javax.persistence.*;

@Entity(name="CarSingleTable")
@DiscriminatorValue("car")
public class Car extends Vehicle {
    private Integer gears;

    public Integer getGears() {
        return gears;
    }

    public void setGears(Integer gears) {
        this.gears = gears;
    }

    @Override
    public void setEngines(Integer engines) {
        this.setEngines(engines);
    }
}