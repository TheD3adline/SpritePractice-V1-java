package at.bbrz.uebungen.sprite;

public class Main {
    public static void main(String[] args) {


        String patternPac = "3C7EF7F8F0FC7E3C";

        int[] patternGhost = {24, 124, 124, 86, 126, 198, 127, 85};

        Sprite spritePacman = new Sprite("Behold, the real Pacman!", patternPac, "41m", "40m");

        Sprite spriteGhost = new Sprite("Be careful of the ghost!", patternGhost, "43m", "47m");

        spritePacman.printPattern();

        spriteGhost.printPattern();
    }
}