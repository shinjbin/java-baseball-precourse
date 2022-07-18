package baseball;

import java.util.ArrayList;

public class User {
    ArrayList<Integer> numbers = new ArrayList<>();
    UserInput userInput = new UserInput();

    void myInput() {
        numbers = userInput.input();
    }
    ArrayList<Integer> getNumbers() {
        return this.numbers;
    }
}
