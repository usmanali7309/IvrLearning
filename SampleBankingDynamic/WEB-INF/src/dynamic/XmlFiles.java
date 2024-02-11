package dynamic;

import java.util.HashMap;

public class XmlFiles {
	
	
	private HashMap<String,String>XmlFilePath;

	public XmlFiles() {
		
	}

	public XmlFiles(HashMap<String, String> xmlFilePath) {
		super();
		XmlFilePath = xmlFilePath;
	}

	public HashMap<String, String> getXmlFilePath() {
		return XmlFilePath;
	}

	public void setXmlFilePath(HashMap<String, String> xmlFilePath) {
		XmlFilePath = xmlFilePath;
	}

	
	
	

}
