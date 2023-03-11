public class Tile{
	public static boolean detailed = false;
	public static String getDetails(int terrainType, boolean detailedIn){
		detailed = detailedIn;
		if(terrainType == 0){
			return Tile.type0();
		}
		if(terrainType == 1){
			return Tile.type1();
		}
		if(terrainType == 2){
			return Tile.type2();
		}
		if(terrainType == 3){
			return Tile.type3();
		}
		if(terrainType == 4){
			return Tile.type4();
		}
		if(terrainType == 5){
			return Tile.type5();
		}
		if(terrainType == 6){
			return Tile.type6();
		}
		if(terrainType == 7){
			return Tile.type7();
		}
		if(terrainType == 8){
			return Tile.type8();
		}
		if(terrainType == 9){
			return Tile.type9();
		}
		if(terrainType == 10){
			return Tile.type10();
		}
		if(terrainType == 11){
			return Tile.type11();
		}
		if(terrainType == 12){
			return Tile.type12();
		}
		if(terrainType == 13){
			return Tile.type13();
		}
		if(terrainType == 14){
			return Tile.type14();
		}
		if(terrainType == 15){
			return Tile.type15();
		}
		if(terrainType == 16){
			return Tile.type16();
		}
		if(terrainType == 17){
			return Tile.type17();
		}
		if(terrainType == 18){
			return Tile.type18();
		}
		if(terrainType == 19){
			return Tile.type19();
		}
		if(terrainType == 20){
			return Tile.type20();
		}
		if(terrainType == 21){
			return Tile.type21();
		}
		if(terrainType == 22){
			return Tile.type22();
		}
		if(terrainType == 23){
			return Tile.type23();
		}
		if(terrainType == 24){
			return Tile.type24();
		}
		if(terrainType == 25){
			return Tile.type25();
		}
		if(terrainType == 26){
			return Tile.type26();
		}
		if(terrainType == 27){
			return Tile.type27();
		}
		if(terrainType == 28){
			return Tile.type28();
		}
		
		return "";
	}
	
	public static String type0(){
		if(!detailed){
			return "a grassy meadow";
		}
		if(detailed){
			detailed = false;
			return "You stand at a grassy meadow. There is nothing of note besides the absence of any animal life.";
		}
		return "";
	}
	
	public static String type1(){
		if(!detailed){
			return "impassable Mountains";
		}
		if(detailed){
			detailed = false;
			return "You should not be here.";
		}
		return "";
	}
	
	public static String type2(){
		if(!detailed){
			return "where you started your adventure";
		}
		if(detailed){
			detailed = false;
			return "The collapsed cave to the south leads to a perfectly circular clearing between the mountains.";
		}
		return "";
	}
	
	public static String type3(){
		if(!detailed){
			return "an old abandoned house";
		}
		if(detailed){
			detailed = false;
			return "Despite how rotted the exterior is, you can't break your way inside. However, the door does have a brass lock.";
		}
		return "";
	}
	
	public static String type4(){
		if(!detailed){
			return "a thick forest";
		}
		if(detailed){
			detailed = false;
			return "The trees seem to close in around you as you hear the leaves shiver in the wind.";
		}
		return "";
	}
	
	public static String type5(){
		if(!detailed){
			return "a restless ocean";
		}
		if(detailed){
			detailed = false;
			return "The violent waves seem very unforgiving. If something were to enter the water, it would surely be lost for years.";
		}
		return "";
	}
	
	public static String type6(){
		if(!detailed){
			return "the heart of the ruined villiage";
		}
		if(detailed){
			detailed = false;
			return "The cold stone foundations of an old fishing villiage lay at your feet. There is a soft glint of a knife in the rubble.";
		}
		return "";
	}
	
	public static String type7(){
		if(!detailed){
			return "the outskirt of a ruined villiage";
		}
		if(detailed){
			detailed = false;
			return "Decayed farms surround you. The collapsed walls of the villiage would be easy to traverse.";
		}
		return "";
	}
	
	public static String type8(){
		if(!detailed){
			return "a sandy beach";
		}
		if(detailed){
			detailed = false;
			return "The barren sands shift under the tide. It feels as though you could sink in at any moment.";
		}
		return "";
	}
	
	public static String type9(){
		if(!detailed){
		return "a gap in the mountains";
		}
		if(detailed){
			detailed = false;
			return "The barren sands shift under the tide. It feels as though you could sink in at any moment.";
		}
		return "";
	}
	
	public static String type10(){
		if(!detailed){
			return "some abandoned docks";
		}
		if(detailed){
			detailed = false;
			return "The rotten wood cries beneath your feet. It's a miracle that they can still suspend you above the watery death that awaits below. A still grey hand slowly raises out of the water. Maybe someone needs help.";
		}
		return "";
	}
	
	public static String type11(){
		if(!detailed){
			return "a dark cave";
		}
		if(detailed){
			detailed = false;
			return "It is too dark to see.";
		}
		return "";
	}
	
	public static String type12(){
		if(!detailed){
			return "a small mine";
		}
		if(detailed){
			detailed = false;
			return "The flicker of your lamp reveals a pickaxe that lies in the corner of the otherwise empty cave.";
		}
		return "";
	}
	
	public static String type13(){
		if(!detailed){
			return "a small mine";
		}
		if(detailed){
			detailed = false;
			return "The windo blows through the empty cave.";
		}
		return "";
	}
	
	public static String type14(){
		if(!detailed){
			return "an old campsite";
		}
		if(detailed){
			detailed = false;
			return "The Tattered tents lay on the ground. A rusted lamp sits on a nearby stump. It still has oil.";
		}
		return "";
	}
	
	public static String type15(){
		if(!detailed){
			return "an old campsite";
		}
		if(detailed){
			detailed = false;
			return "The Tattered tents lay on the ground.";
		}
		return "";
	}
	
	public static String type16(){
		if(!detailed){
			return "a  winding river.";
		}
		if(detailed){
			detailed = false;
			return "you sand at a riverbank. Apart from collapsed houses, there doesn't seem to be much on the other side.";
		}
		return "";
	}
	
	public static String type17(){
		if(!detailed){
			return "a broken rope bridge.";
		}
		if(detailed){
			detailed = false;
			return "Although they have snapped long ago, the ropes here still seem strong. perhaps you could cut what's left.";
		}
		return "";
	}
	
	public static String type18(){
		if(!detailed){
			return "a broken rope bridge.";
		}
		if(detailed){
			detailed = false;
			return "The planks of what's left of the bridge scatter the riverbank.";
		}
		return "";
	}
	
	public static String type19(){
		if(!detailed){
			return "an empty dirt path.";
		}
		if(detailed){
			detailed = false;
			return "The dusty path was clearly long forgotten.";
		}
		return "";
	}
	
	public static String type20(){
		if(!detailed){
			return "a broken carriage";
		}
		if(detailed){
			detailed = false;
			return "Along the path is a broken carriage. It holds a trunk with a brass key.";
		}
		return "";
	}
	
	public static String type21(){
		if(!detailed){
			return "a broken carriage";
		}
		if(detailed){
			detailed = false;
			return "There is no hope in fixing this carriage.";
		}
		return "";
	}
	
	public static String type22(){
		if(!detailed){
			return "the abandoned house";
		}
		if(detailed){
			detailed = false;
			return "The empty shelves are covered with dust. there is a small kneeling statue in the center off the room. It is missing a hand.";
		}
		return "";
	}
	
	public static String type23(){
		if(!detailed){
			return "the abandoned house";
		}
		if(detailed){
			detailed = false;
			return "You feel uneasy looking at the pile of dust where the statue once sat.";
		}
		return "";
	}
	
	public static String type24(){
		if(!detailed){
			return "the feet of a giant statue.";
		}
		if(detailed){
			detailed = false;
			return "In front of the collapsed cave is a giant statue exactly like the small one. The base is carved with the words: 'Give me my brother's injury'.";
		}
		return "";
	}
	
	public static String type25(){
		if(!detailed){
			return "the feet of the giant statue.";
		}
		if(detailed){
			detailed = false;
			return "There is a pile of dust where the statue's hand was.";
		}
		return "";
	}
	
	public static String type26(){
		if(!detailed){
			return "the path that leaves the valley.";
		}
		if(detailed){
			detailed = false;
			return "just a few more steps before you leave this cursed land.";
		}
		return "";
	}
	
	public static String type27(){
		if(!detailed){
			return "some abandoned docks";
		}
		if(detailed){
			detailed = false;
			return "The ocean oddly seems more calm now.";
		}
		return "";
	}
	
	public static String type28(){
		if(!detailed){
			return "the heart of the ruined villiage";
		}
		if(detailed){
			detailed = false;
			return "The cold stone foundations of an old fishing villiage lay at your feet.";
		}
		return "";
	}
}