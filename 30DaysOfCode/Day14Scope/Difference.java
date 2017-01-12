package Day14Scope;
/*
test
Sample Input

3
1 2 5

Sample Output

4

 */
class Difference {
    private int[] elements;
    public int maximumDifference;

    Difference(int[] elements) {
        this.elements = elements;
    }

    void computeDifference() {
        int[] ar = new int[elements.length];
        System.arraycopy(elements, 0, ar, 0, elements.length);
        //sort ar
        for (int j = 1; j < ar.length; j++) {
            int key = ar[j];
            int i = j - 1;

            while (i >= 0 && ar[i] > key) {
                ar[i + 1] = ar[i];
                i = i - 1;
                ar[i + 1] = key;
            }
        }

        maximumDifference = Math.abs(ar[0] - ar[ar.length - 1]);
    }

}

