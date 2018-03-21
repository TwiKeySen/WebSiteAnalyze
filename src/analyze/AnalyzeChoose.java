package analyze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class AnalyzeChoose {
	
	public void showUrlContent(String url) throws IOException	{
		try
		{
			URL urlOfUser 									= new URL(url);
			InputStream urlOfUserInputStream				= urlOfUser.openStream();
			InputStreamReader urlOfUserInputStreamReader 	= new InputStreamReader(urlOfUserInputStream);
			BufferedReader reader 							= new BufferedReader(urlOfUserInputStreamReader);
			
			for ( String line = reader.readLine(); line != null; line = reader.readLine() )
			{
				if ( line.contains("http://") || line.contains("https://"))
				{
					int index 		= line.indexOf("http");
					line			= line.substring(index);
					index 			= line.indexOf("\"");
					line 			= line.substring(0, index);
					
					System.out.println(line);
				}
			}
			
		} 
		catch (MalformedURLException e)
		{
			e.printStackTrace();
		}
	}
}
