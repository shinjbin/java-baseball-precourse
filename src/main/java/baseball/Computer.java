package baseball;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    List<Integer> numbers;

    Computer() {
        Generate3Numbers generator = new Generate3Numbers();
        numbers = generator.create();
    }

    List<Integer> getNumbers() {
        return numbers;
    }
}
