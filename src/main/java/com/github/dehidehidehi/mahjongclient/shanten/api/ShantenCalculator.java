package com.github.dehidehidehi.mahjongclient.shanten.api;
import com.github.dehidehidehi.mahjongclient.model.MahjongHand;

public interface ShantenCalculator {
	
	int computeShanten(MahjongHand mahjongHand);
	
}
