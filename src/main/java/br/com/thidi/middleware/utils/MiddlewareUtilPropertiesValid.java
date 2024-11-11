<<<<<<< HEAD
 package br.com.thidi.middleware.utils;
 
 import com.google.gson.Gson;
 import java.util.List;
 import java.util.Map;
 import java.util.Properties;
 import java.util.stream.Collectors;
 
 public class MiddlewareUtilPropertiesValid
 {
   private String prop;
   private String value;
   
   public MiddlewareUtilPropertiesValid(String prop, String value) {
     this.prop = prop;
     this.value = value;
   }
 
   
   public String toString() {
     return "UtilPropertiesValid [prop:" + this.prop + ", value:" + this.value + "]";
   }
   
   public String getProp() {
     return this.prop;
   }
   
   public void setProp(String prop) {
     this.prop = prop;
   }
   
   public String getValue() {
     return this.value;
   }
   
   public void setValue(String value) {
     this.value = value;
   }
   
   public static String personalizeMessageAsJSON() {
     Gson gson = new Gson();
     Properties prop = MiddlewarePropertiesUtilImpl.getProperties();
     
     List<MiddlewareUtilPropertiesValid> propriedadesList = (List<MiddlewareUtilPropertiesValid>)prop.entrySet().stream()
       .map(entry -> new MiddlewareUtilPropertiesValid(entry.getKey().toString(), entry.getValue().toString()))
       .collect(Collectors.toList());
     return gson.toJson(propriedadesList);
   }
 }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\thidi\middlewar\\utils\MiddlewareUtilPropertiesValid.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
=======
package br.com.thidi.middleware.utils;

import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

import com.google.gson.Gson;

public class MiddlewareUtilPropertiesValid {

	private String prop;
	private String value;

	public MiddlewareUtilPropertiesValid(String prop, String value) {
		this.prop = prop;
		this.value = value;
	}

	@Override
	public String toString() {
		return "UtilPropertiesValid [prop:" + prop + ", value:" + value + "]";
	}

	public String getProp() {
		return prop;
	}

	public void setProp(String prop) {
		this.prop = prop;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static String personalizeMessageAsJSON() {
        Gson gson = new Gson();
        Properties prop = MiddlewarePropertiesUtilImpl.getProperties(); // Recarregar propriedades

        List<MiddlewareUtilPropertiesValid> propriedadesList = prop.entrySet().stream()
                .map(entry -> new MiddlewareUtilPropertiesValid(entry.getKey().toString(), entry.getValue().toString()))
                .collect(Collectors.toList());
        return gson.toJson(propriedadesList);
    }

}
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
