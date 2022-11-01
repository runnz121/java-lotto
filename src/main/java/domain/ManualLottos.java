package domain;

import java.util.ArrayList;
import java.util.List;

public class ManualLottos {

	private List<Lotto> manualLottoNumbers = new ArrayList<>();

	public void collectManualLotto(Lotto manualLotto) {
		manualLottoNumbers.add(manualLotto);
	}

	public List<Lotto> getManualLottoNumbers() {
		return manualLottoNumbers;
	}
}
