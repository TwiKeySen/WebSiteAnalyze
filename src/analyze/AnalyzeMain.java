package analyze;


/**
 * Main class
 * @author tomas
 *
 */
public class AnalyzeMain 
{
	private static int WIDTH = 640, HEIGHT = WIDTH / 12 *9;

	public AnalyzeMain()
	{
		
		new Window(WIDTH, HEIGHT, "Analyze a website");
		
	}
	
	
	public static void main(String[] args) 
	{
		
		new AnalyzeMain();

	}

}
