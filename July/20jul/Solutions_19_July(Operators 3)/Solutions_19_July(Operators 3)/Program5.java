/*Example on game having at least one instance and static variable , and method*/

/*class name : PUBG

*/
class PUBG{
    
    static int totalPlayers=100;// for a same lobby/match number of alive players will be same for all for that lobby
    int kills;
    static void displayRemaining(){
        System.out.println(totalPlayers+" players in the alive.");
    }
    void playerKilled(int kills){
        totalPlayers-=kills;
    }
}

/*Consider this below class as the lobby in which these two players are currently in*/
public class Lobby_1201
{
	public static void main(String[] args) {
	    
	    PUBG player1=new PUBG();
	    player1.playerKilled(5);
	    player1.displayRemaining();
	    
	    PUBG noobmaster = new PUBG();
	    noobmaster.playerKilled(0);
	    noobmaster.displayRemaining();
	}
}