package service;

import domain.AutoLottos;
import domain.Money;

public class LottoIssueMachine {

    private static final int LOTTO_PRICE = 1000;

    private final RandomLottoGenerator randomLottoGenerator;

    public LottoIssueMachine(RandomLottoGenerator randomLottoGenerator) {
        this.randomLottoGenerator = randomLottoGenerator;
    }

    public AutoLottos purchaseLotto(Money money, int manualLottoBuyCounts) {

        int purchasedCount = money.getMoney() / LOTTO_PRICE;

        AutoLottos autoLottos = new AutoLottos();
        autoLottos.buyRandomLottos(randomLottoGenerator, purchasedCount);
        return autoLottos;
    }

}
