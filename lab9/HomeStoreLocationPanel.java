package labs.lab9;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HomeStoreLocationPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JComboBox<String> locationSelector;
	public HomeStoreLocationPanel(CustomerManagerUI c) {
		this.add(new JLabel("Home Store Location: "));
		locationSelector = new JComboBox<String>(new String[] {"Irvine", "Los Angeles", "Paris", "Shanghai", "New York", "London"});
		this.add(locationSelector);
	}
	
	public String getHomeStoreLocation() {
		return (String) locationSelector.getSelectedItem();
	}
	
	public void setHomeStoreLocation(String item) {
		locationSelector.setSelectedItem(item);
	}
}
