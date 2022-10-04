package shanten.api.testhands;
import com.github.dehidehidehi.mahjongclient.model.MahjongHand;

public abstract class AbstractShantenHands {
	abstract protected MahjongHand basic();
	abstract protected MahjongHand sevenPairs();
	
	/** 13-orphans: special hand which only requires 13 tiles. **/
	abstract protected MahjongHand kokushiMusou();
}
