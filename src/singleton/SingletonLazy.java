
package singleton;

/**
 * Singleton "preguiçoso"
 *
 * @author Alexsandro
 *
 */

// Um sigleton é o artefato que não disponibiliza um objeto.

public class SingletonLazy
{
	private static SingletonLazy instancia;

	private SingletonLazy()
	{
	}

	public static SingletonLazy getInstancia()
	{
		if (instancia == null)
		{

			instancia = new SingletonLazy();
		}
		return instancia;
	}

}
