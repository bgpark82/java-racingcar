package step4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cars {

    private static final String SPLIT_REGEX = ",";
    private final List<Car> cars = new ArrayList<>();

    public Cars(String names) {
        split(names);
    }

    public void split(String names) {
        String[] list = names.split(SPLIT_REGEX);
        for(String name: list) {
            this.cars.add(Car.of(name));
        }
    }

    public List<Car> getCars() {
        return cars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars1 = (Cars) o;
        return Objects.equals(cars, cars1.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cars);
    }
}
