package headfirst.singleton.classic;

/**
 * @FileName : (Singleton.java)
 * @description : 单例
 * 
 */

public class Singleton
{

	// private static Singleton uniqueInstance;
	//
	//
	// public static synchronized Singleton getInstance()
	// {
	// if(uniqueInstance == null)
	// {
	// uniqueInstance = new Singleton();
	// }
	//
	// return uniqueInstance;
	// }

	// ====================================================================================

	// private static Singleton uniqueInstance = new Singleton();
	//
	// public static synchronized Singleton getInstance()
	// {
	// if(uniqueInstance == null)
	// {
	// uniqueInstance = new Singleton();
	// }
	//
	// return uniqueInstance;
	// }

	// ====================================================================================

	private volatile static Singleton uniqueInstance;

	public static Singleton getInstance()
	{
		if (uniqueInstance == null)
		{
			synchronized (Singleton.class)
			{
				if (uniqueInstance == null)
				{
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}

	private Singleton()
	{
	}

}
