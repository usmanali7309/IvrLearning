package flow.subflow.CheckAccountBalance;

/**
 * This servlet is used to forward the request to the entry point of a
 * project callflow (subflow).
 * Last generated by Orchestration Designer at: 2024-JAN-08  11:32:40 AM
 */
public class SendValidateOtp extends com.avaya.sce.runtime.Subflow {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2024-JAN-08  11:32:40 AM
	 */
	public SendValidateOtp() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the name of the subflow that is being invoked.  This name is used for
	 * determining the URL mapping for the the entry point of the subflow..
	 *
	 * @return the name of the subflow
	 * Last generated by Orchestration Designer at: 2024-FEB-08  11:01:18 AM
	 */
	protected String getSubflowName() {
		return("SendValidateOtp");
	}
	/**
	 * Returns the name of the mapping of sub flow exit points to the URL mappings
	 * of the servlets to return back to in the calling flow.
	 *
	 * @return map of sub flow exit points to servlets in the calling flow.
	 * Last generated by Orchestration Designer at: 2024-FEB-08  11:01:18 AM
	 */
	protected java.util.Map<String,String> getExitPoints() {
		java.util.Map<String, String> exitPoints;
		exitPoints = new java.util.HashMap<String, String>();
		exitPoints.put("SendValidateOtp-Failed", "CheckAccountBalance-End");
		exitPoints.put("SendValidateOtp-Success", "CheckAccountBalance-ABData");
		return exitPoints;
	}
}
