package baseball.controller;


import baseball.model.BallsMatch;
import baseball.model.Computer;
import baseball.model.Player;
import baseball.model.User;

/**
 * @author: Minwoo Kim
 * @date 2022/10/02
 */

public class BaseballGuessingGame implements BaseballGame {

    public static final String GAME_LANGUAGE = "KOR";
    public static final int COUNT_OF_BALLS = 3;
    public static final int OBJECTIVE_MATCH = 3;

    @Override
    public void start() {
        restartableGame();
    }

    public void restartableGame(){
        Player computer = new Computer();
        Player user = new User();
        BallsMatch ballsMatch;
        do{
            ballsMatch = new BallsMatch();
            user.initBalls();
        }while(ballsMatch.matchAllBalls(computer, user));
    }
}
