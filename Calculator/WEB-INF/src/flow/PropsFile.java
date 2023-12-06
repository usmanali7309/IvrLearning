package flow;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import com.avaya.sce.runtime.tracking.TraceInfo;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.SCESession;



public class PropsFile {
	
	
private static long LastmodifiedTimeconfigpropfile =0;
	
	private static File configPropertyfile = null;
	
	//set external property file
	 public void LoadProFile(String PropertyFile )
	 {
		 configPropertyfile = new File(PropertyFile);
		 
		 LastmodifiedTimeconfigpropfile = configPropertyfile.lastModified(); // if any updated in property file then only read the property file 
	 }
	
	 public synchronized void  reloadPropertyIfChanged(SCESession mySession,String Propties) throws Exception
	 {
		if(configPropertyfile == null && LastmodifiedTimeconfigpropfile == 0 )
		{
			 TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "********* Load Property file at Initial Stage ****** " + Propties,mySession);
			 
			this.readProperty(Propties,mySession);
		}
		else
		{
			 TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "********** Set Property variable from global obj ******* ",mySession);					

				long currentLastModifiedTime = configPropertyfile.lastModified();
				
				if (currentLastModifiedTime > LastmodifiedTimeconfigpropfile && currentLastModifiedTime != 0) 
				{
					LastmodifiedTimeconfigpropfile = currentLastModifiedTime;
				    TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "*****property File is modified | Go to read the property***",mySession);
					this.readProperty(Propties,mySession);
				}
				
		}
	}
	public void readProperty(String proptyPath,SCESession mySession) throws Exception
	{
		FileInputStream file = null;
		
		try
		{
			Properties oProperty = new Properties();
			file = new FileInputStream(proptyPath);
			oProperty.load(file);
		
		    KeyData.oProp = oProperty;
		 
			this.LoadProFile(proptyPath);
			
		}catch (Exception e) {
			
			 TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "*** Exception in load property file *** " + e ,mySession);
		}
		finally {
		 file.close();		    
		}
		
		}
	}








