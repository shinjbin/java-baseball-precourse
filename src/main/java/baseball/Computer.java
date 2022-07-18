package baseball;

import java.util.ArrayList;

public class Computer {
    ArrayList<Integer> numbers;

    Computer() {
        Generate3Numbers generator = new Generate3Numbers();
        numbers = generator.create();
    }

    ArrayList<Integer> getNumbers() {
        return numbers;
    }
}
