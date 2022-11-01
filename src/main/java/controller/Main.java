package controller;

import domain.BonusNumber;
import domain.Lotto;
import domain.LottoResult;
import domain.AutoLottos;
import domain.ManualLottos;
import domain.Money;
import service.LottoIssueMachine;
import service.RandomLottoGenerator;
import view.InputView;
import view.ResultView;

public class Main {

    public static void main(String[] args) {

        int money = InputView.inputPurchaseMoney();
        int manualLottoCounts = InputView.inputPurchaseManualLottoCount();
        ManualLottos manualLottos = InputView.inputManualLottoNumber(manualLottoCounts);

        Money purchasedMoney = new Money(money);

        RandomLottoGenerator randomLottoGenerator = new RandomLottoGenerator();
        LottoIssueMachine lottoIssueMachine = new LottoIssueMachine(randomLottoGenerator);
        AutoLottos createdRandomAutoLottos = lottoIssueMachine.purchaseLotto(purchasedMoney, manualLottoCounts);
        ResultView.printPurchasedLottos(createdRandomAutoLottos, manualLottos);

        String winnerInputValue = InputView.inputLastWeekWinnerNumber();
        Lotto winnerNumber = new Lotto(winnerInputValue);

        String bonusInputValue = InputView.inputBonusNumber();
        BonusNumber bonusNumber = new BonusNumber(bonusInputValue);

        LottoResult lottoResult = new LottoResult();
        lottoResult.findMatchLottoCount(winnerNumber, createdRandomAutoLottos, bonusNumber);
        ResultView.winnerStatistic(lottoResult, purchasedMoney);

    }
}
