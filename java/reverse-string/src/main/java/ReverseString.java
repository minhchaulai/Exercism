class ReverseString {

    String reverse(String inputString) {
        if (inputString == null) { return "";};
        StringBuilder reverse = new StringBuilder(inputString);
        return reverse.reverse().toString();
    }
  
}