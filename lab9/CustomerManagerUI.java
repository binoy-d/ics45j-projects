package labs.lab9;

import java.awt.GridLayout;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class CustomerManagerUI {
	private JFrame frame;
	private JList<Customer> nameList;
	private InfoPanel infoPanel;
	DefaultListModel<Customer> namesModel;
	
	
	public CustomerManagerUI() {
		frame = new JFrame();
		frame.setTitle("Daniel Binoy - 22622651");
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(1, 2));
		
		
		
		namesModel = new DefaultListModel<>();
		nameList = new JList<>(namesModel);
		mainPanel.add(nameList);
		
		class NamesListListener implements ListSelectionListener{
			public void valueChanged(ListSelectionEvent e) {
				if(namesModel.size()>0) {
					loadCurrentCustomer();
				}
				
				
			}
		}
		nameList.addListSelectionListener(new NamesListListener());
		
		infoPanel = new InfoPanel(this);
		mainPanel.add(infoPanel);
		
		frame.add(mainPanel);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void saveCustomer(Customer c) {
		if(!namesModel.contains(c)) {
			namesModel.addElement(c);
			raiseError("Customer Saved!");//sorry for dumb wording
		}else {
			Customer og = namesModel.get(namesModel.indexOf(c));
			og.setEmail(c.getEmail());
			og.setPets(c.getPets());
			og.setLocation(c.getLocation());
			og.setAmountSpent(c.getAmountSpent());
			og.setNotes(c.getNotes());
		}
		
		Collection<Customer> list = Collections.list(namesModel.elements());
		Collections.sort((List<Customer>) list); 
		namesModel.clear(); 
		for(Customer o:list){
			namesModel.addElement(o);
		}
	}
	
	public void removeCurrentCustomer() {
		if(nameList.getSelectedValue()!=null) {
			namesModel.removeElement(nameList.getSelectedValue());
		}
		
	}
	
	public void loadCurrentCustomer() {
		if(nameList.getSelectedValue()!=null) {
			infoPanel.loadCustomer(nameList.getSelectedValue());
		}
		
	}
	
	
	public void start() {
		frame.setVisible(true);
	}
	
	public InfoPanel getInfoPanel() {
		return infoPanel;
	}
	
	
	public static void main(String[] args) {
		CustomerManagerUI c = new CustomerManagerUI();
		c.start();
	}
	
	public void raiseError(String s) {
	    JOptionPane.showMessageDialog(frame,s);  
	}

}
