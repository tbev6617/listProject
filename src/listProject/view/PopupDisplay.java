package listProject.view;

import javax.swing.JOptionPane;

/**
 * The popup display class for CTEC
 * @author Tyler Bevan
 * @version 1.0 03.10.2017
 */
public class PopupDisplay {
	/**
	 * Displays the supplied message in a popup window
	 * @param message The message that is displayed
	 */
	public void displayText(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}
	/**
	 * Asks a question and gains an answer from the user
	 * @param question The question that is asked
	 * @return The response that the user inputs
	 */
	public String getResponse(String question)
	{
		String response = "";
		response += JOptionPane.showInputDialog(null, question);
		return response;
	}
}
