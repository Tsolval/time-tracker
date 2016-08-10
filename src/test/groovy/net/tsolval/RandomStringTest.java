package net.tsolval;

import static org.junit.Assert.assertEquals;
import java.util.Random;
import org.junit.Test;

/**
 * This test suite proves (unnecessarily) that "Random" numbers are not really random.  
 *
 * @author Tsolval
 */
public class RandomStringTest {
  /** Proof: Random strings are not so random. */
  @Test
  public void testRandomHelloWorld() {
    String helloString= randomString(-229985452) + " " + randomString(-147909649);
    assertEquals("hello world", helloString);
  }
  
  private static String randomString(int seed) {
    Random random = new Random(seed);
    StringBuilder sb = new StringBuilder();
    while(true) {
      int k = random.nextInt(27);
      if (k == 0) {
        break;
      }
      sb.append((char)('`' + k));
    }
    return sb.toString();
  }
}
