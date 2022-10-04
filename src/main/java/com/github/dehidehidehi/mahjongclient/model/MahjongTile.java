package com.github.dehidehidehi.mahjongclient.model;

public record MahjongTile(String value) {
	
	public static MahjongTile of(MahjongTileEnum tileEnum) {
		return new MahjongTile(tileEnum.name());
	}
}
