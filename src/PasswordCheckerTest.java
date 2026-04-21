import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {

  @Test
    void testIsAlphanumeric_ReturnsFalseForSpecialCharacters() {
        // Arrange
        PasswordChecker checker = new PasswordChecker(5, 10);
        // Act
        boolean result = checker.isAlphanumeric("pass!word");
        // Assert
        assertFalse(result);
    }
  @Test
    void testIsAlphanumeric_ReturnsFalseForSpaces() {
      // Arrange
      PasswordChecker checker = new PasswordChecker(5, 10);
      // Act
      boolean result = checker.isAlphanumeric("pass word");
      // Assert
      assertFalse(result);
    }


    @Test 
    void testIsAlphaNumeric_ReturnsTrueForValidPassword() {
      //arrange
      PasswordChecker checker = new PasswordChecker(5, 10);
      //act
      boolean result = checker.isAlphanumeric("passwords987");
      //assert
      assertTrue(result);
    }

    @Test 
    void testDescribePasswordLengthForLongPasswords() {
      //Arrange
      String expected = "long";
      PasswordChecker checker = new PasswordChecker(5, 10);
      //act
      String actual = checker.describePasswordLength("password9876543210");
      //Assert
      assertEquals(expected, actual);


    }
    @Test
    void testDescribePasswordLengthForMediumPasswords() {
      // Arrange
      String expected = "medium";
      PasswordChecker checker = new PasswordChecker(5, 10);
      // Act
      String actual = checker.describePasswordLength("password");
      // Assert
      assertEquals(expected, actual);
    }
    @Test
    void testDescribePasswordLengthForShortPasswords() {
      // Arrange
      String expected = "short";
      PasswordChecker checker = new PasswordChecker(5, 10);
      // Act
      String actual = checker.describePasswordLength("pas");
      // Assert
      assertEquals(expected, actual);
    }

    @Test 
    void testIsBannedPasswordsForBannedPassword() {
      //arrange
      PasswordChecker checker = new PasswordChecker(5, 10);
      //act
      boolean result = checker.isBannedPassword("123456");
      //Assert
      assertTrue(result);


    }
    @Test 
    void testIsBannedPasswordsForNonBannedPassword() {
      //Arrange
      PasswordChecker checker = new PasswordChecker(5, 10);
      //Act
      boolean result = checker.isBannedPassword("NotBannedPassword");

      //Arrange
      assertFalse(result);
    }
}
