import java.util.stream.IntStream;

import static java.lang.String.format;
import static java.lang.System.out;

public class FizzBuzzerWithoutAnyConditional implements FizzBuzzer {
    public Object run() {
        String[] s = {"FizzBuzz", "Fizz", "Buzz", "%s"};
        int[] fizzInd = {0, 2, 2};
        int[] buzzInd = {0, 1, 1, 1, 1};

        IntStream.rangeClosed(1, 100).forEach(n -> out.println(format(s[fizzInd[n % 3] + buzzInd[n % 5]], n)));
        return null;
    }
}
