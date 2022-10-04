package shanten.api;
import com.github.dehidehidehi.mahjongclient.model.MahjongHand;
import com.github.dehidehidehi.mahjongclient.model.MahjongTile;
import com.github.dehidehidehi.mahjongclient.model.MahjongTileEnum;
import com.github.dehidehidehi.mahjongclient.shanten.api.ShantenCalculator;
import com.github.dehidehidehi.mahjongclient.shanten.internal.ShantenCalculatorImpl;

import java.util.List;

public class ShantenCalculatorTest {
	
	ShantenCalculator shantenCalculator = new ShantenCalculatorImpl();
	
	private static MahjongHand generateIishantenHand() {
		List<MahjongTile> tiles = List.of(
				  MahjongTile.of(MahjongTileEnum.GREEN_DRAGON),
				  MahjongTile.of(MahjongTileEnum.GREEN_DRAGON),
				  MahjongTile.of(MahjongTileEnum.GREEN_DRAGON),
				  MahjongTile.of(MahjongTileEnum.RED_DRAGON),
				  MahjongTile.of(MahjongTileEnum.RED_DRAGON),
				  MahjongTile.of(MahjongTileEnum.RED_DRAGON),
				  MahjongTile.of(MahjongTileEnum.MANZU_1),
				  MahjongTile.of(MahjongTileEnum.WHITE_DRAGON),
				  MahjongTile.of(MahjongTileEnum.WHITE_DRAGON),
				  MahjongTile.of(MahjongTileEnum.SOU_1),
				  MahjongTile.of(MahjongTileEnum.SOU_1),
				  MahjongTile.of(MahjongTileEnum.SOU_1),
				  MahjongTile.of(MahjongTileEnum.SOU_2)
		);
		return new MahjongHand(tiles);
	}
	
}
