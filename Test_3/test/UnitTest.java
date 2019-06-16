import Testable.Animal;
import org.junit.*;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class UnitTest
{
  public UnitTest() {
  }

  @Test
  public void willBeColdDuringWinter() {
    Animal dog = new Animal(4, true, "Dog", null);
    assertFalse(dog.willBeColdDuringWinter());
    Animal human = new Animal(2, false, "Human", null);
    assertTrue(human.willBeColdDuringWinter());
  }
}
