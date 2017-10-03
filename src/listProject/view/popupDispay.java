package listProject.view;

import javax.swing.JOptionPane;

public class popupDispay {
	public void displayText(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}
	public String getResponse(String question)
	{
		String response = "";
		response += JOptionPane.showInputDialog(null, question);
		return response;
	}
}
