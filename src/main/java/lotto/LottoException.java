package lotto;

import java.util.regex.Pattern;

public class LottoException {

	public void checkUnitMoney(String money, int price) throws IllegalArgumentException {
		if (Integer.parseInt(money) % price != 0) {
			throw new IllegalArgumentException(Constant.UNIT_MONEY_ERROR);
		}
	}

	public void checkMissMatch(String money) throws IllegalArgumentException {
		if (!Pattern.matches("^[0-9]*$", money)) {
			throw new IllegalArgumentException(Constant.MONEY_MISSMATCH_ERROR);
		}
	}

	public void checkMoneySize(String money) throws IllegalArgumentException {
		if (Integer.parseInt(money) < 1) {
			throw new IllegalArgumentException(Constant.MONEY_RANGE_ERROR);
		}
	}
	
}
