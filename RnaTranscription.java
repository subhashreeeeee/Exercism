public class RnaTranscription {
    public String transcribe(String dnaStrand) {
    	String dna = new String(dnaStrand);
    	//dna.toUpperCase();
    	String rnaStrand = new String();
    	for(int i=0;i<dnaStrand.length();i++){
            if (dnaStrand.charAt(i)=='G') {
                rnaStrand += 'C';
            } else if (dnaStrand.charAt(i)=='C') {
                rnaStrand += 'G';
            } else if (dnaStrand.charAt(i)=='T') {
                rnaStrand += 'A';
            } else {
                rnaStrand += 'U';
            }
        }
		return rnaStrand;
    }
}
