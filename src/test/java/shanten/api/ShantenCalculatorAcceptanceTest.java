package shanten.api;
import com.github.dehidehidehi.mahjongclient.shanten.api.ShantenCalculator;
import com.github.dehidehidehi.mahjongclient.shanten.internal.ShantenCalculatorImpl;
import org.junit.jupiter.api.Test;
import shanten.api.testhands.TenpaiHands;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

class ShantenCalculatorAcceptanceTest {
	
	ShantenCalculator calc = new ShantenCalculatorImpl();
	
	@Test
	void shouldReturn1ForBasicTenpaiHand() {
		TenpaiHands tenpaiHands = new TenpaiHands();
		int expected = 1;
		assertThat(calc.computeShanten(tenpaiHands.basic())).isEqualTo(expected);
		assertThat(calc.computeShanten(tenpaiHands.sevenPairs())).isEqualTo(expected);
		assertThat(calc.computeShanten(tenpaiHands.kokushiMusou())).isEqualTo(expected);
	}
	
	@Test
	void shouldReturn2ForBasicIishantenHand() {
		fail("Test not written.");
	}
	
	@Test
	void shouldReturn3ForBasicRyanshantenHand() {
		fail("Test not written.");
	}
	
	@Test
	void shouldReturn4ForBasicSanshantenHand() {
		fail("Test not written.");
	}
	
	@Test
	void shouldReturn2ForSpecialIishantenSevenPairsHand() {
		fail("Test not written.");
	}
	
	@Test
	void shouldReturn2ForSpecialKokushiMusouHand() {
		fail("Test not written.");
	}
	
}