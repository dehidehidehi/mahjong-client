package shanten.api.testhands;
import com.github.dehidehidehi.mahjongclient.model.MahjongHand;

/**
 * The worst shanten count is always 6.
 * **/
public class OtherShantenHands extends AbstractShantenHands {
	
	@Override protected MahjongHand basic() {
		throw new UnsupportedOperationException("Not implemented");
	}
	
	@Override protected MahjongHand sevenPairs() {
		throw new UnsupportedOperationException("Not implemented");
	}
	
	@Override protected MahjongHand kokushiMusou() {
		throw new UnsupportedOperationException("Not implemented");
	}
}