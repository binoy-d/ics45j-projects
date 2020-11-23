package labs.lab9;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NameField extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private CustomerManagerUI c;
	public NameField(CustomerManagerUI c) {
		this.c = c;
		textField = new JTextField(10);
		this.add(new JLabel("Name: "));
		this.add(textField);
	}
	
	public String getName() {
		if(textField.getText().equals("")) {
			c.raiseError("No name entered");
		}
		return textField.getText();
	}
	public void setName(String name) {
		textField.setText(name);
	}
}
