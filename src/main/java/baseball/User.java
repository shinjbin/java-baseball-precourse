package baseball;

import java.util.ArrayList;
import java.util.List;

public class User {
    List<Integer> numbers;
    UserInput userInput = new UserInput();

    void myInput() {
        numbers = userInput.input();
    }
    List<Integer> getNumbers() {
        return this.numbers;
    }
}
