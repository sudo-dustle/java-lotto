package lotto;

import java.util.List;

public class WinNumbers {
    private List<Integer> winNumbers;
    private int bonusNumber;

    public WinNumbers(List<Integer> winNumbers, int bonusNumber) {
        this.winNumbers = winNumbers;
        this.bonusNumber = bonusNumber;
    }
}
