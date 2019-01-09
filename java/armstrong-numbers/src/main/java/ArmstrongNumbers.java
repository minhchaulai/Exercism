import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {

		List<Integer> digits = new ArrayList<>();
		int save = numberToCheck;
		while (numberToCheck > 0) {
			digits.add(numberToCheck % 10);
			numberToCheck /= 10;
		}
		int length = digits.size();
		int count = 0;
		for (Integer digit : digits) {
			count += Math.pow(digit, length);
		}
		return (count == save);
	}

}
