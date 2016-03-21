package JUnitOrdenamientoVector;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ana Teresa
 */
public class VectorMTest {

    public VectorMTest() {
    }

    /**
     * Test of bubbleSort method, of class VectorM.
     */
    @Test
    public void testBubbleSort() {
        System.out.println("bubbleSort");
        int[] vectorOrdenar = {3, 5, 1, 2};
        VectorM instance = new VectorM(vectorOrdenar);
        int[] expResult = {1, 2, 3, 5};
        int[] result = instance.bubbleSort();
        
        assertArrayEquals("El vector  a ordenar: " + vectorOrdenar + " el resultado al ordenar es: "
                + expResult, expResult, result);
    }

}
