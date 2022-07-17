package baseball;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Integer> numbers = new ArrayList<>();

    Computer() {
        Generate3Numbers generater = new Generate3Numbers();
        numbers = generater.create();
    }
}
