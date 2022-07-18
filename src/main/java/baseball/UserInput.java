package baseball;

import camp.nextstep.edu.missionutils.Console;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
    ArrayList<Integer> result = new ArrayList<>();
    UserInputException userInputException = new UserInputException();

    ArrayList<Integer> input() {
        result.clear();
        String inputstring = Console.readLine();


        userInputException.sample(inputstring);

        String[] strArray = inputstring.split("");
        for (String s : strArray) result.add(Integer.parseInt(s));

        return result;
    }
}
