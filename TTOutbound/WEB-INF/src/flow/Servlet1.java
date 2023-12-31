package flow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONObject;

import com.google.gson.Gson;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;



/**
 * A basic servlet which allows a user to define their code, generate
 * any output, and to select where to transition to next.
 * Last generated by Orchestration Designer at: 2023-NOV-21  06:37:06 PM
 */
public class Servlet1 extends com.avaya.sce.runtime.BasicServlet {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2023-NOV-21  06:37:06 PM
	 */
	public Servlet1() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * This method allows for custom integration with other Java components.
	 * You may use Java for sophisticated logic or to integrate with custom
	 * connectors (i.e. JMS, custom web services, sockets, XML, JAXB, etc.)
	 *
	 * Any custom code added here should work as efficiently as possible to prevent delays.
	 * It's important to design your callflow so that the voice browser (Experienve Portal/IR)
	 * is not waiting too long for a response as this can lead to a poor caller experience.
	 * Additionally, if the response to the client voice browser exceeds the configured
	 * timeout, the platform may throw an "error.badfetch". 
	 *
	 * Using this method, you have access to all session variables through the 
	 * SCESession object.
	 *
	 * The code generator will *** NOT *** overwrite this method in the future.
	 * Last generated by Orchestration Designer at: 2023-NOV-21  06:37:06 PM
	 */
	public void servletImplementation(com.avaya.sce.runtimecommon.SCESession mySession) {


//		OkHttpClient client = new OkHttpClient().newBuilder()
//				  .build();
//				MediaType mediaType = MediaType.parse("text/plain");
//				RequestBody body = RequestBody.create(mediaType, "");
//				Request request = new Request.Builder()
//				  .url("https://api.github.com/users/mojombo")
//				  .method("GET", null)
//				  .build();
//				try {
//					Response response = client.newCall(request).execute();
//					String resBody = response.body().toString();
//					
//					Gson gson = new Gson();
//					TestData testData = gson.fromJson(resBody, TestData.class);
//					int id = testData.getId();
//					System.out.println("===============id========= : "+id);
//					
//					
////					System.out.println("===============resBody========= : "+resBody);
//				} catch (IOException e) {
//					
//					e.printStackTrace();
//				}
		
		
		 URL url;
		try {
			url = new URL("https://api.github.com/users/mojombo");
		
	        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	        connection.setRequestMethod("GET");
	        
	        int responseCode = connection.getResponseCode();
	        if (responseCode == HttpURLConnection.HTTP_OK) {
	            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	            String inputLine;
	            StringBuilder response = new StringBuilder();

	            while ((inputLine = in.readLine()) != null) {
	                response.append(inputLine);
	            }
	            String responseBody = response.toString();
	            
	            Gson gson = new Gson();
				TestData testData = gson.fromJson(responseBody, TestData.class);
				int id = testData.getId();
     			System.out.println("===============id========= : "+id);
	            System.out.println("===============response========= : "+response);

	            
	            
	            in.close();
	            
	        } else {
	            throw new Exception("API request failed with response code: " + responseCode);
	        }
	        
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		

	}
	/**
	 * Builds the list of branches that are defined for this servlet object.
	 * This list is built automatically by defining Goto nodes in the call flow editor.
	 * It is the programmer's responsibilty to provide at least one enabled Goto.<BR>
	 *
	 * The user should override updateBranches() to determine which Goto that the
	 * framework will activate.  If there is not at least one enabled Goto item, 
	 * the framework will throw a runtime exception.<BR>
	 *
	 * This method is generated automatically and changes to it may
	 * be overwritten next time code is generated.  To modify the list
	 * of branches for the flow item, override:
	 *     <code>updateBranches(Collection branches, SCESession mySession)</code>
	 *
	 * @return a Collection of <code>com.avaya.sce.runtime.Goto</code>
	 * objects that will be evaluated at runtime.  If there are no gotos
	 * defined in the Servlet node, then this returns null.
	 * Last generated by Orchestration Designer at: 2023-NOV-21  06:37:06 PM
	 */
	public java.util.Collection getBranches(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		com.avaya.sce.runtime.Goto aGoto = null;
		list = new java.util.ArrayList(1);

		aGoto = new com.avaya.sce.runtime.Goto("TTDetailsFetch", 0, true, "Default");
		list.add(aGoto);

		return list;
	}
}
