package step4;

import java.util.Objects;

public class Car {

    private static final int STEP = 1;
    private static final int INITIAL_POSITION = 0;

    private final Name name;
    private int position;

    public static Car of(String name) {
        return new Car(name, INITIAL_POSITION);
    }

    Car(String name, int position) {
        this.name = new Name(name);
        this.position = position;
    }

    public void move(Fuel fuel) {
        if(fuel.isValid()) {
            this.position += STEP;
        }
    }

    public String getName() {
        return name.getName();
    }

    public int getPosition() {
        return this.position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) &&
                Objects.equals(position, car.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name=" + name +
                ", position=" + position +
                '}';
    }
}