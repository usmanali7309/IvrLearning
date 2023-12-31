package english.phrasesets;

/**
 * This phraseset class will be automatically populated with data from the 
 * phraseset project file.  Manual edits should only be outside of the tag 
 * areas or overridden methods. 
 * Class created on: 
 * Last generated by Orchestration Designer at: 2023-NOV-29  06:25:40 PM
 */
public class TestPhraseSet extends com.avaya.sce.runtime.Phraseset { 

	//{{START:CLASS:FIELDS
	private static final com.avaya.sce.runtime.Phraseset.PhraseMap PHRASE_MAP;
	//}}END:CLASS:FIELDS

	/**
	 * Static initializer
	 */
	static {
		//{{START:PHRASESET:STATIC

		// Create the phrase map, then populate with phrases
		PHRASE_MAP = new com.avaya.sce.runtime.Phraseset.PhraseMap(6);
		com.avaya.sce.runtime.Phrase phrase;

		// phrase: NINM_MAXTRY
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "NINM_MAXTRY", "NINM_MAXTRY.wav", ""); 

		// phrase: NINM_NOINPUT
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "NINM_NOINPUT", "NINM_NOINPUT.wav", ""); 

		// phrase: NINM_NOMATCH
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "NINM_NOMATCH", "NINM_NOMATCH.wav", ""); 

		//}}END:PHRASESET:STATIC
	}
	/**
	 * Returns the Phrase with the given name.  To override the
	 * behavior and dynamically return a different Phrase object,
	 * override the method "hookGetPhrase(...)".
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Orchestration Designer at: 2023-DEC-01  10:46:15 AM
	 * @see com.avaya.sce.runtime.Phraseset#getPhrase(String) 
	 */ 
	public com.avaya.sce.runtime.Phrase getPhrase(String phraseName) {
		return(getPhrase(TestPhraseSet.PHRASE_MAP, phraseName));
	}
}
