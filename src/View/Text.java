package View;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class Text extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JTable table_1;
	private JTable table;
	private JTable table_2;
	private JTable table_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Text frame = new Text();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Text() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(null);
		
		btnNewButton = new JButton("New button");
		btnNewButton.setBounds(288, 30, 68, 27);
		panel.add(btnNewButton);
		
		table_1 = new JTable();
		table_1.setBounds(14, 114, 196, 27);
		panel.add(table_1);
		
		table = new JTable();
		table.setBounds(35, 115, 175, -23);
		panel.add(table);
		
		table_2 = new JTable();
		contentPane.add(table_2, BorderLayout.CENTER);
		
		table_3 = new JTable();
		contentPane.add(table_3, BorderLayout.NORTH);
	}
}
