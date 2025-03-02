public class RGBColor {
    private int red;
    private int green;
    private int blue;

    public RGBColor(int red, int green, int blue){
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRed(){
        return this.red;
    }

    public int getGreen(){
        return this.green;
    }

    public int getBlue(){
        return this.blue;
    }

    public boolean equals(RGBColor other){
        boolean isEqual = false;
        if(this.red == other.red && this.green == other.green && this.blue == other.blue){
            isEqual = true;
        }
        return isEqual;
    }

    public String toString(){
        return String.format("rgb(%d,%d,%d)", this.red, this.green, this.blue);
    }

    public String toHex(){
        return String.format("#%02x%02x%02x", this.red, this.green, this.blue);
    }

}
