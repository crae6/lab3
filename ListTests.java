import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.util.ArrayList;

public class ListTests {
  @Test 
  public void filterTest() {
    List<String> input1 = new ArrayList<String>();
    StringChecker sc = new StringChecker();
    input1.add("Carson");
    input1.add("soccer");
    input1.add("robotics");
    ListExamples.filter(input1, );
  }
  @Test 
  public void testSumEvenLength5() {
    int[] input1 = { 12, 13, 7, 2, 33};
    assertEquals(EvensExample.sumEvenIndices(input1), 52);
  }
  @Test
  public void testSumEvenLength6() {
    int[] input1 = { 12, 13, 7, 8, 5, 3};
    assertEquals(EvensExample.sumEvenIndices(input1), 24);
  }
}
