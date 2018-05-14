package Ex2703_CircleAreaANDCircumference;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CircleCalcGUI extends JFrame
{
	private static final long serialVersionUID = 5722616586756459467L;

	private JPanel panelMain;
	private JLabel area;
	private JLabel circumference;

	private JTextField textField;

	private JButton calcButton;

	private MyButtonListener listener;

	public CircleCalcGUI()
	{
		listener = new MyButtonListener();

		panelMain = new JPanel();
		panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS));

		area = new JLabel("Area: ");
		circumference = new JLabel("Circumference: ");
		textField = new JTextField(5);
		textField.setMaximumSize(new Dimension(430, 50));

		calcButton = new JButton("Calculate");
		calcButton.addActionListener(listener);

		panelMain.add(area);
		panelMain.add(circumference);
		panelMain.add(textField);
		panelMain.add(calcButton);

		////////////////////////////////////////////////////////////////////////////////////////// FINAL_TOUCH
		add(panelMain);
		setSize(575, 430);
		setVisible(true);
		setResizable(false);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	////////////////////////////////////////////////////////////////////////////////////////////// ACTION_LISTENER
	private class MyButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if (e.getSource() == calcButton)
			{
				area.setText(area.getText() + (Math.PI * Math.pow(Double.parseDouble(textField.getText()), 2)));
				circumference
						.setText(circumference.getText() + (2 * Math.PI + Double.parseDouble(textField.getText())));
			}
		}

	}

	////////////////////////////////////////////////////////////////////////////////////////////// GUI_LAUNCH
	public static void main(String[] args)
	{
		CircleCalcGUI calcGUI = new CircleCalcGUI();
	}
}
