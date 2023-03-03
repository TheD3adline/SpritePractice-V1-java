package at.bbrz.uebungen.sprite;

import java.util.ArrayList;
import java.util.List;

public class Sprite {

    private int[] bits = {128, 64, 32, 16, 8, 4, 2, 1};
    private int[] values;
    private String name;
    private List<Line> lines = new ArrayList<>();


    public Sprite(String name, int[] values, String bodyColor, String backgroundColor) {
        this.name = name;
        this.values = values;
        setPattern(bodyColor, backgroundColor);
    }

    public Sprite(String name, String hexValue, String bodyColor, String backgroundColor) {
        this.name = name;
        this.values = hexStringToIntArray(hexValue);
        setPattern(bodyColor, backgroundColor);
    }

    public void printPattern() {
        System.out.println(name + "\n");
        for(Line line : lines) {
            line.printLine();
        }
        System.out.println();
    }

    public void setPattern(String bodyColor, String backgroundColor) {
        for(int value : values) {
            boolean[] bitmap = new boolean[8];
            for(int i = 0; i < 8; i++) {
                if(value >= bits[i]) {
                    value = value - bits[i];
                    bitmap[i] = true;
                }
            }
            lines.add(new Line(bitmap, bodyColor, backgroundColor));
        }
    }

    public int[] hexStringToIntArray(String hexString) {
        int[] data = new int[hexString.length() / 2];
        for(int i = 0; i < hexString.length(); i += 2) {
            data[i / 2] = Integer.parseInt(hexString.substring(i, (i + 2)), 16);
        }
        return data;
    }
}