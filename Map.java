public class Map{
	public static int[][] world = new int[][]
			{{1, 1, 1, 1, 9, 1, 5, 5, 5}, 
			{1, 1, 0, 0, 19, 0, 8, 7, 5},
			{1, 11, 0, 0, 20, 0, 7, 6, 10},
			{1, 1, 0, 19, 19, 0, 0, 7, 5},
			{1, 16, 0, 4, 19, 4, 0, 8, 5},
			{1, 17, 19, 4, 3, 4, 0, 0, 1},
			{1, 16, 0, 4, 4, 4, 14, 4, 1},
			{1, 16, 0, 1, 2, 1, 4, 4, 1},
			{1, 1, 1, 1, 1, 1, 1, 1, 1}};
	/**0: plains 1: mountains 2: starting area 3: house 4: woods 5: ocean
	   6: villiage center 7: villiage wall 8: beach 9: exit 10: docks
	   11: cave 12: lit cave 13: lit cave IT 14: campsite 15: campsite IT
	   16: river 17: bridge 18: bridge IT 19: dirt path 20: broken carriage
	   21: carriage IT 22: house UN 23: house ST 24: start ST
	   25: start ST2 26: exit OP 27: docks IT 28: villiage cIT**/
	public static int getMapPos(int playerx, int playery){
		return world[playery][playerx];
	}
	public static void lightCave(){
		world[2][1] = 12;
	}
	public static void takePick(){
		world[2][1] = 13;
	}
	public static void takeLamp(){
		world[6][6] = 15;
	}
	public static void takeRope(){
		world[5][1] = 18;
	}
	public static void takeKey(){
		world[2][4] = 21;
	}
	public static void unlock(){
		world[5][4] = 22;
	}
	public static void statue(){
		world[5][4] = 23;
		world[7][4] = 24;
	}
	public static void statueBreak(){
		world[7][4] = 25;
		world[0][4] = 26;
	}
	public static void takeHand(){
		world[2][8] = 27;
	}
	public static void takeKnife(){
		world[2][7] = 28;
	}
}