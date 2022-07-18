package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
    ArrayList<Integer> result = new ArrayList<>();

    ArrayList<Integer> input() {
        result.clear();
        String inputstring = Console.readLine();

        String[] strArray = inputstring.split("");
        for (String s : strArray) result.add(Integer.parseInt(s));

        return result;
    }
}
