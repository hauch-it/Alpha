import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class FitnessTest_M_Test {
    private FitnessTest_M fitnessTest_M;

    @Before
    public void setup() {
        fitnessTest_M = new FitnessTest_M();
    }

    @Test
    public void normalBmi() {
        //arrange
        FitnessTest_M fitnessTest_M = new FitnessTest_M();
        float height = (float) 1.70;
        float weight = 70;
        int expectedResult = 24;

        //act
        int bmiResult = fitnessTest_M.calculateBmi(height, weight);

        //assert
        assertThat("", bmiResult, equalTo(expectedResult));
    }
}
