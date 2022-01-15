package labelProject;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

public class data {

	private static String[] columnNames = { "First Name", "Last Name", "Sport", "# of Years", "Vegetarian" };

	private static Object[][] data = { { "Kathy", "Smith" }

	};

	private static ArrayList<String> cNames = new ArrayList<>();

	DefaultTableModel model = new DefaultTableModel(data, null);

	public ArrayList<ticket> myTickets = new ArrayList<ticket>();

	data() {
		model.addColumn("ID");
		model.addColumn("Vorname");
		model.addColumn("Nachname");
		model.addRow(new Object[] { "1", "Grigorios", "Chatzivasileiadis" });

	}

	public void addTicket(ticket myTicket) {
		myTickets.add(myTicket);
		model.addRow(new Object[] { myTicket.getID(), myTicket.getVorname(), myTicket.getNachname() });
	}

	public DefaultTableModel getModel() {
		return model;
	}

	public ArrayList<String> getColumnNames() {
		return cNames;
	}

	public Object[][] getData() {
		return data;
	}
}
