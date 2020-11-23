package labs.lab9;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class NotesPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextArea textArea;
	
	public NotesPanel(CustomerManagerUI c) {
		textArea = new JTextArea(4, 20);
		this.add(new JLabel("Notes: "));
		this.add(new JScrollPane(textArea));
	}
	
	public String getNotes() {
		return textArea.getText();
	}
	public void setNotes(String notes) {
		textArea.setText(notes);
	}

}
