package baseball.controller;


import baseball.model.Computer;
import baseball.model.Player;
import baseball.model.User;

/**
 * @author: Minwoo Kim
 * @date 2022/10/02
 */

public class BaseballGuessingGame implements BaseballGame {

    public final static String GAME_LANGUAGE = "KOR";

    @Override
    public void start() {
        restartableGame();
    }

    public void restartableGame(){
        Player computer = new Computer();

    }
}
