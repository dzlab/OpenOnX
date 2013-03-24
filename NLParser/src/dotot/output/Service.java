package dotot.output;

public class Service {
	protected String mName;
	protected String mOption;
	protected Argument mArgument;
	
	public Service(String name) {
		mName = name;
	}
	
	public void setOption(String opt) {
		mOption = opt;
	}
	
	public void setArgument(Argument arg) {
		mArgument = arg;
	}
	
	public boolean execute() {
		boolean succeeded = false;
		System.out.println(mName + " --option=" + mOption + " '" + mArgument.getText()+"'");
		return succeeded;
	}
}