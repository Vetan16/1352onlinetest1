/*Singleton design pattern*/

package test;

public class control {
	
	private static control instance;
	
	public static control getInstance(){
		if( instance == null )
			instance = new control();
		
		return instance;
	}
	
	/*ready to voting*/
	public void pressBallotButton(){
		
	}
	
	/* connects cu to bu*/
	public void connectBallotUnit(){
		
	}
	
}
