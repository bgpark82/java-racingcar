package step4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CarTest {

    @Test
    void create() {
        Car car = Car.of("peter");
        assertThat(car).isEqualTo(Car.of("peter"));
    }

    @Test
    void move() {
        Car peter = Car.of("peter");
        peter.move(4);
        assertThat(peter.getPosition()).isEqualTo(1);
    }
}