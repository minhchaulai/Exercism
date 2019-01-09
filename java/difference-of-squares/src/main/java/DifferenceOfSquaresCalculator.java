class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int squareOfSums = input * (input + 1) / 2;
        return (int) Math.pow(squareOfSums, 2);
    }

    int computeSumOfSquaresTo(int input) {
        int sumOfSquares = input * (input + 1) * (2 * input + 1) / 6;
        return sumOfSquares;
    }

    int computeDifferenceOfSquares(int input) {
        return Math.abs(computeSquareOfSumTo(input) - computeSumOfSquaresTo(input));
    }

}
