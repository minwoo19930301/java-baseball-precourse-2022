package baseball.controller;


import baseball.model.BallsMatch;
import baseball.model.Computer;
import baseball.model.Player;
import baseball.model.User;
import baseball.view.Output;
import camp.nextstep.edu.missionutils.Console;

/**
 * @author: Minwoo Kim
 * @date 2022/10/02
 */

public class BaseballGuessingGame implements BaseballGame {

    public static final String GAME_LANGUAGE = "KOR";
    public static final int COUNT_OF_BALLS = 3;
    public static final int OBJECTIVE_MATCH = 3;
    public static final String RESTART_YES = "1";
    public static final String RESTART_NO = "2";

    @Override
    public void start() {
        String input;
        do{
            restartableGame();
            System.out.println(Output.RESTART_INQUIRY.getOutput());
            input = Console.readLine();
            if(!(input.equals(RESTART_YES) || input.equals(RESTART_NO))){
                throw new IllegalArgumentException();
            }
        }while(input.equals(RESTART_YES));

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
