package by.htp.cammomile.run;

import by.htp.cammomile.bean.Bud;
import by.htp.cammomile.bean.Flower;
import by.htp.cammomile.logic.BotanicEncyclopedia;
//Создать объект класса Цветок, используя классы Лепесток, Бутон, Стебель.
//Методы: подрасти, расцвести, завять.
//Выводить на консоль информацию о состоянии цветка после каждого этапа жц.
// Создать класс Гадалка и метод погадать на ромашке. 
// Гадалка умеет гадать на разные события (любовь, удача, и т.д.),
// для каждого события у гадалки есть набор вариантов ответов (от 3х до 11)
// пример: гадание на любовь: любит, не любит, бросит, поцелует и т.д.
// для каждого варианта у ромашки гадалка отрывает лепесток. 
// Последний оторванный лепесток 
// - есть результат гадания
//Создать цветок "Ромашка" и погадать :)
public class Main {
	
	public static void main(String[] args){
		
		BotanicEncyclopedia enc = new BotanicEncyclopedia();
		
		System.out.println("-------------------");
		System.out.println("New flower born");
		Flower flower = new Flower("Cammomile", 10, 1);
		enc.printFlowerInfo(flower);
		
		System.out.println("-------------------");
		System.out.println("Flower grow");
		flower.grow(25, 3, 5);
		enc.printFlowerInfo(flower);
		
		System.out.println("-------------------");
		System.out.println("Flower bloom");
		flower.bloom(8, "yellow");
		enc.printFlowerInfo(flower);
	}

}
