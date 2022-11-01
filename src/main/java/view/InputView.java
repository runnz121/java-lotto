package view;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import domain.Lotto;
import domain.ManualLottos;

public class InputView {

	private static final Scanner sc = new Scanner(System.in);

	public static int inputPurchaseMoney() {

		System.out.println("구입금액을 입력해 주세요.");
		int purchaseMoney = sc.nextInt();
		sc.nextLine();
		return purchaseMoney;
	}

	public static int inputPurchaseManualLottoCount() {
		System.out.println("수동으로 구매할 로또 수를 입력해 주세요.");
		int purchaseManualLottoCount =  sc.nextInt();
		sc.nextLine();
		return purchaseManualLottoCount;
	}

	public static ManualLottos inputManualLottoNumber(int purchaseCount) {
		System.out.println("수동으로 구매할 번호를 입력해 주세요.");
		ManualLottos manualLottos = new ManualLottos();
		IntStream
			.rangeClosed(1, purchaseCount)
			.mapToObj(it -> sc.nextLine())
			.map(Lotto::from)
			.forEach(manualLottos::collectManualLotto);
		return manualLottos;
	}

	public static String inputLastWeekWinnerNumber() {
		System.out.println("지난 주 당첨 번호를 입력해 주세요.");
		return sc.nextLine();
	}

	public static String inputBonusNumber() {

		System.out.println("보너스 볼을 입력해 주세요.");
		return sc.nextLine();
	}

}
