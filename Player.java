public class Player{
	
	public int playerx;
	public int playery;
	public Player(int playerxIn, int playeryIn){
		playerx = playerxIn;
		playery = playeryIn;
	}
	
	public boolean north(){
		if(playery > 0 && this.validMoveNorth()){
			playery--;
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean south(){
		if(playery < 8 && this.validMoveSouth()){
			playery++;
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean east(){
		if(playerx < 8 && this.validMoveEast()){
			playerx++;
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean west(){
		if(playerx > 0 && this.validMoveWest()){
			playerx--;
			return true;
		}
		else{
			return false;
		}
	}
	
	public int getx(){
		return playerx;
	}
	
	public int gety(){
		return playery;
	}
	
	public boolean validMoveNorth(){
		
		if(Map.getMapPos(playerx, playery - 1) == 1 || Map.getMapPos(playerx, playery - 1) == 5 || Map.getMapPos(playerx, playery - 1) == 9){
			return false;
		}
		else{
			return true;
		}
	}
	
	public boolean validMoveSouth(){
		
		if(Map.getMapPos(playerx, playery + 1) == 1 || Map.getMapPos(playerx, playery + 1) == 5 || Map.getMapPos(playerx, playery + 1) == 9){
			return false;
		}
		else{
			return true;
		}
	}
	
	public boolean validMoveEast(){
		
		if(Map.getMapPos(playerx + 1, playery) == 1 || Map.getMapPos(playerx + 1, playery) == 5 || Map.getMapPos(playerx + 1, playery) == 9){
			return false;
		}
		else{
			return true;
		}
	}
	
	public boolean validMoveWest(){
		
		if(Map.getMapPos(playerx - 1, playery) == 1 || Map.getMapPos(playerx - 1, playery) == 5 || Map.getMapPos(playerx - 1, playery) == 9){
			return false;
		}
		else{
			return true;
		}
	}
}