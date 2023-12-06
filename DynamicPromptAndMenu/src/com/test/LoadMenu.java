package com.test;

import java.util.HashMap;

import com.audium.server.global.ApplicationStartAPI;
import com.audium.server.session.ActionElementData;
import com.audium.server.voiceElement.ActionElementBase;

public class LoadMenu extends ActionElementBase {

	ApplicationStartAPI appStart;

	@SuppressWarnings("unused")
	@Override
	public void doAction(String arg0, ActionElementData data) throws Exception {

		try {

			JaxbUnmarsh jaxbUnmarsh = new JaxbUnmarsh();

			// Call the loadDyanmicMenu method
			jaxbUnmarsh.loadDyanmicMenu(appStart);

			// Retrieve data using getApplicationData()
//			@SuppressWarnings("unchecked")
//			HashMap<String, HashMap<String, String>> strMenuMap = (HashMap<String, HashMap<String, String>>)
//			appStart.getApplicationData("csoMenuMap");
		
	
			@SuppressWarnings("unchecked")
			HashMap<String, HashMap<String, String>> strMenuMap = (HashMap<String, HashMap<String, String>>) data
					.getApplicationAPI().getApplicationData("csoMenuMap");


			data.addToLog("strMenuMap for test ====: ", strMenuMap+ " ");
			String nextKey = (String) data.getSessionData("nextKey");
			data.addToLog("NextKey is : ", nextKey);

			HashMap<String, String> xKeyValues = strMenuMap.get(nextKey);

			data.addToLog("xKeyValues is : ", xKeyValues.get("MENU_ID"));

			if (xKeyValues != null) {
				String prompts = xKeyValues.get("PROMPTS");
				String grammar = xKeyValues.get("GRAMMARS");
				String bargein = xKeyValues.get("BARGEIN");
				String next_node = xKeyValues.get("NEXT_NODE");
				String menuID = xKeyValues.get("MENU_ID");
				String noInputPrompt = xKeyValues.get("NI_PROMPT");
				String noMatchPrompt = xKeyValues.get("NM_PROMPT");
				String Tries = xKeyValues.get("RETRY");
				String maxTries = xKeyValues.get("MAX_TRIES");

				data.setSessionData("prompts", prompts);
				data.setSessionData("grammar", grammar);
				data.setSessionData("bargein", bargein);
				data.setSessionData("nextNode", next_node);
				data.setSessionData("menuID", menuID);
				data.setSessionData("noInputPrompt", noInputPrompt);
				data.setSessionData("noMatchPrompt", noMatchPrompt);
				data.setSessionData("Tries", Tries);
				data.setSessionData("maxTries", maxTries);

				System.out.println("prompts------" + prompts);
				System.out.println("Grammar------" + grammar);
				System.out.println("Bargein------" + bargein);
				System.out.println("nextNode------" + next_node);
				System.out.println("menuID------" + menuID);
				System.out.println("noInputPrompt------" + noInputPrompt);
				System.out.println("noMatchPrompt------" + noMatchPrompt);
				System.out.println("Tries------" + Tries);
				System.out.println("maxTries------" + maxTries);

			} else {
				System.out.println("Key not found: " + nextKey);
			}

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}

	}

}
