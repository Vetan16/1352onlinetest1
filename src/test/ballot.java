package test ;

public class ballot {
	
	private control control;
	

	public void attachControlUnit( control control){
		this.control = control;
	}
	

	public void pressCandidateKeyForVote( Integer sno ){
		control.putvote( sno );
	}
	
	public void allowVote(){
		
	}
}


