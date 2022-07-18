package baseball;

import java.util.ArrayList;

public class Game {
    User user = new User();
    Computer computer = new Computer();
    int strike, ball;

    boolean Check() {
        strike = ball = 0;
        ArrayList<Integer> userNumbers = user.getNumbers();
        ArrayList<Integer> computerNumbers = computer.getNumbers();

        if (userNumbers.equals(computerNumbers)) {
            return true;
        }

        for (int i = 0 ; i < 3; i++) {
            if (userNumbers.get(i).equals(computerNumbers.get(i))) strike++;
            else if (computerNumbers.contains(userNumbers.get(i))) ball++;
        }

        return false;
    }

    void Input() {
        System.out.print("숫자를 입력해주세요 : ");
        user.myInput();
    }

    void Print() {
        if (strike == 0 && ball == 0)
            System.out.println("낫싱");
        else if (ball == 0)
            System.out.printf("%d 스트라이크\n", strike);
        else if (strike == 0)
            System.out.printf("%d 볼\n", ball);
        else
            System.out.printf("%d 볼 %d 스트라이크", ball, strike);
    }

    void Start() {
        boolean finish = false;

        while (!finish) {
            this.Input();
            finish = this.Check();
            this.Print();
        }
    }
}
