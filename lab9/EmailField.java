package labs.lab9;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EmailField extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private JTextField textField;
	private CustomerManagerUI c;
	public EmailField(CustomerManagerUI c) {
		this.c = c;
		textField = new JTextField(10);
		this.add(new JLabel("Email: "));
		this.add(textField);
	}
	
	public String getEmail() {
		if(textField.getText().equals("")) {
			c.raiseError("No email entered");
		}
		return textField.getText();
	}
	
	public void setEmail(String email) {
		textField.setText(email);
	}
}
