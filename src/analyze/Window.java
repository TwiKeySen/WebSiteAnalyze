package analyze;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


/**
 * Class Window that initialize a new frame
 * @author tomas
 *
 */
public class Window {
	/**
	 * Constructor with 3 params, the width, height and title of the frame
	 * @param width
	 * @param height
	 * @param title
	 */
	public Window(int width, int height, String title)	
	{
		
		// Creating a new frame
		JFrame frame				= new JFrame(title);
		JLabel urlLabel				= new JLabel();
		JTextField urlTextField 	= new JTextField();
		JButton submitButton		= new JButton("Submit the URL");
		
		// We set the text for the label and the size
		urlLabel.setText("Please, enter your URL here :");	
		urlLabel.setBounds(10, 80, 400, 300);
		// We set the size for the textField and the submit button
		urlTextField.setBounds(225, 215, 350, 30);
		submitButton.setBounds(225, 250, 350, 40);
	
		
		// Setting preferred, maximum & minimum size
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		
		// Closing the frame when the user click on the top right X
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// The user wont be able to resize the window
		frame.setResizable(false);
		
		// The frame will be on the middle of the screen
		frame.setLocationRelativeTo(null);
		
		// Thanks to this, my button will not take all the window
		frame.setLayout(null);
		
		// Adding the label and the button
		frame.add(urlLabel);
		frame.add(urlTextField);
		frame.add(submitButton);
		
		frame.setVisible(true);
		
		submitButton.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String url = urlTextField.getText();
				
				AnalyzeChoose ac = new AnalyzeChoose();
				
				try 
				{
					ac.showUrlContent(url);
				} 
				catch (IOException e1) 
				{
					e1.printStackTrace();
				}
				
			}
		});
	}
	
}
