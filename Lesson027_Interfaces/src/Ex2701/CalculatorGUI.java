package Ex2701;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorGUI extends JFrame
{
	private static final long serialVersionUID = 1052795372920432351L;

	private JPanel panelMain;
	private JPanel buttonGrid;

	MyButtonListener listener = new MyButtonListener();

	private JTextField textField;
	private JButton[] buttons;

	public CalculatorGUI()
	{
		super("Calculator");

		panelMain = new JPanel();
		panelMain.setLayout(new BorderLayout());
		textField = new JTextField(25);
		buttonGrid = new JPanel();
		buttonGrid.setLayout(new GridLayout(4, 4));

		panelMain.add(textField, BorderLayout.NORTH);
		panelMain.add(buttonGrid, BorderLayout.CENTER);

		buttons = new JButton[]
		{ new JButton("7"), new JButton("8"), new JButton("9"), new JButton("/"), new JButton("4"), new JButton("5"),
				new JButton("6"), new JButton("*"), new JButton("1"), new JButton("2"), new JButton("3"),
				new JButton("-"), new JButton("0"), new JButton("."), new JButton("="), new JButton("+") };

		for (JButton jButton : buttons)
		{
			buttonGrid.add(jButton);
			jButton.addActionListener(listener);
		}

		add(panelMain);
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	private class MyButtonListener implements ActionListener
	{
		private double nr1;
		private char op = ' ';
		private double result;

		@Override
		public void actionPerformed(ActionEvent event)
		{
			String temp = event.getActionCommand();

			// IF NOT operation
			if (temp != "-" && temp != "=" && temp != "+" && temp != "/" && temp != "*")
				textField.setText(textField.getText() + temp);
			// IF OPERATION
			else
			{
				double screenNr = Double.parseDouble(textField.getText());

				textField.setText(null);

				char screenOp = temp.charAt(0);
				System.out.println(nr1);

				if (op == ' ')
					nr1 = screenNr;
				switch (op)
				{
				case '-':
					nr1 -= screenNr;
					break;
				case '=':
					result = nr1;
					textField.setText(String.valueOf(result));
					break;
				case '+':
					nr1 += screenNr;
					break;
				case '/':
					nr1 = nr1 / screenNr;
					break;
				case '*':
					nr1 = nr1 * screenNr;
					break;
				default:
					op = screenOp;
					break;
				}

				op = screenOp;
				System.out.println(nr1);
			}

		}
	}
}
