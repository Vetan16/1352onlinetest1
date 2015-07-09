/*Singleton design pattern*/
package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class control {
	
	private String constituency;
	
	private ArrayList<Integer> voteCounter;
	
	private VotePermissionState VAState = new block();
	
	private Integer totalCandidates;
	
	/* reference to the ballot unit */
	private ballot ballotUnit;
	
	/* sole instance */
	private static control instance;
	
	
	public static control getInstance(){
		if( instance == null )
			instance = new control();
		
		return instance;
	}
	
	private control(){
		this.voteCounter = new ArrayList<Integer>();
	}
	
	
	public void pressBallotButton(){
		this.VAState.switchState(this);
	}
	
	
	public void connectBallotUnit( ballot ballot ){
		this.ballotUnit = ballotUnit;
	}
	
	
	public void detachBallotUnit(){
		this.ballot = null;
	}
	
	
	public void casteAVote( Integer candidate ){
		
		if( this.VAState instanceof allow ){
			this.voteCounter.set(candidate, this.voteCounter.get(candidate)+1);
			this.switchVotePermission();
		}
		
	}


	public void setTotalCandidates( Integer total ){
		this.totalCandidates = total;
	}
	
	
	public void switchVotePermission(){
		this.VAState.switchState(this);
	}
	
	public void setVotePermission( VotePermissionState vs ){
		this.VAState = vs;
	}
}
