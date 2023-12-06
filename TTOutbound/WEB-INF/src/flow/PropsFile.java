package flow;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.avaya.sce.runtime.tracking.TraceInfo;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.SCESession;

public class PropsFile {
	
	
	private static long LastmodifiedTimeconfigpropfile =0;
	
	private static File configPropertyfile = null;
	
	public void LoadProFile(String PropertyFile ) {
		
		configPropertyfile = new File(PropertyFile);
		LastmodifiedTimeconfigpropfile = configPropertyfile.lastModified();
		
	}
	
	public synchronized void  reloadPropertyIfChanged(SCESession mySession,String proptiesFile) throws Exception
	 {
		
		if(configPropertyfile == null && LastmodifiedTimeconfigpropfile==0) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "********* Load Property file at Initial Stage ****** " + proptiesFile,mySession);
			 
			this.readProperty(proptiesFile,mySession);
		}
		else {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "********** Set Property variable from global obj ******* ",mySession);					

			long currentLastModifiedTime = configPropertyfile.lastModified();
			
			if (currentLastModifiedTime > LastmodifiedTimeconfigpropfile && currentLastModifiedTime != 0) 
			{
				LastmodifiedTimeconfigpropfile = currentLastModifiedTime;
			    TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "*****property File is modified | Go to read the property***",mySession);
				this.readProperty(proptiesFile,mySession);
			}
			
		 }
	 }

	private void readProperty(String proptiesFile, SCESession mySession) throws IOException {
		
		FileInputStream file = null;
		
		try {
			
			Properties oProperty = new Properties();
			file = new FileInputStream(proptiesFile);
			oProperty.load(file);
			
			KeyData.oProp = oProperty;
			
			this.LoadProFile(proptiesFile);
			
		}catch(Exception e) {
			
			 TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "*** Exception in load property file *** " + e ,mySession);
		}
		finally {
		 file.close();		    
		}
		
		
	}
}
