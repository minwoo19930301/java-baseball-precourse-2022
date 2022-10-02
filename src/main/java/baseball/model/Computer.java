package baseball.model;
import static baseball.controller.BaseballGuessingGame.COUNT_OF_BALLS;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.HashSet;
import java.util.Set;

/**
 * @author: Minwoo Kim
 * @date 2022/10/03
 */
public class Computer extends Player {

    public Computer() {
        initBalls();
    }

    private int generateUniqueDigitedNumber(){
        Set<Integer> unique = new HashSet<>();
        while(unique.size()<COUNT_OF_BALLS){
            unique.add(Randoms.pickNumberInRange(0,9));
        }
        StringBuilder temp = new StringBuilder();
        for(Integer integer : unique){
            temp.append(integer.toString());
        }
        return Integer.parseInt(temp.toString());
    }

    @Override
    public void initBalls() {
        int uniqueDigitNum = generateUniqueDigitedNumber();
        this.getBalls().setBallNums(uniqueDigitNum);
    }

}
