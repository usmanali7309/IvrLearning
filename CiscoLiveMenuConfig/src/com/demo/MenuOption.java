package com.demo;

public class MenuOption {

	    private String value;
	    private String voice;
	    private String prompt;
	    
	    
		public MenuOption() {
			super();
		}
		
		
		
		public MenuOption(String value, String voice, String prompt) {
			super();
			this.value = value;
			this.voice = voice;
			this.prompt = prompt;
		}



		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
		public String getVoice() {
			return voice;
		}
		public void setVoice(String voice) {
			this.voice = voice;
		}
		public String getPrompt() {
			return prompt;
		}
		public void setPrompt(String prompt) {
			this.prompt = prompt;
		}

	   
	

}
