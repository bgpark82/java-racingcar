package step4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @Test
    void create() {
        Cars cars = new Cars("peter,kassie,oak");
        assertThat(cars).isEqualTo(new Cars("peter,kassie,oak"));
    }

    @Test
    void create_cars_from_name() {
        List<Car> result = new ArrayList<>();
        result.add(Car.of("peter"));
        result.add(Car.of("kassie"));
        result.add(Car.of("oak"));

        String names = "peter,kassie,oak";
        Cars cars = new Cars(names);
        List<Car> list = cars.split(names);

        assertThat(list).isEqualTo(result);
    }
}
