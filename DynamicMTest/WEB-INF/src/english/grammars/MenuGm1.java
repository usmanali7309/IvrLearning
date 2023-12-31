package english.grammars;

import com.avaya.runtime.platforms.Toolkit;
import com.avaya.sce.runtime.GrammarItem;
import com.avaya.sce.runtime.GrammarRule;

import flow.IProjectVariables;

/**
 * This class is generated only initially.  It is expected that the developer
 * will edit this class can generate the necessary grammar.  The constructor will be regenerated
 * Last generated by Orchestration Designer at: 2023-NOV-28  04:21:48 PM
 */
public class MenuGm1 extends com.avaya.sce.runtime.DynamicGrammar {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	* Constructor for MenuGm1.  This method will be regenerated, put your initialization
	* logic in the init() method.
	*/
	public MenuGm1() {
		//{{START:CLASS:CONSTRUCTOR
        setMode("dtmf");
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	* Method buildGrammar.  Subclasses must implement this method  and return an XML grammar.
	* To return a SRGS grammar, for Example,
	* <pre>
	*     <grammar type=" application / srgs + xml " root=" command " xml:lang=" en - US " version=" 1.0 ">
	*       <rule id=" command " scope=" public ">
	*          <one-of>
	*          <item>visa</item>
	*          <item>master</item>
	*          <item>master card</item>
	*          <item>amex</item>
	*          <item>american express</item>
	*          </one-of>
	*       </rule>
	*     </grammar>
	* </pre>
	* is the result of using the the grammar api as follows:
	* <pre>
	*  public void buildGrammar( SCESession mySession ) {
	*      com.avaya.sce.runtime.GrammarRule rule = new com.avaya.sce.runtime.GrammarRule();
	*      rule.add( new com.avaya.sce.runtime.GrammarItem( "visa" ) );
	*      rule.add( new com.avaya.sce.runtime.GrammarItem( "master card" ) );
	*      rule.add( new com.avaya.sce.runtime.GrammarItem( "amex" ) );
	*      rule.add( new com.avaya.sce.runtime.GrammarItem( "american express" ) );
	*      add( rule );
	*  }
	* </pre>
	*
	* To return a Google Speech grammar, for Example,
	* <pre>
	*  public void buildGrammar( SCESession mySession ) {
	*      setRawGrammarStr("<![CDATA[" + 
	*						"{ \"provider\": \"google\"}" + 
	*						"]]>");
	*  }
	* to produce the following:
	*<grammar mode="voice" type ="application/avaya-ep-csr" xml:lang="en-us">
	*	<![CDATA[
	*		{ "provider": "google"}
	*	]]>
	*</grammar>
	* </pre>
	* @return void
	* @see com.avaya.sce.runtime.DynamicGrammar#buildGrammar()
	*/
	public void buildGrammar(com.avaya.sce.runtimecommon.SCESession mySession) {
		
      String gram=mySession.getVariableField(IProjectVariables.USER_STORE,IProjectVariables.USER_STORE_FIELD_GRAMMAR).getStringValue();
		com.avaya.sce.runtime.GrammarRule rule= new com.avaya.sce.runtime.GrammarRule();
		String[] str=gram.split(",");
		
		int strlength=str.length;
		 for(int i=0;i<strlength;i++) {
			 rule.add(new com.avaya.sce.runtime.GrammarItem(str[i].trim()));
		 }
		 add(rule);

	
	}

}
