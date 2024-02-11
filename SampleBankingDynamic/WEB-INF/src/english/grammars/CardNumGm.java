package english.grammars;

/**
 * This class is generated automatically.
 * Only exit this class for Dynamic External grammars and override the method String getURL().
 * Last generated by Orchestration Designer at: 2024-JAN-29  12:53:22 PM
 */
public class CardNumGm extends com.avaya.sce.runtime.Grammar {

    //{{START:CLASS:FIELDS
    //}}END:CLASS:FIELDS

    /**
    * Constructor for CardNumGm.
    */
    public CardNumGm() {
		//{{START:CLASS:CONSTRUCTOR
        super();
        setRootLanguage("en-us");
        setMode("voice");
        setBuiltin(true);
        setBuiltinMode("grammar");
        setType("digits");
        setOptions("length=12");
		//}}END:CLASS:CONSTRUCTOR
    }

}

