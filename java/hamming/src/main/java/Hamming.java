class Hamming {
    private static String lStrand;
    private static String rStrand;
    Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        lStrand = leftStrand;
        rStrand = rightStrand;
    }

    int getHammingDistance() {
        int count = 0;
        for (int i = 0; i < lStrand.length(); i++) {
            if (lStrand.charAt(i) != rStrand.charAt(i)) {
                count += 1;
            }
        }
        return count;
    }

}
