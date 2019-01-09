import java.util.ArrayList;
import java.util.List;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        List<String> proteins = new ArrayList<>();
        for (int i=0; i < rnaSequence.length(); i+= 3) {
            String codon = rnaSequence.substring(i, i + 3);
            if (codon.equals("AUG")) {
                proteins.add("Methionine");
            }
            if (codon.equals("UUU") || codon.equals("UUC")) {
                proteins.add("Phenylalanine");
            }
            if (codon.equals("UUA") || codon.equals("UUG")) {
                proteins.add("Leucine");
            }
            if (codon.equals("UCU") || codon.equals("UCC") || codon.equals("UCA") || codon.equals("UCG")) {
                proteins.add("Serine");
            }
            if (codon.equals("UAU") || codon.equals("UAC")) {
                proteins.add("Tyrosine");
            }
            if (codon.equals("UGU") || codon.equals("UGC")) {
                proteins.add("Cysteine");
            }
            if (codon.equals("UGG")) {
                proteins.add("Tryptophan");
            }
            if (codon.equals("UAA") || codon.equals("UAG") || codon.equals("UGA")) {
                return proteins;
            }
        }
        return proteins;
    }
}