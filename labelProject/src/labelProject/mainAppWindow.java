package labelProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JScrollPane;
import net.miginfocom.swing.MigLayout;
import javax.swing.border.LineBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import java.awt.Color;
import javax.swing.JList;
import javax.swing.JComboBox;
import java.awt.Choice;
import javax.swing.JMenuItem;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.ListSelectionModel;
import javax.swing.JFormattedTextField;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class mainAppWindow {

	private JFrame frame;
	private JTextField tfVorname;
	private JTextField tfNachname;
	private JTextField tfProduktnummer;
	private JTable table;
	private JTextField tfSearch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainAppWindow window = new mainAppWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public mainAppWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		Object [] data2 = { "Grigorios","Giannhs","Giwrgos","Grigorios","Giannhs","Giwrgos",
				"Grigorios","Giannhs","Giwrgos","Grigorios","Giannhs","Giwrgos","Grigorios",
				"Giannhs","Giwrgos","Grigorios","Giannhs","Giwrgos","Grigorios","Giannhs","Giwrgos"
		};
		
		frame = new JFrame();
		frame.getContentPane().setEnabled(false);
		frame.getContentPane().setLayout(new MigLayout("", "[grow]", "[100px:500px,grow][][grow][300px:400px:500px][25px:50px:50px,grow]"));
		frame.setResizable(false);
		
		JScrollPane scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, "cell 0 0,grow");
		
		data myData = new data();
		table = new JTable(myData.getModel());
		scrollPane.setViewportView(table);
		
		TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(table.getModel());
		table.setRowSorter(rowSorter);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frame.getContentPane().add(panel, "cell 0 3,grow");
		panel.setLayout(new MigLayout("", "[][200px:n:200px,grow][grow][200px:200px:200px,grow][200px:200px:200px,grow]", "[][][][grow]"));
		
		JLabel lblVorname = new JLabel("Vorname");
		lblVorname.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 17));
		panel.add(lblVorname, "cell 0 0,alignx trailing");
		
		tfVorname = new JTextField();
		panel.add(tfVorname, "cell 1 0,growx");
		tfVorname.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1, "cell 3 0,alignx center,aligny center");
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		panel.add(lblNewLabel_2, "cell 4 0,alignx center,aligny center");
		
		JLabel lblNachname = new JLabel("Nachname");
		lblNachname.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 17));
		panel.add(lblNachname, "cell 0 1,alignx trailing");
		
		tfNachname = new JTextField();
		panel.add(tfNachname, "cell 1 1,growx");
		tfNachname.setColumns(10);
		
		JLabel lblProduktnummer = new JLabel("Produktnummer");
		lblProduktnummer.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 17));
		panel.add(lblProduktnummer, "cell 0 2,alignx trailing");
		
		tfProduktnummer = new JTextField();
		panel.add(tfProduktnummer, "cell 1 2,growx,aligny top");
		tfProduktnummer.setColumns(10);
		
		JLabel lblBeschreibung = new JLabel("Beschreibung");
		lblBeschreibung.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 17));
		panel.add(lblBeschreibung, "cell 0 3,alignx right,aligny top");
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panel.add(scrollPane_1, "cell 1 3,grow");

		JTextPane tpBeschreibung = new JTextPane();
		scrollPane_1.setViewportView(tpBeschreibung);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.add(panel_1, "cell 3 1 1 3,grow");
		panel_1.setLayout(null);
		
		JButton btnAddEintrag = new JButton("Add");
		btnAddEintrag.setBounds(10, 233, 71, 23);
		panel_1.add(btnAddEintrag);
		
		JButton btnRemoveEintrag = new JButton("Remove");
		btnRemoveEintrag.setBounds(91, 233, 99, 23);
		panel_1.add(btnRemoveEintrag);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 11, 180, 221);
		panel_1.add(scrollPane_3);
		
		JList list = new JList();
		scrollPane_3.setViewportView(list);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.add(panel_2, "cell 4 1 1 3,grow");
		panel_2.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("New");
		btnNewButton_3.setBounds(10, 233, 71, 23);
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Remove");
		btnNewButton_4.setBounds(91, 233, 99, 23);
		panel_2.add(btnNewButton_4);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 11, 180, 221);
		panel_2.add(scrollPane_2);
		
		JList list_1 = new JList();
		scrollPane_2.setViewportView(list_1);
		
		JLabel lblSearch = new JLabel("SEARCH:");
		lblSearch.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.getContentPane().add(lblSearch, "flowx,cell 0 1");
		
		tfSearch = new JTextField();
		frame.getContentPane().add(tfSearch, "cell 0 1");
		tfSearch.setColumns(20);
		tfSearch.getDocument().addDocumentListener(new DocumentListener () {

			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				String text = tfSearch.getText();
				if (text.trim().length() == 0) {
					rowSorter.setRowFilter(null);
				} else {
					rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
				}
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				String text = tfSearch.getText();

				if (text.trim().length() == 0) {
					rowSorter.setRowFilter(null);
				} else {
					rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
				}
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods,

			}
			
		});
		
		JButton btnSet = new JButton("Set");
		frame.getContentPane().add(btnSet, "cell 0 1");
		
		JButton btnClear = new JButton("Clear");
		frame.getContentPane().add(btnClear, "cell 0 1");
		
		JPanel panel_3 = new JPanel();
		frame.getContentPane().add(panel_3, "cell 0 4,grow");
		JButton btnAdd_New = new JButton("Add New");
		btnAdd_New.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myData.addTicket(new ticket(tfVorname.getText(), tfNachname.getText()));
			}
		});
		panel_3.add(btnAdd_New);
		
		JButton btnUpdate = new JButton("Update");
		panel_3.add(btnUpdate);
		
		JButton btnRemove = new JButton("Remove");
		panel_3.add(btnRemove);
		
		JButton btnNewButton_9 = new JButton("New button");
		panel_3.add(btnNewButton_9);
		frame.setBounds(100, 100, 827, 562);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}
