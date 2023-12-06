package com.demo;

import com.audium.server.AudiumException;
import com.audium.server.proxy.VoiceElementInterface;
import com.audium.server.session.ElementAPI;
import com.audium.server.xml.VoiceElementConfig;
import com.audium.server.xml.VoiceElementConfig.AudioGroup;
import com.audium.server.xml.VoiceElementConfig.StaticAudio;

public class DynamicMenu implements VoiceElementInterface{
	
	String prompt = "Please select one of the following options";
	MenuOption[] optList = new MenuOption[] {new MenuOption("booking","Booking","If you are calling about a booking you have just made, press"),
			new MenuOption("account","Account","If you'd like to talk to us about your frequent flyer account, press"),
			new MenuOption("account","Account","If you'd like to talk to us about your frequent flyer account, press")};

	@Override
	public VoiceElementConfig getConfig(String name, ElementAPI elementAPI, VoiceElementConfig cfg) throws AudiumException {
		
		AudioGroup init_audgrp = cfg.new AudioGroup("initial_audio_group",false);
		
		StaticAudio tts = cfg.new StaticAudio(prompt,null);
		init_audgrp.addAudioItem(tts);
		init_audgrp.setBargein(true);
		
		
		for(int i=1;i<=optList.length;i++) {
			MenuOption m = optList[i-1];
			
			StaticAudio opt_tts = cfg.new StaticAudio(m.getPrompt()+i,null);
			init_audgrp.addAudioItem(opt_tts);
			cfg.setSettingValue("option"+i+"_value", m.getValue());
			cfg.setSettingValue("option"+i+"_voice", m.getVoice());
			cfg.setSettingValue("option"+i+"_dtmf", Integer.toString(i));
			
		}
		
		cfg.setAudioGroup(init_audgrp);
		
		return cfg;
	}
	
	
	

}
