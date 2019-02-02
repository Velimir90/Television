package media;

public class Radio {

    private double fmFrequency;
    private int amFrequency;
    private char band;

    public Radio() {
        this.fmFrequency = 91.8;
        this.amFrequency = 600;
        this.band = 'F';
    }

    public double getFmFrequency() {
        return this.fmFrequency;
    }

    public void setFmFrequency(double FmFrequency) {
        this.fmFrequency = fmFrequency;
    }

    public int getAmFrequency() {
        return this.amFrequency;
    }

    public void setAmFrequency(int amFrequency) {
        this.amFrequency = amFrequency;
    }

    public char getBand() {
        return this.band;
    }

    public void setBand(char band) {
        this.band = band;
    }

    public Radio(double fmFrequency, int amFrequency, char band) {
        this.fmFrequency = fmFrequency;
        this.amFrequency = amFrequency;
        this.band = band;
    }

    public void info() {
        System.out.println("FM: " + this.fmFrequency);
        System.out.println("AM: " + this.amFrequency);
        System.out.println("Trenutni talas je: " + this.band);
        System.out.println("");
    }

}
