import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import domain.Line;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.FixedNumberGenerator;

public class LineTest {
    @DisplayName("생성한 값이 1이면 point가 생성된다.")
    @Test
    void shouldMakePoint() {
        FixedNumberGenerator fixedNumberGenerator = new FixedNumberGenerator(1);
        Assertions.assertThat(fixedNumberGenerator.isPoint()).isEqualTo(true);
    }

    @DisplayName("생성한 값이 0이면 point가 생성되지 않는다.")
    @Test
    void shouldNotMakePoint() {
        FixedNumberGenerator fixedNumberGenerator = new FixedNumberGenerator(0);
        Assertions.assertThat(fixedNumberGenerator.isPoint()).isEqualTo(false);
    }

    @DisplayName("라인 생성 확인 테스트")
    @Test
    void shouldSuccessLine() {
        assertDoesNotThrow(() -> new Line(4));
    }
}
