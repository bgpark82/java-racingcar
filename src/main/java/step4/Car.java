package step4;

import java.util.Objects;

public class Car {

    private final String name;
    private int position;

    public static Car of(String name) {
        return new Car(name, 0);
    }

    Car(String name, int position) {
        invalid(name);
        this.name = name;
        this.position = position;
    }


    private void invalid(String name) {
        if(name == "") {
            throw new IllegalArgumentException();
        }
        if(name == null) {
            throw new IllegalArgumentException();
        }
    }

    public void move(int fuel) {
        if(fuel >= 4) {
            this.position += 1;
        }
    }

    public int getPosition() {
        return this.position;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return position == car.position &&
                Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }
}
