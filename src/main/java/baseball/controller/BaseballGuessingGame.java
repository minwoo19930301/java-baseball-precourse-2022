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
    public static final int COUNT_OF_BALLS = 3;

    @Override
    public void start() {
        restartableGame();
    }

    public void restartableGame(){
        Player computer = new Computer();
        Player user = new User();
        System.out.println(user);
    }
}
