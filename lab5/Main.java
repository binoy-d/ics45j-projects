package labs.lab5;

import java.awt.Rectangle;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monster monster = new Monster();
		Dragon dragon = new Dragon(true);
		Zombie zombie = new Zombie(10.0);
		EvilRobot robot = new EvilRobot(1000);
		MadClown clown = new MadClown(false);
		PotOfGold gold = new PotOfGold(10);
		TreasureChest chest = new TreasureChest(1000);
		GameElement[] gameElements = {
		  monster,
		  dragon,
		  zombie,
		  robot,
		  clown,
		  gold,
		  chest
		};
		Stompable[] stompables = {
		  monster,
		  dragon,
		  zombie,
		  robot
		};
		for (GameElement element : gameElements) {
		  element.tick();
		  element.tick();
		}
		System.out.println(((Monster)gameElements[0]).getHealth()); // 80
		System.out.println(((Monster)gameElements[0]).getColor()); // blue 
		System.out.println(((Dragon)gameElements[1]).getHealth()); // 60 
		System.out.println(((Dragon)gameElements[1]).isFireBreathing()); // true 
		System.out.println(((PotOfGold)gameElements[5]).getNumPieces()); // 12 
		System.out.println(((TreasureChest)gameElements[6]).getWeight()); // 902.5
		for (Stompable item : stompables) {
		  item.stompOn();
		}
		// above stompOn() calls should should return: 100, -50, 0, 0, -10, respectively
		System.out.println(((Monster)gameElements[0]).getHealth()); // 0 
		System.out.println(((Monster)gameElements[0]).getColor()); // red 
		System.out.println(((Dragon)gameElements[1]).getHealth()); // 100 
		System.out.println(((Dragon)gameElements[1]).isFireBreathing()); // false
		
		
		Telemarketer telemarketer = new Telemarketer("Jose");
		Sibling s1 = new Sibling("Mollie");
		Sibling s2 = new Sibling("Corey");
		Pest[] pests = {
		  telemarketer,
		  s1,
		  s2,
		  new Ad(),
		  new Ad(),
		  new Fly()
		};
		for (Pest p : pests) {
		  System.out.println(p.annoy());
		}

		// ===========================
		// The above code prints:
		// Call during dinner
		// Continue talking when you say no
		// Tease you about your insecurities
		// Laugh at you when you are mad
		// Tease you about your insecurities
		// Laugh at you when you are mad
		// Block something you really want to see
		// Don't go away even when you click X
		// Block something you really want to see
		// Don't go away even when you click X
		// Fly around your head
		// Land on things
		Person[] people = { telemarketer, s1, s2 };
		Arrays.sort(people); // people is now sorted: Corey, Jose, Mollie
		
		Measurer m = new PerimeterMeasurer();
		Filter filter = new PerimeterFilter();
		Rectangle rects[] = new Rectangle[4];
		rects[0] = new Rectangle(5, 10, 20, 30);
		rects[1] = new Rectangle(22, 3, 15, 20);
		rects[2] = new Rectangle(10, 20, 30, 40);
		rects[3] = new Rectangle(20, 30, 5, 10);
		System.out.println(Data.average(rects, m, filter)); // should return 66.66666666666667
		System.out.println((Rectangle)Data.max(rects, m, filter)); // should return java.awt.Rectangle[x=5,y=10,width=20,height=30]
	}

}
