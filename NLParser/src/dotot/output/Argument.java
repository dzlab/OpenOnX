package dotot.output;

public class Argument {

	protected Destination mDestination;
	protected String mText;
	
	public Argument() {
	}
	
	public void setDestination(Destination destination) {
		mDestination = destination;
	}
	
	public void setText(String text) {
		mText = text;
	}
	
	public String getText() {
		return "--text='"+mText + "' --dst='"+ mDestination.getText()+"'";
	}
}