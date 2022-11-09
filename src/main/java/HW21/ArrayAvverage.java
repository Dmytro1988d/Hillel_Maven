package HW21;

public class ArrayAvverage {
    public int[] arrays;

    public ArrayAvverage(int[] arrays) {
        this.arrays = arrays;
    }

    public double info() {
        double result = 0;

        for (double d : this.arrays) {
            result += d;
        }
        System.out.println(result / arrays.length);
        return result/ arrays.length;
    }
}
