public class Item{
	
	String name;
	int posx;
	int posy;
	boolean obtained;
	
	public Item(String nameIn, int posxIn, int posyIn){
		name = nameIn;
		posx = posxIn;
		posy = posyIn;
		obtained = false;
	}
	
	public Item(String nameIn){
		name = nameIn;
		obtained = false;
	}
	
	public int getx(){
		return posx;
	}
	
	public int getu(){
		return posy;
	}
	
	public void itemGet(){
		obtained = true;
	}
	
	public void itemUse(){
		obtained = false;
	}
	
	public boolean hasItem(){
		return obtained;
	}
}