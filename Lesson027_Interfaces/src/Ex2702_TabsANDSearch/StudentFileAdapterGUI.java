package Ex2702_TabsANDSearch;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class StudentFileAdapterGUI extends JFrame
{
	private static final long serialVersionUID = -4503431530727981337L;

	private StudentFileAdapter adapter;

	private JTabbedPane tabPane;

	private JPanel allStudentsPanel;
	private JPanel changeCountryPanel;
	private JPanel inputPanel;
	private JPanel studentSearchPanel;

	private JTextArea allStudentsArea;
	private JScrollPane allStudentsScrollPane;
	private JTextArea searchStudentArea;
	private JScrollPane searchStudentScrollPane;

	private JLabel firstNameLabel;
	private JLabel lastNameLabel;
	private JLabel countryLabel;
	private JLabel searchCountryLabel;

	private JTextField firstNameField;
	private JTextField lastNameField;
	private JTextField countryField;
	private JTextField searchCountryField;

	private JButton getButton;
	private JButton updateButton;
	private JButton searchButton;

	private MyButtonListener buttonListener;

	public StudentFileAdapterGUI()
	{
		super("Student File Adapter GUI");

		adapter = new StudentFileAdapter("students.bin");
		buttonListener = new MyButtonListener();

		//////////////////////////////////////////////////////////////////////////////////////////// TAB1
		allStudentsPanel = new JPanel();

		allStudentsArea = new JTextArea(20, 50);

		allStudentsScrollPane = new JScrollPane(allStudentsArea);
		allStudentsPanel.add(allStudentsScrollPane);
		getButton = new JButton("Get Students");
		getButton.addActionListener(buttonListener);
		allStudentsPanel.add(getButton);

		//////////////////////////////////////////////////////////////////////////////////////////// TAB2
		changeCountryPanel = new JPanel();

		inputPanel = new JPanel();

		firstNameLabel = new JLabel("First Name:    ");
		firstNameField = new JTextField(15);
		lastNameLabel = new JLabel("Last Name:    ");
		lastNameField = new JTextField(15);
		countryLabel = new JLabel("Country:          ");
		countryField = new JTextField(15);
		updateButton = new JButton("Update");

		updateButton.addActionListener(buttonListener);
		inputPanel.add(firstNameLabel);
		inputPanel.add(firstNameField);
		inputPanel.add(lastNameLabel);
		inputPanel.add(lastNameField);
		inputPanel.add(countryLabel);
		inputPanel.add(countryField);
		inputPanel.add(updateButton);
		changeCountryPanel.add(inputPanel);

		inputPanel.setPreferredSize(new Dimension(300, 120));

		//////////////////////////////////////////////////////////////////////////////////////////// TAB3
		studentSearchPanel = new JPanel();

		searchStudentArea = new JTextArea(20, 50);
		searchStudentScrollPane = new JScrollPane(searchStudentArea);
		studentSearchPanel.add(searchStudentScrollPane);

		searchCountryLabel = new JLabel("Search country: ");
		searchCountryField = new JTextField(15);
		searchButton = new JButton("Search");
		searchButton.addActionListener(buttonListener);

		studentSearchPanel.add(searchCountryLabel);
		studentSearchPanel.add(searchCountryField);
		studentSearchPanel.add(searchButton);

		//////////////////////////////////////////////////////////////////////////////////////////// FINAL_TOUCH
		tabPane = new JTabbedPane();
		tabPane.addTab("All Students", allStudentsPanel);
		tabPane.addTab("Change Country", changeCountryPanel);
		tabPane.addTab("Students from Country", studentSearchPanel);

		add(tabPane);
		setSize(575, 430);
		setVisible(true);
		setResizable(false);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	//////////////////////////////////////////////////////////////////////////////////////////////// ACTION_LISTENER
	private class MyButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if (e.getSource() == getButton)
			{
				StudentList students = adapter.getAllStudents();
				allStudentsArea.setText(students.toString());
			}
			if (e.getSource() == updateButton)
			{
				adapter.changeCountry(firstNameField.getText(), lastNameField.getText(), countryField.getText());

				allStudentsArea.setText("");
			}
			if (e.getSource() == searchButton)
			{
				StudentList students = adapter.getStudentsFrom(searchCountryField.getText());

				searchStudentArea.setText(students.toString());
			}
		}
	}

	public static void main(String[] args)
	{
		StudentFileAdapterGUI sfagui = new StudentFileAdapterGUI();
	}
}
