import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input2 = {1, 3, 3, 1};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{1, 3, 3, 1}, input2);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    int[] input2 = {3, 12, 0};
    assertArrayEquals(new int[]{0, 12, 3}, ArrayExamples.reversed(input2));
  }

  @Test
  public void testEqualValues() {
    double[] input1 = {3, 3, 3, 3, 3, 3, 3};
    assertEquals(5.0, ArrayExamples.averageWithoutLowest(input1), 0.5);
  }
}
