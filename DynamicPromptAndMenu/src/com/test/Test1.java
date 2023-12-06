package com.test;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.test.DynamicAnn.Entry;
import com.test.DynamicAnn.Entry.Value;

public class Test1 {
	
	
    public static void main(String[] args) {
        // Path to your XML file
//        String filePath = "path/to/your/file.xml";

        try {
            File file = new File("C:/Cisco/CallStudio/eclipse/plugins/com.audiumcorp.studio.debug.runtime/CATALINA_HOME/webapps/CVP/Config/DyMenuTest.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(DynamicMenu.class);
            System.out.println("====="+jaxbContext);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            System.out.println("----------"+jaxbUnmarshaller);
            // Unmarshalling XML to Java object
            DynamicMenu dynamicMenu = (DynamicMenu) jaxbUnmarshaller.unmarshal(file);
            System.out.println("++++++++"+dynamicMenu);
            // Accessing data from the dynamicMenu object
            List<com.test.DynamicMenu.Entry> entries = dynamicMenu.getEntry();
            for (com.test.DynamicMenu.Entry entry : entries) {
                System.out.println("Key: " + entry.getKey());
                com.test.DynamicMenu.Entry.Value value = entry.getValue();
                System.out.println("Prompts: " + value.getPrompts());
                System.out.println("Grammars: " + value.getGrammars());
                System.out.println("NextNode: " + value.getNextNode());
                System.out.println("MenuID: " + value.getMenuID());
                System.out.println("NoInput: " + value.getNoInput());
                System.out.println("NoMatch: " + value.getNoMatch());
                System.out.println("MaxTries: " + value.getMaxTries());
                System.out.println("Retry: " + value.getRetry());
                System.out.println("-----------------------");
            }

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}


