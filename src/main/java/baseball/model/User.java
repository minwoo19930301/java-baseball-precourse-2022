package baseball.model;

import baseball.view.Output;
import camp.nextstep.edu.missionutils.Console;

/**
 * @author: Minwoo Kim
 * @date 2022/10/03
 */
public class User extends Player {

    private void validateInput(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void initBalls() {
        System.out.print(Output.NUMBER_REQUEST.getOutput());
        String input = Console.readLine();
        validateInput(input);
        this.getBalls().setBallNums(Integer.parseInt(input));
    }


}
