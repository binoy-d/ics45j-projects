package labs.lab9;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TotalAmountSpentPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private CustomerManagerUI c;
	public TotalAmountSpentPanel(CustomerManagerUI c) {
		this.c = c;
		this.add(new JLabel("Total Amount Spent: "));
		textField = new JTextField("0.0", 10);
		this.add(textField);
	}
	
	public double getTotalAmountSpent() {
		try {
			return Double.parseDouble(textField.getText());
		}catch(Exception e) {
			c.raiseError("Invalid input for total amount spent: "+textField.getText());
			textField.setText("0.0");
			return 0;
		}
	}
	
	public void setTotalAmountSpent(double val) {
		textField.setText(""+val);
	}
}
