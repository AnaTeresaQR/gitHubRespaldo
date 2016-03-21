package JUnitOrdenamientoVector;

/**
 *
 * @author Ana Teresa
 */
public class VectorM {

    private int[] vector;

    public VectorM() {
    }

    public VectorM(int[] vector) {
        this.vector = vector;
    }

    public int[] bubbleSort() {
        int temp;
        for (int i = 1; i < vector.length; i++) {

            for (int j = 0; j < vector.length - 1; j++) {
                if (vector[j] > vector[j + 1]) {
                    temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }

        }
        return vector;
    }

    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector) {
        this.vector = vector;
    }

    public String print(int[] v) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < v.length; i++) {
            sb.append(" ").append(vector[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        int[] vector = {3, 5, 1, 2};
        VectorM vm = new VectorM(vector);
        System.out.println("" + vm.print(vm.bubbleSort()));

    }

}
