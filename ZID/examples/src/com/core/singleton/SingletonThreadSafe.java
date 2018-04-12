package com.core.singleton;

public class SingletonThreadSafe {
	
	static private SingletonThreadSafe single_instance = null;
	
	private static Object mutex = new Object();
	
	public String s;

	private SingletonThreadSafe() {
		s = "Singleton Thread Safe";
	}

	public static SingletonThreadSafe getInstanceOf() {

		//SingletonThreadSafe result = single_instance;
		
		if (null == single_instance) {
			
			synchronized (mutex) {
				//result = single_instance;
				if (null == single_instance) {
					single_instance  = new SingletonThreadSafe();

				}
			}

		}
		return single_instance;
	}

}
