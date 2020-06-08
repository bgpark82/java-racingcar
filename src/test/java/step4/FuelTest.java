package step4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FuelTest {

    @Test
    void create() {
        Fuel fuel = new Fuel();
        assertThat(fuel).isEqualTo(new Fuel());
    }

    @Test
    void getRandom() {
        Fuel fuel = new Fuel();
        int random = fuel.getRandom();
        assertThat(random).isLessThanOrEqualTo(9);

    }
}
