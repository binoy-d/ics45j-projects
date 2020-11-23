package labs.lab9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PetSelect extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Map<String, Boolean> items;
	private JCheckBox dogBox;
	private JCheckBox catBox;
	private JCheckBox birdBox;
	private JCheckBox otherBox;
	
	public PetSelect(CustomerManagerUI c) {
		this.add(new JLabel("Pets: "));
		items = new HashMap<>();
		items.put("dog",false);
		items.put("cat",false);
		items.put("bird",false);
		items.put("other",false);
		
		
		dogBox = new JCheckBox("Dog(s)");
		catBox = new JCheckBox("Cat(s)");
		birdBox = new JCheckBox("Bird(s)");
		otherBox = new JCheckBox("Other");
		
		
		class DogListener implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				items.put("dog", !items.get("dog"));
			}
		}
		class CatListener implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				items.put("cat", !items.get("cat"));
			}
		}
		class BirdListener implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				items.put("bird", !items.get("bird"));
			}
		}
		class OtherListener implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				items.put("other", !items.get("other"));
			}
		}
		
		dogBox.addActionListener(new DogListener());
		catBox.addActionListener(new CatListener());
		birdBox.addActionListener(new BirdListener());
		otherBox.addActionListener(new OtherListener());
		
		this.add(dogBox);
		this.add(catBox);
		this.add(birdBox);
		this.add(otherBox);
	}
	
	public Map<String, Boolean> getPets(){
		return items;
	}
	
	public void setPets(Map<String, Boolean> pets) {
		this.items = pets;
		dogBox.setSelected(pets.get("dog"));
		catBox.setSelected(pets.get("cat"));
		birdBox.setSelected(pets.get("bird"));
		otherBox.setSelected(pets.get("other"));
	}
	
	
}
