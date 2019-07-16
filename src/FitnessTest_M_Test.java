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

    @Test
    public void mediumBmi() {
        //arrange
        FitnessTest_M fitnessTest_M = new FitnessTest_M();
        float height = (float) 1.80;
        float weight = 90;
        int expectedResult = 27;

        //act
        int bmiResult = fitnessTest_M.calculateBmi(height, weight);

        //assert
        assertThat("", bmiResult, equalTo(expectedResult));
    }

    @Test
    public void heavyBmi() {
        //arrange
        FitnessTest_M fitnessTest_M = new FitnessTest_M();
        float height = (float) 1.60;
        float weight = 100;
        int expectedResult = 39;

        //act
        int bmiResult = fitnessTest_M.calculateBmi(height, weight);

        //assert
        assertThat("", bmiResult, equalTo(expectedResult));
    }

    @Test
    public void lightBmi() {
        //arrange
        FitnessTest_M fitnessTest_M = new FitnessTest_M();
        float height = (float) 1.75;
        float weight = 50;
        int expectedResult = 16;

        //act
        int bmiResult = fitnessTest_M.calculateBmi(height, weight);

        //assert
        assertThat("", bmiResult, equalTo(expectedResult));
    }

    @Test
    public void monsterBmi() {
        //arrange
        FitnessTest_M fitnessTest_M = new FitnessTest_M();
        float height = (float) 3.70;
        float weight = 3000;
        int expectedResult = 219;

        //act
        int bmiResult = fitnessTest_M.calculateBmi(height, weight);

        //assert
        assertThat("", bmiResult, equalTo(expectedResult));
    }

    @Test
    public void antBmi() {
        //arrange
        FitnessTest_M fitnessTest_M = new FitnessTest_M();
        float height = (float) 0.20;
        float weight = (float) 0.30;
        int expectedResult = 7;

        //act
        int bmiResult = fitnessTest_M.calculateBmi(height, weight);

        //assert
        assertThat("", bmiResult, equalTo(expectedResult));
    }
}
