import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

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

}
