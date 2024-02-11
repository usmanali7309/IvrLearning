package flow.subflow.ChangePin;

import java.util.HashMap;

import com.avaya.sce.runtimecommon.SCESession;

import dynamic.Config;
import dynamic.XmlToJava;
import flow.IProjectVariables;

/**
 * The Data class handles many types of server-side operations including data
 * collection (from a data sources such as a database, or web service), variable
 * assignments and operations (like copying variable values, performing mathematic
 * operations, and collection iteration), conditional evaluation to control callflow
 * execution based on variable values, and logging/tracing statements.
 * 
 * Items created in the getDataActions() method are executed/evaluated in order
 * and if a condional branch condition evaluates to "true" then the branch is
 * activated and the execution of data actions is halted.  If no "true" conditions
 * are encountered, then all data actions will be executed/evaluated and the 
 * application will proceed to the "Default" servlet.
 * Last generated by Orchestration Designer at: 2024-JAN-08  02:53:32 PM
 */
public class CAPData extends com.avaya.sce.runtime.Data {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2024-JAN-08  02:53:32 PM
	 */
	public CAPData() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the Next item which will forward application execution
	 * to the next form in the call flow.
	 * Last generated by Orchestration Designer at: 2024-FEB-08  11:01:17 AM
	 */
	public com.avaya.sce.runtime.Next getNext(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Next next = new com.avaya.sce.runtime.Next("ChangePin-EntCardNum", "Default");
		next.setDebugId(9);
		return next;
	}
	
	@Override
	public void requestBegin(SCESession mySession) {
		
	     try {
				
	    	 
	    	   String xmlPath = mySession.getServlet().getServletContext().getInitParameter("XmlPath");
				String file = mySession.getServlet().getServletContext().getInitParameter("ChangeAtmPin");
				
				String xmlFile = xmlPath+file;
			
			   XmlToJava xml = new XmlToJava();
			   xml.parser(xmlFile);
			
//				XmlToJava3 xml = new XmlToJava3();			 
				String key= mySession.getVariableField(IProjectVariables.USER_STORE,IProjectVariables.USER_STORE_FIELD_NEXT_NODE).getStringValue();
				
				String nextNode;
				
				if(xml.objMapDynamicXml.containsKey(key)) {
					
					HashMap<String, String> values = xml.objMapDynamicXml.get(key);
					
					String prompt = values.get(Config.PROMPTS);
					mySession.getVariableField(IProjectVariables.USER_STORE,IProjectVariables.USER_STORE_FIELD_PROMPT).setValue(prompt);
					
					String grammar = values.get(Config.GRAMMARS);
					mySession.getVariableField(IProjectVariables.USER_STORE,IProjectVariables.USER_STORE_FIELD_GRAMMAR).setValue(grammar);
					
					 nextNode = values.get(Config.NEXT_NODE);
					mySession.getVariableField(IProjectVariables.USER_STORE,IProjectVariables.USER_STORE_FIELD_NEXT_NODE).setValue(nextNode);
					
					String menuId = values.get(Config.MENU_ID);
					mySession.getVariableField(IProjectVariables.USER_STORE,IProjectVariables.USER_STORE_FIELD_MENU_ID).setValue(menuId);
					
				    String menuDes = values.get(Config.MENU_DES);
				    mySession.getVariableField(IProjectVariables.USER_STORE,IProjectVariables.USER_STORE_FIELD_MENU_DES).setValue(menuDes);
				    
				    String noInput = values.get(Config.NOINPUT);
				    mySession.getVariableField(IProjectVariables.USER_STORE,IProjectVariables.USER_STORE_FIELD_NO_INPUT).setValue(noInput);
				    
				    String noMatch = values.get(Config.NOMATCH);
				    mySession.getVariableField(IProjectVariables.USER_STORE,IProjectVariables.USER_STORE_FIELD_NO_MATCH).setValue(noMatch);
				    
				    String maxTries = values.get(Config.MAXTRIES);
				    mySession.getVariableField(IProjectVariables.USER_STORE,IProjectVariables.USER_STORE_FIELD_MAX_TRIES).setValue(maxTries);
				    
				    String retry = values.get(Config.RETRY);
				    mySession.getVariableField(IProjectVariables.USER_STORE,IProjectVariables.USER_STORE_FIELD_RETRY).setValue(retry);
				    
				    
				    // Print the values or use them as needed
				    System.out.println("Prompts:@@@@@@@@@@@@@@@@@@@@@@ " + prompt);
				    System.out.println("Grammars: " + grammar);
				    System.out.println("Next Node: " + nextNode);
				    System.out.println("Menu ID: " + menuId);
				    System.out.println("Menu Description: " + menuDes);
				    System.out.println("No Input: " + noInput);
				    System.out.println("No Match: " + noMatch);
				    System.out.println("Max Tries: " + maxTries);
				    System.out.println("Retry: " + retry);
				    
				} else {
				    System.out.println("Key not found.");
				}
				
				System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^"+xml.objMapDynamicXml.get(key));
					
				}catch(Exception e) {
					e.printStackTrace();
				}
	}
	/**
	 * Create a list of local variables used by items in the data node.
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Orchestration Designer at: 2024-FEB-08  11:01:17 AM
	 */
	public java.util.Collection<VariableInfo> getLocalVariables(){
		java.util.Collection<VariableInfo> variables = new java.util.ArrayList<VariableInfo>();

		return variables;
	}
	/**
	 * Creates and conditionally executes operations that have been configured
	 * in the Callflow.  This method will build a collection of operations and
	 * have the framework execute the operations by calling evaluateActions().
	 * If the evaluation causes the framework to forward to a different servlet
	 * then execution stops.
	 * Returning true from this method means that the framework has forwarded the
	 * request to a different servlet.  Returning false means that the default
	 * Next will be invoked.
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Orchestration Designer at: 2024-FEB-08  11:01:17 AM
	 */
	public boolean executeDataActions(com.avaya.sce.runtimecommon.SCESession mySession) throws Exception {
		java.util.Collection actions = null;

		actions = new java.util.ArrayList(1);
		if(evaluateActions(actions, mySession)) {
			return true;
		}
		actions = null;

		// return false if the evaluation of actions did not cause a servlet forward or redirect
		return false;
	}
}
