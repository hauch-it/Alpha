import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class TestBmi {
    private Bmi bmi;

    @Before
    public void setup() {
        bmi = new Bmi();
    }

    @Test
    public void normalBmi() {
        //arrange
        Bmi bmi = new Bmi();
        float height = (float) 1.70;
        float weight = 70;
        int expectedResult = 24;

        //act
        int bmiResult = bmi.calculate(height, weight);

        //assert
        assertThat("", bmiResult, equalTo(expectedResult));
    }
}
