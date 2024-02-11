package dynamic;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.avaya.sce.runtimecommon.SCESession;

import dynamic.DynamicMenu.Value;

public class XmlToJava {

////For testing only
//public static void main(String[] args) {
//	XmlToJava t = new XmlToJava();
//	t.urlXmlParser("E:\\SampleBankingXml\\ApiUrl.xml");
//}

	Map<String, HashMap<String, String>> objMapDynamicXml1 = new HashMap<String, HashMap<String, String>>();

	public Map<String, HashMap<String, String>> objMapDynamicXml = null;

	public void parser(String filePath) {

		try {

			JAXBContext jaxbContext = JAXBContext.newInstance(DynamicMenu.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

			System.out.println(">>>>>filePath>>>> " + filePath);
//	        File file = new File("C:\\Users\\Dell\\Documents\\AvayaCont\\SampleBankDynamic.xml");

			File file = new File(filePath);

			DynamicMenu dynamicMenu = (dynamic.DynamicMenu) unmarshaller.unmarshal(file);

			Map<String, DynamicMenu.Value> valuesMap = new HashMap<>();

			for (DynamicMenu.Entry entry : dynamicMenu.getEntry()) {

				String key = entry.getKey();
				Value value = entry.getValue();
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

				objMapDynamicXml.put(key, hashMaps);

				// System.out.println(" >> Menu ==================:: " +
				// objMapDynamicXml.toString());
//				System.out.println("Key: " + key);
//				System.out.println("Prompts:############################### " + value.getPrompts().getValue().trim());
//				System.out.println("Grammars: " + value.getGrammars().trim());
//				System.out.println("Next Node: " + value.getNextNode());
//				System.out.println("Menu ID: " + value.getMenuId());
//				System.out.println("Menu Description: " + value.getMenuDescription());
//				System.out.println("No Input: " + value.getNoInput());
//				System.out.println("No Match: " + value.getNoMatch());
//				System.out.println("Max Tries: " + value.getMaxTries());
//				System.out.println("Retry: " + value.getRetry());

//				System.out.println("----------------------------------");

			}

			String keys = "";

			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$==================" + objMapDynamicXml.get(keys));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public HashMap<String, String> mapUrl = new HashMap<>();

	public void urlXmlParser(String filePath) {

		try {

			JAXBContext jaxbContext = JAXBContext.newInstance(ApiUrl.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

			System.out.println(">>>>>filePath>>>> " + filePath);
//			File file = new File("E\\SampleBankDynamicXml\\SampleBankDynamic.xml");

			File file = new File(filePath);

			ApiUrl apiUrl = (dynamic.ApiUrl) unmarshaller.unmarshal(file);
			
            if(apiUrl!=null) {
            	            
			String languagePreferenceUrl = apiUrl.getLanguagePreferenceUrl();
			String checkAccountBalanceUrl = apiUrl.getCheckAccountBalanceUrl();
			String changeAtmPinUrl = apiUrl.getChangeAtmPinUrl();
			String sendValidateOtpUrl = apiUrl.getSendValidateOtpUrl();

			mapUrl.put(Config.LanguagePreferenceUrl, languagePreferenceUrl);
			mapUrl.put(Config.CheckAccountBalanceUrl, checkAccountBalanceUrl);
			mapUrl.put(Config.ChangeAtmPinUrl, changeAtmPinUrl);
			mapUrl.put(Config.SendValidateOtpUrl, sendValidateOtpUrl);

			System.out.println("languagePreferenceUrl: " + languagePreferenceUrl);
			System.out.println("checkAccountBalanceUrl: " + checkAccountBalanceUrl);
			System.out.println("changeAtmPinUrl: " + changeAtmPinUrl);
			System.out.println("sendValidateOtpUrl " + sendValidateOtpUrl);

            }else {
            	System.out.println("===No value found for url===");
            }
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
