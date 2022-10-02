package baseball;

import baseball.controller.BaseballGame;
import baseball.controller.BaseballGuessingGame;

public class Application {
    public static void main(String[] args) {
        BaseballGame gameLauncher = new BaseballGuessingGame();
        gameLauncher.start();
    }
}
