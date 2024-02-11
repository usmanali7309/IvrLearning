/**
 * Last generated by Orchestration Designer at: 2024-JAN-09  04:27:06 PM
 */
package english.prompts;

import com.avaya.sce.runtimecommon.SCESession;

import flow.IProjectVariables;

public class DyATPrompt extends com.avaya.sce.runtime.Prompt {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Constructor for DyATPrompt.
	 */
	public DyATPrompt() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}


	/**
	 * This method is generated automatically and should not be manually edited
	 * To manually edit the prompt, override:
	 * void updatePrompt()
	 * Last generated by Orchestration Designer at: 2024-FEB-08  11:01:16 AM
	 */
	public void buildPrompt(){
		com.avaya.sce.runtime.Format format = null;
		com.avaya.sce.runtime.RenderHint hint = null;
		com.avaya.sce.runtime.MediaPage mediaPage = null;
		setBarginType(com.avaya.sce.runtimecommon.SCERT.BARGIN_SPEECH);
		setName("DyATPrompt");
		setOrder(com.avaya.sce.runtime.Prompt.STANDARD);

		// Prompt level 1
		setTimeout(1,8000);
		setBargin(1,true);

	}
	
	
	@Override
	public void updatePrompt(SCESession mySession) {
		
		String audioUrlPath = mySession.getServlet().getServletContext().getInitParameter("PromptFile");
		
		String atPrompt = mySession.getVariableField(IProjectVariables.USER_STORE,IProjectVariables.USER_STORE_FIELD_PROMPT).getStringValue();
		
		mySession.getVariableField("Prompt", "pm" ).setValue(audioUrlPath + atPrompt + ".wav");
		
		add(1,new com.avaya.sce.runtime.PhraseVariableElement("Prompt:pm", com.avaya.sce.runtime.PhraseVariableElement.Type.AUDIO_URL, false));
		
	}
	
}
