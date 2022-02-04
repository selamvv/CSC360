package Hi;

public class UnderAgeException extends Exception
{

	
	private static final long serialVersionUID = -705225142390005628L;

	/**
	 * 
	 */
	public UnderAgeException()
	{
		super("Parent is too Young");
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public UnderAgeException(String message)
	{
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
