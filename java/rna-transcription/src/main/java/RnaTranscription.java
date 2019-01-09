import java.util.ArrayList;
import java.util.List;

class RnaTranscription {

    String transcribe(String dnaStrand) {
        String agg = "";
        for (int i = 0; i < dnaStrand.length(); i++) {
            switch (dnaStrand.charAt(i)) {
                case 'G':
                    agg += 'C';
                    break;
                case 'C':
                    agg += 'G';
                    break;
                case 'T':
                    agg += 'A';
                    break;
                case 'A':
                    agg += 'U';
                    break;
            }
        }
        return agg;
    }
}
