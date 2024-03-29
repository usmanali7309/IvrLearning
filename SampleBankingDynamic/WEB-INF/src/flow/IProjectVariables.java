package flow;

/**
 * This interface is used to define the name of variables that are 
 * declared in the call flow.  All variables are defined as 
 * <code>public static final String</code>, which allows user-defined
 * code to reference variable names by the Java variable name.
 * Last generated by Orchestration Designer at: 2024-JAN-04  03:23:25 PM
 */
public interface IProjectVariables {





	//{{START:PROJECT:VARIABLES
	/**
	 * This is a reserved block of variable name definitions.
	 * The variable names defined here can be used as the key
	 * to get the <code>com.avaya.sce.runtime.Variable</code>
	 * from the <code>SCESession</code> at runtime.<br>
	 * 
	 * For example, given a variable name <code>phoneNum</code>,
	 * user-defined code should access the variable in this format:<PRE>
	 *   Variable phNum = mySession.getVariable(IProjectVariables.PHONE_NUM);
	 *   if ( phNum != null ) {
	 *        // do something with the variable
	 *   }</PRE>
	 * 
	 * This block of code is generated automatically by Orchestration Designer and should not
	 * be manually edited as changes may be overwritten by future code generation.
	 * Last generated by Orchestration Designer at: 2024-FEB-08  02:26:48 PM
	 */
	public static final String RESPONSE_CODE = "responseCode";
	public static final String AF = "AF";
	public static final String LANG_MENU_PR = "LangMenuPr";
	public static final String ACCOUNT_BAL = "AccountBal";
	public static final String CHECK_LANGUAGE_PREFRENCE = "CheckLanguagePrefrence";
	public static final String REDIRECTINFO = "redirectinfo";
	public static final String API_URL = "ApiUrl";
	public static final String LANGUAGE_PREFERENCE = "LanguagePreference";
	public static final String GLOBAL_MENU = "GlobalMenu";
	public static final String UPDATE_LANG = "UpdateLang";
	public static final String EXIT_LOCATION = "exitLocation";
	public static final String ENT_ACCOUNT_NUM = "EntAccountNum";
	public static final String ENT_CARD_NUM = "EntCardNum";
	public static final String PROMPT = "Prompt";
	public static final String ATM = "Atm";
	public static final String DATE = "date";
	public static final String NICOUNT = "NICount";
	public static final String ENT_PIN_RETRY = "EntPinRetry";
	public static final String ENT_CVV = "EntCvv";
	public static final String NINM = "NINM";
	public static final String ENT_CONFIRM_PIN = "EntConfirmPin";
	public static final String USER_STORE = "UserStore";
	public static final String REGISTERED_MOBILE_NUMBER = "RegisteredMobileNumber";
	public static final String PRESS = "Press";
	public static final String SESSION = "session";
	public static final String MAIN_MANU_PR = "MainManuPr";
	public static final String NEXT_FORM = "NextForm";
	public static final String API_FAILURE_COUNT = "ApiFailureCount";
	public static final String ENT_NEW_PIN = "EntNewPin";
	public static final String ENT_OPT = "EntOpt";
	public static final String DD_LAST_EXCEPTION = "ddLastException";
	public static final String ENT_CUST_ID = "EntCustId";
	public static final String TIME = "time";
	public static final String VALIDATE_PIN_COUNT = "ValidatePinCount";
	public static final String SHAREDUUI = "shareduui";
	public static final String NMCOUNT = "NMCount";
	//}}END:PROJECT:VARIABLES
	//{{START:PROJECT:VARIABLEFIELDS
	public static final String LANG_MENU_PR_FIELD_CONFIDENCE = "confidence";
	public static final String LANG_MENU_PR_FIELD_INPUTMODE = "inputmode";
	public static final String LANG_MENU_PR_FIELD_INTERPRETATION = "interpretation";
	public static final String LANG_MENU_PR_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String LANG_MENU_PR_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String LANG_MENU_PR_FIELD_UTTERANCE = "utterance";
	public static final String LANG_MENU_PR_FIELD_VALUE = "value";
	public static final String REDIRECTINFO_FIELD_PRESENTATIONINFO = "presentationinfo";
	public static final String REDIRECTINFO_FIELD_REASON = "reason";
	public static final String REDIRECTINFO_FIELD_SCREENINGINFO = "screeninginfo";
	public static final String REDIRECTINFO_FIELD_URI = "uri";
	public static final String API_URL_FIELD_ACCOUNT_URL = "AccountUrl";
	public static final String API_URL_FIELD_ATM_PIN_URL = "AtmPinUrl";
	public static final String API_URL_FIELD_LANGUAGE_PREFERENCE_URL = "LanguagePreferenceUrl";
	public static final String API_URL_FIELD_OTP_URL = "OtpUrl";
	public static final String GLOBAL_MENU_FIELD_CONFIDENCE = "confidence";
	public static final String GLOBAL_MENU_FIELD_INPUTMODE = "inputmode";
	public static final String GLOBAL_MENU_FIELD_INTERPRETATION = "interpretation";
	public static final String GLOBAL_MENU_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String GLOBAL_MENU_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String GLOBAL_MENU_FIELD_UTTERANCE = "utterance";
	public static final String GLOBAL_MENU_FIELD_VALUE = "value";
	public static final String ENT_ACCOUNT_NUM_FIELD_CONFIDENCE = "confidence";
	public static final String ENT_ACCOUNT_NUM_FIELD_INPUTMODE = "inputmode";
	public static final String ENT_ACCOUNT_NUM_FIELD_INTERPRETATION = "interpretation";
	public static final String ENT_ACCOUNT_NUM_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String ENT_ACCOUNT_NUM_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String ENT_ACCOUNT_NUM_FIELD_UTTERANCE = "utterance";
	public static final String ENT_ACCOUNT_NUM_FIELD_VALUE = "value";
	public static final String ENT_CARD_NUM_FIELD_CONFIDENCE = "confidence";
	public static final String ENT_CARD_NUM_FIELD_INPUTMODE = "inputmode";
	public static final String ENT_CARD_NUM_FIELD_INTERPRETATION = "interpretation";
	public static final String ENT_CARD_NUM_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String ENT_CARD_NUM_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String ENT_CARD_NUM_FIELD_UTTERANCE = "utterance";
	public static final String ENT_CARD_NUM_FIELD_VALUE = "value";
	public static final String PROMPT_FIELD_NIPROMPT = "NIPrompt";
	public static final String PROMPT_FIELD_NMPROMPT = "NMPrompt";
	public static final String PROMPT_FIELD_PM = "pm";
	public static final String PROMPT_FIELD_PM_0 = "pm0";
	public static final String PROMPT_FIELD_PM_1 = "pm1";
	public static final String PROMPT_FIELD_PM_2 = "pm2";
	public static final String PROMPT_FIELD_PM_3 = "pm3";
	public static final String PROMPT_FIELD_PM_4 = "pm4";
	public static final String PROMPT_FIELD_PM_5 = "pm5";
	public static final String PROMPT_FIELD_PM_6 = "pm6";
	public static final String PROMPT_FIELD_PM_7 = "pm7";
	public static final String PROMPT_FIELD_PM_8 = "pm8";
	public static final String PROMPT_FIELD_PM_9 = "pm9";
	public static final String ATM_FIELD_CARD_ID = "cardId";
	public static final String ATM_FIELD_CARD_NUMBER = "cardNumber";
	public static final String ATM_FIELD_CVV = "cvv";
	public static final String ATM_FIELD_EXPIRY_DATE = "expiryDate";
	public static final String ATM_FIELD_PIN = "pin";
	public static final String ATM_FIELD_USER = "user";
	public static final String DATE_FIELD_AUDIO = "audio";
	public static final String DATE_FIELD_DAYOFMONTH = "dayofmonth";
	public static final String DATE_FIELD_DAYOFWEEK = "dayofweek";
	public static final String DATE_FIELD_DAYOFWEEKNUM = "dayofweeknum";
	public static final String DATE_FIELD_DAYOFYEAR = "dayofyear";
	public static final String DATE_FIELD_MONTH = "month";
	public static final String DATE_FIELD_MONTHINYEAR = "monthinyear";
	public static final String DATE_FIELD_YEAR = "year";
	public static final String ENT_CVV_FIELD_CONFIDENCE = "confidence";
	public static final String ENT_CVV_FIELD_INPUTMODE = "inputmode";
	public static final String ENT_CVV_FIELD_INTERPRETATION = "interpretation";
	public static final String ENT_CVV_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String ENT_CVV_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String ENT_CVV_FIELD_UTTERANCE = "utterance";
	public static final String ENT_CVV_FIELD_VALUE = "value";
	public static final String ENT_CONFIRM_PIN_FIELD_CONFIDENCE = "confidence";
	public static final String ENT_CONFIRM_PIN_FIELD_INPUTMODE = "inputmode";
	public static final String ENT_CONFIRM_PIN_FIELD_INTERPRETATION = "interpretation";
	public static final String ENT_CONFIRM_PIN_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String ENT_CONFIRM_PIN_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String ENT_CONFIRM_PIN_FIELD_UTTERANCE = "utterance";
	public static final String ENT_CONFIRM_PIN_FIELD_VALUE = "value";
	public static final String USER_STORE_FIELD_GRAMMAR = "grammar";
	public static final String USER_STORE_FIELD_MAX_TRIES = "maxTries";
	public static final String USER_STORE_FIELD_MENU_DES = "menuDes";
	public static final String USER_STORE_FIELD_MENU_ID = "menuId";
	public static final String USER_STORE_FIELD_NEXTK = "nextk";
	public static final String USER_STORE_FIELD_NEXT_KEYWORD = "nextKeyword";
	public static final String USER_STORE_FIELD_NEXT_NODE = "nextNode";
	public static final String USER_STORE_FIELD_NO_INPUT = "noInput";
	public static final String USER_STORE_FIELD_NO_MATCH = "noMatch";
	public static final String USER_STORE_FIELD_PROMPT = "prompt";
	public static final String USER_STORE_FIELD_RETRY = "retry";
	public static final String PRESS_FIELD_PRESS = "press";
	public static final String PRESS_FIELD_PRESS_0 = "press0";
	public static final String PRESS_FIELD_PRESS_1 = "press1";
	public static final String PRESS_FIELD_PRESS_2 = "press2";
	public static final String PRESS_FIELD_PRESS_3 = "press3";
	public static final String PRESS_FIELD_PRESS_4 = "press4";
	public static final String PRESS_FIELD_PRESS_5 = "press5";
	public static final String PRESS_FIELD_PRESS_6 = "press6";
	public static final String PRESS_FIELD_PRESS_7 = "press7";
	public static final String PRESS_FIELD_PRESS_8 = "press8";
	public static final String PRESS_FIELD_PRESS_9 = "press9";
	public static final String PRESS_FIELD_PRESS_HASH = "pressHash";
	public static final String PRESS_FIELD_PRESS_STAR = "pressStar";
	public static final String SESSION_FIELD_AAI = "aai";
	public static final String SESSION_FIELD_ANI = "ani";
	public static final String SESSION_FIELD_CALLTAG = "calltag";
	public static final String SESSION_FIELD_CHANNEL = "channel";
	public static final String SESSION_FIELD_CHANNELTYPE = "channeltype";
	public static final String SESSION_FIELD_CONVERSEFIRST = "conversefirst";
	public static final String SESSION_FIELD_CONVERSESECOND = "conversesecond";
	public static final String SESSION_FIELD_CURRENTLANGUAGE = "currentlanguage";
	public static final String SESSION_FIELD_DNIS = "dnis";
	public static final String SESSION_FIELD_EXIT_CUSTOMER_ID = "exitCustomerId";
	public static final String SESSION_FIELD_EXIT_INFO_1 = "exitInfo1";
	public static final String SESSION_FIELD_EXIT_INFO_2 = "exitInfo2";
	public static final String SESSION_FIELD_EXIT_PARENT_ID = "exitParentId";
	public static final String SESSION_FIELD_EXIT_PREFERRED_PATH = "exitPreferredPath";
	public static final String SESSION_FIELD_EXIT_REASON = "exitReason";
	public static final String SESSION_FIELD_EXIT_TOPIC = "exitTopic";
	public static final String SESSION_FIELD_LASTERROR = "lasterror";
	public static final String SESSION_FIELD_MEDIATYPE = "mediatype";
	public static final String SESSION_FIELD_PROTOCOLNAME = "protocolname";
	public static final String SESSION_FIELD_PROTOCOLVERSION = "protocolversion";
	public static final String SESSION_FIELD_SESSIONID = "sessionid";
	public static final String SESSION_FIELD_SESSIONLABEL = "sessionlabel";
	public static final String SESSION_FIELD_SHAREDMODE = "sharedmode";
	public static final String SESSION_FIELD_UCID = "ucid";
	public static final String SESSION_FIELD_UUI = "uui";
	public static final String SESSION_FIELD_VIDEOBITRATE = "videobitrate";
	public static final String SESSION_FIELD_VIDEOCODEC = "videocodec";
	public static final String SESSION_FIELD_VIDEOENABLED = "videoenabled";
	public static final String SESSION_FIELD_VIDEOFARFMTP = "videofarfmtp";
	public static final String SESSION_FIELD_VIDEOFORMAT = "videoformat";
	public static final String SESSION_FIELD_VIDEOFPS = "videofps";
	public static final String SESSION_FIELD_VIDEOHEIGHT = "videoheight";
	public static final String SESSION_FIELD_VIDEONEARFMTP = "videonearfmtp";
	public static final String SESSION_FIELD_VIDEOWIDTH = "videowidth";
	public static final String SESSION_FIELD_VPCALLEDEXTENSION = "vpcalledextension";
	public static final String SESSION_FIELD_VPCONVERSEONDATA = "vpconverseondata";
	public static final String SESSION_FIELD_VPCOVERAGEREASON = "vpcoveragereason";
	public static final String SESSION_FIELD_VPCOVERAGETYPE = "vpcoveragetype";
	public static final String SESSION_FIELD_VPRDNIS = "vprdnis";
	public static final String SESSION_FIELD_VPREPORTURL = "vpreporturl";
	public static final String MAIN_MANU_PR_FIELD_CONFIDENCE = "confidence";
	public static final String MAIN_MANU_PR_FIELD_INPUTMODE = "inputmode";
	public static final String MAIN_MANU_PR_FIELD_INTERPRETATION = "interpretation";
	public static final String MAIN_MANU_PR_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String MAIN_MANU_PR_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String MAIN_MANU_PR_FIELD_UTTERANCE = "utterance";
	public static final String MAIN_MANU_PR_FIELD_VALUE = "value";
	public static final String ENT_NEW_PIN_FIELD_CONFIDENCE = "confidence";
	public static final String ENT_NEW_PIN_FIELD_INPUTMODE = "inputmode";
	public static final String ENT_NEW_PIN_FIELD_INTERPRETATION = "interpretation";
	public static final String ENT_NEW_PIN_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String ENT_NEW_PIN_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String ENT_NEW_PIN_FIELD_UTTERANCE = "utterance";
	public static final String ENT_NEW_PIN_FIELD_VALUE = "value";
	public static final String ENT_OPT_FIELD_CONFIDENCE = "confidence";
	public static final String ENT_OPT_FIELD_INPUTMODE = "inputmode";
	public static final String ENT_OPT_FIELD_INTERPRETATION = "interpretation";
	public static final String ENT_OPT_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String ENT_OPT_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String ENT_OPT_FIELD_UTTERANCE = "utterance";
	public static final String ENT_OPT_FIELD_VALUE = "value";
	public static final String DD_LAST_EXCEPTION_FIELD_ERRORCODE = "errorcode";
	public static final String DD_LAST_EXCEPTION_FIELD_MESSAGE = "message";
	public static final String DD_LAST_EXCEPTION_FIELD_OBJECT = "object";
	public static final String DD_LAST_EXCEPTION_FIELD_STACKTRACE = "stacktrace";
	public static final String DD_LAST_EXCEPTION_FIELD_TYPE = "type";
	public static final String ENT_CUST_ID_FIELD_CONFIDENCE = "confidence";
	public static final String ENT_CUST_ID_FIELD_INPUTMODE = "inputmode";
	public static final String ENT_CUST_ID_FIELD_INTERPRETATION = "interpretation";
	public static final String ENT_CUST_ID_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String ENT_CUST_ID_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String ENT_CUST_ID_FIELD_UTTERANCE = "utterance";
	public static final String ENT_CUST_ID_FIELD_VALUE = "value";
	public static final String TIME_FIELD_AUDIO = "audio";
	public static final String TIME_FIELD_HOUR = "hour";
	public static final String TIME_FIELD_MILLISECOND = "millisecond";
	public static final String TIME_FIELD_MINUTE = "minute";
	public static final String TIME_FIELD_SECOND = "second";
	public static final String TIME_FIELD_TIMEZONE = "timezone";
	public static final String SHAREDUUI_FIELD_ID = "id";
	public static final String SHAREDUUI_FIELD_VALUE = "value";
	//}}END:PROJECT:VARIABLEFIELDS
}
