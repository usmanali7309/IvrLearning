package flow;

/**
 * This interface is used to define the name of variables that are 
 * declared in the call flow.  All variables are defined as 
 * <code>public static final String</code>, which allows user-defined
 * code to reference variable names by the Java variable name.
 * Last generated by Orchestration Designer at: 2023-NOV-27  06:39:33 PM
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
	 * Last generated by Orchestration Designer at: 2023-DEC-01  11:07:27 AM
	 */
	public static final String DATE = "date";
	public static final String NINM = "NINM";
	public static final String MAX_TRY = "MaxTry";
	public static final String USER_STORE = "UserStore";
	public static final String REDIRECTINFO = "redirectinfo";
	public static final String PRESS = "Press";
	public static final String NI_COUNT = "NiCount";
	public static final String SESSION = "session";
	public static final String PROMPT_AND_COLLECT_1 = "PromptAndCollect1";
	public static final String DD_LAST_EXCEPTION = "ddLastException";
	public static final String NM_COUNT = "NmCount";
	public static final String TIME = "time";
	public static final String PROMPT = "prompt";
	public static final String SHAREDUUI = "shareduui";
	//}}END:PROJECT:VARIABLES
	//{{START:PROJECT:VARIABLEFIELDS
	public static final String DATE_FIELD_AUDIO = "audio";
	public static final String DATE_FIELD_DAYOFMONTH = "dayofmonth";
	public static final String DATE_FIELD_DAYOFWEEK = "dayofweek";
	public static final String DATE_FIELD_DAYOFWEEKNUM = "dayofweeknum";
	public static final String DATE_FIELD_DAYOFYEAR = "dayofyear";
	public static final String DATE_FIELD_MONTH = "month";
	public static final String DATE_FIELD_MONTHINYEAR = "monthinyear";
	public static final String DATE_FIELD_YEAR = "year";
	public static final String USER_STORE_FIELD_GRAMMAR = "grammar";
	public static final String USER_STORE_FIELD_MAX_TRY = "MaxTry";
	public static final String USER_STORE_FIELD_MENU_DES = "MenuDes";
	public static final String USER_STORE_FIELD_NEXTKEYWORD = "nextkeyword";
	public static final String USER_STORE_FIELD_NEXT_NODE = "nextNode";
	public static final String USER_STORE_FIELD_NO_INPUT = "noInput";
	public static final String USER_STORE_FIELD_NO_MATCH = "noMatch";
	public static final String USER_STORE_FIELD_PROMPT = "prompt";
	public static final String USER_STORE_FIELD_RETRY = "retry";
	public static final String REDIRECTINFO_FIELD_PRESENTATIONINFO = "presentationinfo";
	public static final String REDIRECTINFO_FIELD_REASON = "reason";
	public static final String REDIRECTINFO_FIELD_SCREENINGINFO = "screeninginfo";
	public static final String REDIRECTINFO_FIELD_URI = "uri";
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
	public static final String PROMPT_AND_COLLECT_1_FIELD_CONFIDENCE = "confidence";
	public static final String PROMPT_AND_COLLECT_1_FIELD_INPUTMODE = "inputmode";
	public static final String PROMPT_AND_COLLECT_1_FIELD_INTERPRETATION = "interpretation";
	public static final String PROMPT_AND_COLLECT_1_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String PROMPT_AND_COLLECT_1_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String PROMPT_AND_COLLECT_1_FIELD_UTTERANCE = "utterance";
	public static final String PROMPT_AND_COLLECT_1_FIELD_VALUE = "value";
	public static final String DD_LAST_EXCEPTION_FIELD_ERRORCODE = "errorcode";
	public static final String DD_LAST_EXCEPTION_FIELD_MESSAGE = "message";
	public static final String DD_LAST_EXCEPTION_FIELD_OBJECT = "object";
	public static final String DD_LAST_EXCEPTION_FIELD_STACKTRACE = "stacktrace";
	public static final String DD_LAST_EXCEPTION_FIELD_TYPE = "type";
	public static final String TIME_FIELD_AUDIO = "audio";
	public static final String TIME_FIELD_HOUR = "hour";
	public static final String TIME_FIELD_MILLISECOND = "millisecond";
	public static final String TIME_FIELD_MINUTE = "minute";
	public static final String TIME_FIELD_SECOND = "second";
	public static final String TIME_FIELD_TIMEZONE = "timezone";
	public static final String PROMPT_FIELD_ISSUE = "Issue";
	public static final String PROMPT_FIELD_OTHER = "Other";
	public static final String PROMPT_FIELD_PM = "pm";
	public static final String PROMPT_FIELD_PM_0 = "pm0";
	public static final String PROMPT_FIELD_PM_1 = "pm1";
	public static final String PROMPT_FIELD_PM_2 = "pm2";
	public static final String PROMPT_FIELD_PM_3 = "pm3";
	public static final String PROMPT_FIELD_PM_4 = "pm4";
	public static final String PROMPT_FIELD_PM_5 = "pm5";
	public static final String PROMPT_FIELD_SALE = "Sale";
	public static final String PROMPT_FIELD_SUPPORT = "Support";
	public static final String PROMPT_FIELD_WELCOME = "Welcome";
	public static final String SHAREDUUI_FIELD_ID = "id";
	public static final String SHAREDUUI_FIELD_VALUE = "value";
	//}}END:PROJECT:VARIABLEFIELDS
}
