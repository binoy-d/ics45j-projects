package labs.lab9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JPanel;

public class CustomerControls extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton saveButton;
	private JButton newButton;
	private JButton deleteButton;
	public CustomerControls(CustomerManagerUI c) {
		
		saveButton = new JButton("Save");
		newButton = new JButton("New");
		deleteButton = new JButton("Delete");
		
		
		this.add(saveButton);
		this.add(newButton);
		this.add(deleteButton);
		
		class SaveButtonListener implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				
				
				
				InfoPanel info = c.getInfoPanel();
				String name = info.getName();
				String email = info.getEmail();
				Map<String, Boolean> pets = info.getPets();
				String location = info.getHomeStoreLocation();
				double amountSpent = info.getTotalAmountSpent();
				String notes = info.getNotes();
				if(!name.equals("") && !email.equals("") && amountSpent!=0) {
					c.saveCustomer(new Customer(name, email, pets, amountSpent, location, notes));
				}else if(amountSpent == 0) {
					c.raiseError("Customer must spend money to be counted");
				}
				
			}
		}
		
		class NewButtonListener implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				c.getInfoPanel().clearInfo();
			}
		}
		
		class DeleteButtonListener implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				c.removeCurrentCustomer();
			}
		}
		
		
		saveButton.addActionListener(new SaveButtonListener());
		newButton.addActionListener(new NewButtonListener());
		deleteButton.addActionListener(new DeleteButtonListener());

		
	}

}
