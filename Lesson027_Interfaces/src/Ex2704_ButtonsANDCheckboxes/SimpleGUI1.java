package Ex2704_ButtonsANDCheckboxes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class SimpleGUI1 extends JFrame
{
	private static final long serialVersionUID = -2175923897788332085L;

	// can contain any GUI object including other JPanels
	private JPanel panelMain;
	private JPanel panel1G;
	private JPanel panel2V;
	private JPanel panelXT;
	private JPanel panelYT;

	private JLabel labelX;
	private JLabel labelY;
	private JLabel textPOP1;
	private JLabel textPOP2;

	private JTextField textF1;
	private JTextField textF2;

	private JButton btnOK;
	private JButton btnCancel;
	private JButton btnClear;

	private JCheckBox check1;
	private JCheckBox check2;

	MyButtonListener listener;

	public SimpleGUI1()
	{
		super("Ex2601");
		listener = new MyButtonListener();

		//////////////////////////////////////////////////////////////////////// MAIN
		//////////////////////////////////////////////////////////////////////// WINDOW
		panelMain = new JPanel();
		panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.X_AXIS));
		panel1G = new JPanel();
		panel1G.setLayout(new GridLayout(2, 2));
		panel1G.setBorder(new LineBorder(new Color(100, 100, 255), 2));
		panel2V = new JPanel();
		panel2V.setLayout(new BoxLayout(panel2V, BoxLayout.Y_AXIS));
		panel2V.setBorder(new LineBorder(new Color(100, 100, 255), 2));
		panelXT = new JPanel();
		panelXT.setLayout(new BoxLayout(panelXT, BoxLayout.X_AXIS));
		panelYT = new JPanel();
		panelYT.setLayout(new BoxLayout(panelYT, BoxLayout.X_AXIS));

		panelMain.add(panel1G);
		panelMain.add(panel2V);

		labelX = new JLabel("X:");
		labelX.setPreferredSize(new Dimension(30, 20));
		labelY = new JLabel("Y:");
		labelY.setPreferredSize(new Dimension(30, 20));

		textF1 = new JTextField(5);
		textF1.setMaximumSize(new Dimension(100, 20));
		textF2 = new JTextField(5);
		textF2.setMaximumSize(new Dimension(100, 20));

		check1 = new JCheckBox("Exit on OK");
		check2 = new JCheckBox("Exit on Cancel");

		btnOK = new JButton("OK");
		btnCancel = new JButton("Cancel");
		btnClear = new JButton("Clear");
		btnOK.addActionListener(listener);
		btnCancel.addActionListener(listener);
		btnClear.addActionListener(listener);

		panel1G.add(check1);
		panel1G.add(panelXT);
		panel1G.add(check2);
		panel1G.add(panelYT);

		panelXT.add(labelX);
		panelXT.add(textF1);
		panelYT.add(labelY);
		panelYT.add(textF2);

		panel2V.add(btnOK);
		panel2V.add(btnCancel);
		panel2V.add(btnClear);

		add(panelMain);
		setSize(300, 150);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		//////////////////////////////////////////////////////////////////////// POP_UP_WINDOW
		textPOP1 = new JLabel();
		textPOP2 = new JLabel();
	}

	private class MyButtonListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			// btnCancel
			if (e.getSource() == btnCancel && check2.isSelected())
				System.exit(0);

			// btnOK
			if (e.getSource() == btnOK && !check1.isSelected())
			{
				textPOP1.setText(textF1.getText());
				textPOP2.setText(textF2.getText());
				String temp = textPOP1.getText() + "\n" + textPOP2.getText();
				JOptionPane.showMessageDialog(null, temp);
			} else if (e.getSource() == btnOK && check1.isSelected())
				System.exit(0);

			//btnClear
			if (e.getSource() == btnClear)
			{
				textF1.setText(null);
				textF2.setText(null);
			}
		}

	}
}
