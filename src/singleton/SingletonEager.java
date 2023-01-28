
package singleton;

/**
 * Singleton "apressado"
 *
 * @author Alexsandro
 *
 */

// Um sigleton é o artefato que não disponibiliza um objeto.

public class SingletonEager
{
	// instancia rapidamente o Singleton
	private static SingletonEager instancia = new SingletonEager();

	private SingletonEager()
	{
	}

	public static SingletonEager getInstancia()
	{
		return instancia;
	}

}
