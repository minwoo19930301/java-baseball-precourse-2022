package baseball.view;


import static baseball.controller.BaseballGuessingGame.GAME_LANGUAGE;

/**
 * @enum in case other language is needed
 * @author: Minwoo Kim
 * @date 2022/10/03
 */
public enum Output {
    NUMBER_REQUEST("숫자를 입력해주세요 : ",""),
    STRIKE("스트라이크", ""),
    BALL("볼", ""),
    NOTHING("낫싱", ""),
    SUCCESS ("3개의 숫자를 모두 맞히셨습니다! 게임 종료", ""),
    RESTART_INQUIRY("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.", "");

    private final String kor;
    private final String eng;

    Output(String kor, String eng) {
        this.kor = kor;
        this.eng = eng;
    }

    public String getOutput() {
        if("KOR".equals(GAME_LANGUAGE)){
            return kor;
        }
        if("ENG".equals(GAME_LANGUAGE)){
            return eng;
        }
        return null;
    }

}
