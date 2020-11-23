package labs.lab9;

import java.awt.GridLayout;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JPanel;

public class InfoPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private NameField nameField;
	private EmailField emailField;
	private PetSelect petSelect;
	private TotalAmountSpentPanel totalAmountSpentPanel;
	private HomeStoreLocationPanel homeStoreLocationPanel;
	private NotesPanel notesPanel;
	private CustomerControls customerControls;
	
	public InfoPanel(CustomerManagerUI c) {
		super();
		this.setLayout(new GridLayout(7, 1));
		nameField = new NameField(c);
		emailField = new EmailField(c);
		petSelect = new PetSelect(c);
		totalAmountSpentPanel = new TotalAmountSpentPanel(c);
		homeStoreLocationPanel = new HomeStoreLocationPanel(c);
		notesPanel = new NotesPanel(c);
		customerControls = new CustomerControls(c);
		
		
		this.add(nameField);
		this.add(emailField);
		this.add(petSelect);
		this.add(totalAmountSpentPanel);
		this.add(homeStoreLocationPanel);
		this.add(notesPanel);
		this.add(customerControls);
	}
	
	public void loadCustomer(Customer c) {
		nameField.setName(c.getName());
		emailField.setEmail(c.getEmail());
		petSelect.setPets(c.getPets());
		totalAmountSpentPanel.setTotalAmountSpent(c.getAmountSpent());
		homeStoreLocationPanel.setHomeStoreLocation(c.getLocation());
		notesPanel.setNotes(c.getNotes());
	}
	
	
	
	public void clearInfo() {
		nameField.setName("");
		emailField.setEmail("");
		Map<String, Boolean> allFalse = new HashMap<String, Boolean>();
		allFalse.put("dog", false);
		allFalse.put("cat", false);
		allFalse.put("bird", false);
		allFalse.put("other", false);
		petSelect.setPets(allFalse);
		totalAmountSpentPanel.setTotalAmountSpent(0);
		homeStoreLocationPanel.setHomeStoreLocation("Irvine");
		notesPanel.setNotes("");
	}
	
	
	public String getName() {
		return nameField.getName();
	}
	public String getEmail() {
		return emailField.getEmail();
	}
	public Map<String, Boolean> getPets(){
		return petSelect.getPets();
	}
	public String getHomeStoreLocation() {
		return homeStoreLocationPanel.getHomeStoreLocation();
	}
	public double getTotalAmountSpent() {
		return totalAmountSpentPanel.getTotalAmountSpent();
	}
	public String getNotes() {
		return notesPanel.getNotes();
	}
	

	
	
}
