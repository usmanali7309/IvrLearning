package flow;

public class DataMapper {
	
	    private long id;
	    private String ucID;
	    private String sessionId;
	    private String startTime;
	    private String endTime;
	    private String mobileNumber;
	    
		public DataMapper() {
			super();
		}

		public DataMapper(long id, String ucID, String sessionId, String startTime, String endTime,
				String mobileNumber) {
			super();
			this.id = id;
			this.ucID = ucID;
			this.sessionId = sessionId;
			this.startTime = startTime;
			this.endTime = endTime;
			this.mobileNumber = mobileNumber;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getUcID() {
			return ucID;
		}

		public void setUcID(String ucID) {
			this.ucID = ucID;
		}

		public String getSessionId() {
			return sessionId;
		}

		public void setSessionId(String sessionId) {
			this.sessionId = sessionId;
		}

		public String getStartTime() {
			return startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getMobileNumber() {
			return mobileNumber;
		}

		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}
	    
	    

}
