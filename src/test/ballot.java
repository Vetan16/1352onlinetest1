package test ;

public class ballot {
	
	private control control;
	private boolean setCandidate = false;

	public void attachControlUnit( control control){
		this.control = control;
	}
	

	public void pressCandidateKey( Integer SNO ){
		if(setCandidate)
			control.setTotalCandidates(SNO);
		else
			control.casteAVote( SrNo );
	}
	
	public void setCandidate(){
		this.setCandidate = true;
	}
}

