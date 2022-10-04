package shanten.api.testhands;
import com.github.dehidehidehi.mahjongclient.model.MahjongHand;
import com.github.dehidehidehi.mahjongclient.model.MahjongTile;
import com.github.dehidehidehi.mahjongclient.model.MahjongTileEnum;

import java.util.List;

public class TenpaiHands extends AbstractShantenHands {
	
	@Override public MahjongHand basic() {
		return new MahjongHand(List.of(
				  MahjongTile.of(MahjongTileEnum.GREEN_DRAGON),
				  MahjongTile.of(MahjongTileEnum.GREEN_DRAGON),
				  MahjongTile.of(MahjongTileEnum.GREEN_DRAGON),
				  MahjongTile.of(MahjongTileEnum.RED_DRAGON),
				  MahjongTile.of(MahjongTileEnum.RED_DRAGON),
				  MahjongTile.of(MahjongTileEnum.RED_DRAGON),
				  MahjongTile.of(MahjongTileEnum.WHITE_DRAGON),
				  MahjongTile.of(MahjongTileEnum.WHITE_DRAGON),
				  MahjongTile.of(MahjongTileEnum.WHITE_DRAGON),
				  MahjongTile.of(MahjongTileEnum.SOU_1),
				  MahjongTile.of(MahjongTileEnum.SOU_1),
				  MahjongTile.of(MahjongTileEnum.SOU_1),
				  MahjongTile.of(MahjongTileEnum.SOU_2)
		));
	}
	
	@Override public MahjongHand sevenPairs() {
		return new MahjongHand(List.of(
				  MahjongTile.of(MahjongTileEnum.GREEN_DRAGON),
				  MahjongTile.of(MahjongTileEnum.GREEN_DRAGON),
				  MahjongTile.of(MahjongTileEnum.RED_DRAGON),
				  MahjongTile.of(MahjongTileEnum.RED_DRAGON),
				  MahjongTile.of(MahjongTileEnum.WHITE_DRAGON),
				  MahjongTile.of(MahjongTileEnum.WHITE_DRAGON),
				  MahjongTile.of(MahjongTileEnum.SOU_1),
				  MahjongTile.of(MahjongTileEnum.SOU_1),
				  MahjongTile.of(MahjongTileEnum.SOU_2),
				  MahjongTile.of(MahjongTileEnum.SOU_2),
				  MahjongTile.of(MahjongTileEnum.MANZU_1),
				  MahjongTile.of(MahjongTileEnum.MANZU_1),
				  MahjongTile.of(MahjongTileEnum.MANZU_2)
		));
	}
	
	@Override public MahjongHand kokushiMusou() {
		return new MahjongHand(List.of(
				  MahjongTile.of(MahjongTileEnum.GREEN_DRAGON),
				  MahjongTile.of(MahjongTileEnum.RED_DRAGON),
				  MahjongTile.of(MahjongTileEnum.WHITE_DRAGON),
				  MahjongTile.of(MahjongTileEnum.SOU_1),
				  MahjongTile.of(MahjongTileEnum.SOU_9),
				  MahjongTile.of(MahjongTileEnum.MANZU_1),
				  MahjongTile.of(MahjongTileEnum.MANZU_9),
				  MahjongTile.of(MahjongTileEnum.PIN_1),
				  MahjongTile.of(MahjongTileEnum.PIN_9),
				  MahjongTile.of(MahjongTileEnum.EAST),
				  MahjongTile.of(MahjongTileEnum.SOUTH),
				  MahjongTile.of(MahjongTileEnum.WEST)
		));
	}
}