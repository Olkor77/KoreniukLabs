import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class StringCheckerTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void findLessThanAverage() {

    }

    @org.junit.jupiter.api.Test
    void findAverage() {
        //Arrange
        StringChecker sc = new StringChecker();
        String[] input = {"123", "1234", "12345"};
        int expResult = 4;

        //Act
        int actResult = sc.findAverage(input);

        //Assert
        Assert.assertEquals(expResult, actResult);
    }
}