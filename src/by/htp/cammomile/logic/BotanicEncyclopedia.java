package by.htp.cammomile.logic;

import by.htp.cammomile.bean.Bud;
import by.htp.cammomile.bean.Flower;
import by.htp.cammomile.bean.Leaf;

public class BotanicEncyclopedia {

	public void printFlowerInfo(Flower flower) {

		if (flower != null) {
			System.out.println("Title: " + flower.getTitle());
			System.out.println("bud size, color: " + flower.getBud().getSize() 
					+ ", " + flower.getBud().getColor());
			System.out.println("stem height, width: " + flower.getStem().getHeight() 
					+ ", " + flower.getStem().getWidth());
			printLeaves(flower.getBud());
		}
	}

	private void printLeaves(Bud bud) {

		Leaf[] leaves = bud.getLeaves();
		if (bud != null && leaves != null) {
			for(Leaf leaf: leaves){
				System.out.println("leaf color, shape: " + leaf.getColor() 
				+ ", " + leaf.getShape());
			}
		}
	}
}
