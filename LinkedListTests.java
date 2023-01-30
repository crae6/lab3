import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.util.ArrayList;

public class LinkedListTests {
  @Test 
  public void defaultConstructorTest() {
    LinkedList ll = new LinkedList();
    assertEquals(ll.root, null);
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

