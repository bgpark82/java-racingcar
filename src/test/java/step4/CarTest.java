package step4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    @Test
    void create() {
        Car car = new Car("peter");
        assertThat(car).isEqualTo(new Car("peter"));
    }
}