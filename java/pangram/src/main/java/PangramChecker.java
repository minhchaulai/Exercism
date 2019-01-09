public class PangramChecker {

    public boolean isPangram(String input) {
        if (input.length() == 0) { return false; }
        for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
            if (input.indexOf(alphabet) != -1 || input.indexOf(Character.toUpperCase(alphabet)) != -1) {
                continue;
            }p
            else {
                return false;
            }
        }
        return true;
    }

}
