
public class PopulationException extends Exception{

	
	private static final long serialVersionUID = 1L;
	
	public PopulationException (String msg) {
	
	super(msg);
}
	public PopulationException() {
		super("il est impossible d'avoir moins de 0 habitants");

}
}