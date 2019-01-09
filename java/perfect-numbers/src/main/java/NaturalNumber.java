import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class NaturalNumber {
    private int num = 0;
    NaturalNumber(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        num = number;
    }

    public Classification getClassification() {
        int max = num / 2;
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i=1; i < max; i++) {
            if (num % i == 0 && !factors.contains(i)) {
                factors.add(i);
                if (i != num / i) {
                    factors.add(num / i);
                }
            }
        }
        int sum = 0;
        for (Integer d: factors) {
            sum += d;
            System.out.println(d);
        }
        sum -= num;
        if (sum == num) {
            return Classification.PERFECT;
        }
        if (sum < num) {
            return Classification.DEFICIENT;
        }
        if (sum > num) {
            return Classification.ABUNDANT;
        }
        return Classification.DEFICIENT;
    }


}
