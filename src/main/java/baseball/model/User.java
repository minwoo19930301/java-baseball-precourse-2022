package baseball.model;

import static baseball.controller.BaseballGuessingGame.COUNT_OF_BALLS;

import camp.nextstep.edu.missionutils.Console;

/**
 * @author: Minwoo Kim
 * @date 2022/10/03
 */
public class User extends Player {

    private void validateInput(String input) {
        try{
            Integer.parseInt(input);
        }catch(NumberFormatException e){
            throw new IllegalArgumentException();
        }
    }

    //a constructor like method intended to call multiple times
    @Override
    public void initBalls() {
        String input = Console.readLine();
        validateInput(input);
        this.getBalls().setBallNums(Integer.parseInt(input));
    }


}
