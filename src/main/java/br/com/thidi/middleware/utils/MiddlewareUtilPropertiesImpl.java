package br.com.thidi.middleware.utils;

<<<<<<< HEAD
import br.com.thidi.middleware.resource.CLogger;
import java.util.Properties;

public class MiddlewareUtilPropertiesImpl {
=======
import java.util.Properties;

import br.com.thidi.middleware.resource.CLogger;

public class MiddlewareUtilPropertiesImpl {

>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
	private static MiddlewareUtilProperties loader = new MiddlewareUtilProperties();

	public static String getValor(String chave) {
		loader.reloadProperties();
		String valor = loader.getValor(chave);
		if (valor == null || valor.equals(""))
			CLogger.logPropertiesInfo(chave, valor);
		return valor;
	}

	public static Properties getProperties() {
		loader.reloadProperties();
		return loader.getProperties();
	}
}
