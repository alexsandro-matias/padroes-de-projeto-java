
package singleton;

/**
 * Singleton "preguiçoso"
 *
 * @author Alexsandro
 * @see
 *
 */

// Um sigleton é o artefato que não disponibiliza um objeto.

public class SingletonLazyHolder
{
	private static class Holder
	{
		public static SingletonLazyHolder instancia;
	}
	
	private SingletonLazyHolder()
	{
	}
	
	public static SingletonLazyHolder getInstancia()
	{

		return Holder.instancia;
	}
	
}
