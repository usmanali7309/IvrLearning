package english.grammars;

/**
 * This class is generated automatically.
 * Only exit this class for Dynamic External grammars and override the method String getURL().
 * Last generated by Orchestration Designer at: 2024-JAN-06  11:34:43 AM
 */
public class EntAccGr extends com.avaya.sce.runtime.Grammar {

    //{{START:CLASS:FIELDS
    //}}END:CLASS:FIELDS

    /**
    * Constructor for EntAccGr.
    */
    public EntAccGr() {
		//{{START:CLASS:CONSTRUCTOR
        super();
        setRootLanguage("en-us");
        setMode("dtmf");
        setBuiltin(true);
        setBuiltinMode("dtmf");
        setType("digits");
        setOptions("length=12");
		//}}END:CLASS:CONSTRUCTOR
    }

}
