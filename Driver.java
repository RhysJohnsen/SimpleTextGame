import java.util.Scanner;

public class Driver{
	
	public static boolean detailed = false;
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		boolean game = true;
		
		Player player = new Player(4, 7);
		Item rope = new Item("Rope", 1, 5);
		Item hand = new Item("Stone Hand", 8, 2);
		Item pick = new Item("Pickaxe", 1, 2);
		Item lamp = new Item("Lamp", 6, 6);
		Item key = new Item("Brass Key", 4, 2);
		Item knife = new Item("Knife", 7, 2);
		
		System.out.println("With the cave collapsed behind you, you find yourself trapped in a valley. Mountains loom over you, and a dense forest lies ahead in the north. (use 'help' to see commands)");
		while(game){
			String input = sc.nextLine();
			if(input.equals("north") || input.equals("go north")){
				if(player.north()){
					System.out.print("You are at ");
					Driver.getDesc(player.getx(), player.gety());
				}
				else{
					System.out.println("You can't go that way.");
				}
			}
			else if(input.equals("east") || input.equals("go east")){
				if(player.east()){
					System.out.print("You are at ");
					Driver.getDesc(player.getx(), player.gety());
				}
				else{
					System.out.println("You can't go that way.");
				}
			}
			else if(input.equals("south") || input.equals("go south")){
				if(player.south()){
					System.out.print("You are at ");
					Driver.getDesc(player.getx(), player.gety());
				}
				else{
					System.out.println("You can't go that way.");
				}
			}
			else if(input.equals("west") || input.equals("go west")){
				if(player.west()){
					System.out.print("You are at ");
					Driver.getDesc(player.getx(), player.gety());
				}
				else{
					System.out.println("You can't go that way.");
				}
			}
			else if(input.equals("look north")){
				System.out.print("To the north, you see ");
				Driver.getDesc(player.getx(), player.gety() - 1);
			}
			else if(input.equals("look east")){
				System.out.print("To the east, you see ");
				Driver.getDesc(player.getx() + 1, player.gety());
			}
			else if(input.equals("look south")){
				System.out.print("To the south, you see ");
				Driver.getDesc(player.getx(), player.gety() + 1);
			}
			else if(input.equals("look west")){
				System.out.print("To the west, you see ");
				Driver.getDesc(player.getx() - 1, player.gety());
			}
			else if(input.equals("look") || input.equals("look around")){
				detailed = true;
				Driver.getDesc(player.getx(), player.gety());
			}
			else if(input.equals("use knife")){
				if(knife.hasItem()){
					if(Map.getMapPos(player.getx(), player.gety()) == 17){
						System.out.println("You cut the rope of the bridge, destroying it once and for all, But you accidentally drop the knife into the river.");
						System.out.println("Knife lost.");
						System.out.println("Rope gained.");
						Map.takeRope();
						knife.itemUse();
						rope.itemGet();
					}
					else{
						System.out.println("I don't understand.");
					}
				}
				else{
					System.out.println("I don't understand.");
				}
			}
			else if(input.equals("get knife")){
				if(Map.getMapPos(player.getx(), player.gety()) == 6){
					System.out.println("You pick up the knife.");
					System.out.println("Knife obtained.");
					Map.takeKnife();
					knife.itemGet();
				}
			}
			else if(input.equals("use rope")){
				if(rope.hasItem()){
					if(Map.getMapPos(player.getx(), player.gety()) == 10){
						System.out.println("You lower the rope and pull the hand out of the water. It seems to be made out of stone. The waves have claimed the rope.");
						System.out.println("Rope lost.");
						System.out.println("Stone Hand obtained.");
						Map.takeHand();
						hand.itemGet();
						rope.itemUse();
					}
					else{
						System.out.println("I don't understand.");
					}
				}
				else{
					System.out.println("I don't understand.");
				}
			}
			else if(input.equals("use stone hand")){
				if(hand.hasItem()){
					if(Map.getMapPos(player.getx(), player.gety()) == 22){
						System.out.println("You reunite the hand with the statue, before they quickly turn to dust. You heard a noise that came from the south.");
						System.out.println("Stone hand lost.");
						Map.statue();
						hand.itemUse();
					}
					else{
						System.out.println("I don't understand.");
					}
				}
				else{
					System.out.println("I don't understand.");
				}
			}
			else if(input.equals("get lamp")){
				if(Map.getMapPos(player.getx(), player.gety()) == 14){
					System.out.println("You pick up the lamp.");
					System.out.println("Lamp obtained.");
					Map.takeLamp();
					lamp.itemGet();
				}
			}
			else if(input.equals("use lamp")){
				if(lamp.hasItem()){
					if(Map.getMapPos(player.getx(), player.gety()) == 11){
						System.out.println("You turn on the lamp, lighting up the cave.");
						System.out.println("Lamp lost.");
						Map.lightCave();
						lamp.itemUse();
					}
					else{
						System.out.println("I don't understand.");
					}
				}
				else{
					System.out.println("I don't understand.");
				}
			}
			else if(input.equals("get pickaxe")){
				if(Map.getMapPos(player.getx(), player.gety()) == 12){
					System.out.println("You take the pickaxe");
					System.out.println("Pickaxe obtained.");
					Map.takePick();
					pick.itemGet();
				}
			}
			else if(input.equals("get key")){
				if(Map.getMapPos(player.getx(), player.gety()) == 20){
					System.out.println("You take the key from the trunk.");
					System.out.println("Key obtained.");
					Map.takeKey();
					key.itemGet();
				}
			}
			else if(input.equals("use key")){
				if(key.hasItem()){
					if(Map.getMapPos(player.getx(), player.gety()) == 3){
						System.out.println("You turn the key, and the door swings open. You step inside.");
						System.out.println("Key lost.");
						Map.unlock();
						key.itemUse();
					}
					else{
						System.out.println("I don't understand.");
					}
				}
				else{
					System.out.println("I don't understand.");
				}
			}
			else if(input.equals("use pickaxe")){
				if(pick.hasItem()){
					if(Map.getMapPos(player.getx(), player.gety()) == 24){
						System.out.println("You strike the statue's hand, and it turns to dust. There seems to be a bright light comming from the north.");
						System.out.println("Pickaxe lost.");
						Map.statueBreak();
						pick.itemUse();
					}
					else{
						System.out.println("I don't understand.");
					}
				}
				else{
					System.out.println("I don't understand.");
				}
			}
			else if(input.equals("inventory")){
				String result = "";
				if(rope.hasItem()){
					result += "\nRope";
				}
				if(hand.hasItem()){
					result += "\nStone Hand";
				}
				if(pick.hasItem()){
					result += "\nPickaxe";
				}
				if(lamp.hasItem()){
					result += "\nLamp";
				}
				if(key.hasItem()){
					result += "\nKey";
				}
				if(knife.hasItem()){
					result += "\nKnife";
				}
				System.out.println(result);
			}
			else if(input.equals("help")){
				System.out.println("Commands:");
				System.out.println("quit - quit the game");
				System.out.println("go <direction> - go north, east, south, or west. The word 'go' is optional");
				System.out.println("look - inspect surroundings");
				System.out.println("look <direction> - look north, east, south, or west, without going that direction");
				System.out.println("get <item> - pick up an item");
				System.out.println("inventory - show your items");
				System.out.println("help - show this text");
			}
			else if(input.equals("quit")){
				System.out.println("Goodbye");
				game = false;
			}
			else{
				System.out.println("I don't understand.");
			}
			if(Map.getMapPos(player.getx(), player.gety()) == 26){
				game = false;
				System.out.println("you leave the valley.");
			}
		}
	}
	
	public static void getDesc(int x, int y){
			System.out.print(Tile.getDetails(Map.getMapPos(x, y), detailed) + "\n");
			detailed = false;
	}
}