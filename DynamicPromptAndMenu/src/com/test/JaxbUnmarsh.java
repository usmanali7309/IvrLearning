package com.test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.audium.server.global.ApplicationStartAPI;



public class JaxbUnmarsh {
	
//	public static void main(String[] args) {
//		ApplicationStartAPI appStart = null;
//		ActionElementData data = null;
//		JaxbUnmarsh a = new JaxbUnmarsh();
//		
//		a.loadDyanmicMenu(appStart, data);
//		
//	}
	
	void loadDyanmicMenu(ApplicationStartAPI appStart) {

		try {
			HashMap<String, String> loadxml = new HashMap<>();
			Map<String, HashMap<String, String>> objMapDynamicXml = new HashMap<>();

			String key;

//			File file = new File(
//					"C:/Cisco/eclipse/plugins/com.audiumcorp.studio.debug.runtime/CATALINA_HOME/webapps/CVP/Config/DyMenuTest.xml");
			
			File file = new File(
					"C:/Cisco/CallStudio/eclipse/plugins/com.audiumcorp.studio.debug.runtime/CATALINA_HOME/webapps/CVP/Config/DyMenuTest.xml");
			
			
			System.out.println("File path: " + file);

			JAXBContext jaxbContext = JAXBContext.newInstance(DynamicMenu.class);
			System.out.println("File dynamic:1 " + jaxbContext.toString());
			
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			System.out.println("File dynamic:2 " + unmarshaller);
			
			DynamicMenu dynamic = (DynamicMenu) unmarshaller.unmarshal(file); 
			System.out.println("File dynamic:3 " + dynamic);
			
			for (DynamicMenu.Entry entry : dynamic.getEntry()) {
				key = entry.getKey();

				System.out.println("Key: " + key);

				DynamicMenu.Entry.Value value = entry.getValue();
				
				 final Logger logger = Logger.getGlobal();
				 logger.info("This is for logging======>"+value.getMenuID());
				
				loadxml = new HashMap<>();
				System.out.println("Entered");
				loadxml.put("PROMPTS",   value.getPrompts().getValue().trim());
				loadxml.put("BARGEIN",   value.getPrompts().getBargein().trim());
				loadxml.put("GRAMMARS",  value.getGrammars().trim());
				loadxml.put("NEXT_NODE", value.getNextNode().trim());
				loadxml.put("MENU_ID",   value.getMenuID().trim());
				loadxml.put("NI_PROMPT", value.getNoInput().getValue().trim());
				loadxml.put("NM_PROMPT", value.getNoMatch().getValue().trim());
				loadxml.put("RETRY",     value.getRetry().trim());
				loadxml.put("MAX_TRIES", value.getMaxTries().trim());

				objMapDynamicXml.put(key, loadxml);
				
				System.out.println("loadxml------" + loadxml);
				System.out.println("objMapDynamicXml------1" + objMapDynamicXml);
				key = "";
			}
			System.out.println("objMapDynamicXml------2" + objMapDynamicXml);
			appStart.setApplicationData("csoMenuMap", objMapDynamicXml); // setting all the xml values in csoMenuMap
			

			
		} catch (Exception e) {
			e.printStackTrace();
			
		}

	
	}
}
