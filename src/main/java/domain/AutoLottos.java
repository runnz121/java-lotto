package domain;

import java.util.ArrayList;
import java.util.List;

import service.RandomLottoGenerator;

public class AutoLottos {

    private List<Lotto> autoLottoNumbers = new ArrayList<>();

    public void buyRandomLottos(RandomLottoGenerator randomLottoGenerator, int purchaseCount) {
        for (int i = 0; i < purchaseCount; i++) {
            autoLottoNumbers.add(randomLottoGenerator.createRandomLotto());
        }
    }

    public List<Lotto> getAutoLottoNumbers() {
        return autoLottoNumbers;
    }
}
