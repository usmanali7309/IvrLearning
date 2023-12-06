package dynamic;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import dynamic.Config;
import dynamic.DynamicMenu;
import dynamic.DynamicMenu.Value;

public class XmlToJava {
	
////	For testing only
//	public static void main(String[] args) {
//		XmlToJava t = new XmlToJava();
//		t.test();
//	}
//		
//	
//   public void test() {
	   
   
	String Class = this.getClass().getName();
	Map<String, HashMap<String, String>> objMapDynamicXml1 = new HashMap<String, HashMap<String, String>>();
	
       public Map<String,HashMap<String,String>> objMapDynamicXml = null;
      
      {
    	  
	try {
		
		JAXBContext jaxbContext = JAXBContext.newInstance(DynamicMenu.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		
		File file = new File("C:\\Users\\Admin\\Documents\\AvayaCont\\AvMenuXml1.xml");
		
		DynamicMenu dynamicMenu = (dynamic.DynamicMenu) unmarshaller.unmarshal(file);
		
		 Map<String, DynamicMenu.Value> valuesMap = new HashMap<>();
		 
		 
		
		for(DynamicMenu.Login login:dynamicMenu.getLogin()) {
			
			String key = login.getKey();
			Value value = login.getValue();
			valuesMap.put(key, value);
			
			 if (objMapDynamicXml == null) {
 				objMapDynamicXml = new HashMap<>();
 					}
             
             HashMap<String, String> hashMaps = new HashMap<>();
             
             hashMaps.put(Config.PROMPTS, value.getPrompts().getValue().trim());
             hashMaps.put(Config.GRAMMARS, value.getGrammars().trim());
             hashMaps.put(Config.NEXT_NODE, value.getNextNode().trim());
             hashMaps.put(Config.MENU_ID, value.getMenuId());
             hashMaps.put(Config.MENU_DES, value.getMenuDescription());
             hashMaps.put(Config.NOINPUT, value.getNoInput());
             hashMaps.put(Config.NOMATCH, value.getNoMatch());
             hashMaps.put(Config.MAXTRIES, value.getMaxTries());
             hashMaps.put(Config.RETRY, value.getRetry());
             
             
             
             objMapDynamicXml.put(key,hashMaps );
             
             //System.out.println(" >>  Menu ==================:: " + objMapDynamicXml.toString());
             System.out.println("Key: " + key);
             System.out.println("Prompts:############################### " + value.getPrompts().getValue().trim());
             System.out.println("Grammars: " + value.getGrammars().trim());
             System.out.println("Next Node: " + value.getNextNode());
             System.out.println("Menu ID: " + value.getMenuId());
             System.out.println("Menu Description: " + value.getMenuDescription());
             System.out.println("No Input: " + value.getNoInput());
             System.out.println("No Match: " + value.getNoMatch());
             System.out.println("Max Tries: " + value.getMaxTries());
             System.out.println("Retry: " + value.getRetry());

             System.out.println("----------------------------------");
             
			
		}
		
		 String keys = "BM";
         
         System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$=================="+objMapDynamicXml.get(keys));
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}
   }
}

//}
