package step4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PositionTest {

    @Test
    void create() {
        Position position = new Position(0);
        assertThat(position).isEqualTo(new Position(0));
    }
}
