package at.bbrz.uebungen.sprite;

public class Line {

    private boolean[] bitmap;
    private String ansiBodyColor = "\u001B[";
    private String ansiBackgroundColor = "\u001B[";
    private String ansiReset = "\u001B[0m";

    public Line(boolean[] bitmap, String bodyColor, String backgroundColor) {
        this.bitmap = bitmap;
        this.ansiBodyColor = this.ansiBodyColor + bodyColor;
        this.ansiBackgroundColor = this.ansiBackgroundColor + backgroundColor;
    }

    public void printLine() {
        for(boolean digit : bitmap) {
            if(digit) {
                System.out.print(ansiBodyColor + "   " + ansiReset);
            } else {
                System.out.print(ansiBackgroundColor + "   " + ansiReset);
            }
        }
        System.out.println();
    }
}