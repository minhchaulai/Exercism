import java.util.regex.Pattern;

class Acronym {
    private String acro;

    Acronym(String phrase) {
        acro = phrase;
    }

    String getAcronym() {
        String fullAcronym = "";

        acro = acro.replaceAll("-", " ");
        acro = acro.replaceAll("\\p{Punct}", "");

        fullAcronym = fullAcronym + acro.charAt(0);

        for (int i=1; i < acro.length(); i++) {
            if (acro.charAt(i - 1) == ' ' && acro.charAt(i) != ' ') {
                fullAcronym = fullAcronym + Character.toUpperCase(acro.charAt(i));
            }
        }
        return fullAcronym;
    }

}
