package br.com.thidi.middleware.utils;

import java.util.Properties;

public class MiddlewarePropertiesUtilImpl {
<<<<<<< HEAD
	private static MiddlewareUtilProperties loader = new MiddlewareUtilProperties();

	public static String getValor(String chave) {
		loader.reloadProperties();
		return loader.getValor(chave);
	}

	public static Properties getProperties() {
		loader.reloadProperties();
		return loader.getProperties();
	}
=======

    private static MiddlewareUtilProperties loader = new MiddlewareUtilProperties();

    public static String getValor(String chave) {
        loader.reloadProperties(); 
        return loader.getValor(chave);
    }

    public static Properties getProperties() {
        loader.reloadProperties();  
        return loader.getProperties();
    }
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
}
