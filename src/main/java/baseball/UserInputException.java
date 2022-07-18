package baseball;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UserInputException extends IllegalArgumentException {
    boolean lengthCheck(String str) {
        return str.length() != 3;
    }

    boolean duplicationCheck(String str) {
        String[] strArray = str.split("");
        Set<String> strSet = new HashSet<>(Arrays.asList(strArray));

        return strArray.length != strSet.size();
    }

    boolean containZeroCheck(String str) {
        return str.contains("0");
    }

    public void sample(String str) {
        if (lengthCheck(str))
            throw new IllegalArgumentException();
        else if (containZeroCheck(str))
            throw new IllegalArgumentException();
        else if (duplicationCheck(str))
            throw new IllegalArgumentException();
    }
}
