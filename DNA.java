public class DNA {
    private char[] sequence;

    public DNA(char[] sequence){
        this.sequence = sequence;
    }

    public char[] getSequence(){
        return this.sequence;
    }

    public DNA swap(DNA other, int swapPoint){
        char[] newDNA = this.sequence;
        for(int i = 0; i < this.sequence.length; i++){
            if(i < swapPoint){
                newDNA[i] = this.sequence[i];
            } else {
                newDNA[i] = other.sequence[i];
            }
        }
        DNA newSequence = new DNA(newDNA);

        return newSequence;
    }

    public boolean equals(DNA other){
        boolean isSame = false;
        for(int i = 0; i < this.sequence.length; i++){
            if(this.sequence[i] == other.sequence[i]){
                isSame = true;
            }
        }
       
        return isSame;
    }

    public String toString(){
        String output = "";
        for(int i = 0; i < this.sequence.length; i++){
            output += this.sequence[i];
        }
        return output;
    }
}
