package dotot.output;

public class Destination {
	
	protected String mComplement;
	protected String mIdentifier;
	
	public Destination() {
	}
	
	public void setIdentifier(String identifier) {
		mIdentifier = identifier;
	}
	
	public void setComplement(String complement) {
		mComplement = complement;
	}
	
	public String getText() {
		return mIdentifier + " " + mComplement;
	}
}