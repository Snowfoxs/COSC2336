/**
 * @author Snowfoxs
 * 4/20/2016
 * Lab 8 Calculator Applet
 */

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JApplet implements ActionListener
{
	private JTextField textScreen = new JTextField("");
	private double result = 0;
	private String operator = "=";
	private boolean calculating = true;
	private JButton clearButton;

	public void init()
	{
		clearButton = new JButton("Clear");
		setLayout(new BorderLayout());
		textScreen.setEditable(false);
		add(textScreen, "North");

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4, 4));

		String buttonText = "789/456*123-0.=+";
		for (int i = 0; i < buttonText.length(); i++)
		{
			JButton b = new JButton(buttonText.substring(i, i + 1));
			panel.add(b);
			b.addActionListener(this);
		}

		add(panel, "Center");
		add(clearButton, "South");
		clearButton.addActionListener(this);
	}

	public void actionPerformed(ActionEvent event)
	{
		try
		{
			String operator = event.getActionCommand();
			if ('0' <= operator.charAt(0) && operator.charAt(0) <= '9'
					|| operator.equals("."))
			{
				if (calculating) textScreen.setText(operator);
				else textScreen.setText(textScreen.getText() + operator);
				calculating = false;
			} else
			{
				if (calculating)
				{
					if (operator.equals("-"))
					{
						textScreen.setText(operator);
						calculating = false;
					} else this.operator = operator;
				} else
				{
					double x = Double.parseDouble(textScreen.getText());
					calculate(x);
					this.operator = operator;
					calculating = true;
				}
			}
			if (event.getSource() == clearButton)
			{
				result = 0;
				this.operator = "=";
				calculating = false;
				textScreen.setText(null);
			}
		} catch (NumberFormatException e)
		{
			JOptionPane.showMessageDialog(null, "ERROR: EMPTY INPUT\nThere's "
					+ "nothing here for me to clear or calculate!");
		}
	}

	private void calculate(double value)
	{
		switch (operator)
		{
			case "+":
				result += value;
				break;
			case "-":
				result -= value;
				break;
			case "*":
				result *= value;
				break;
			case "/":
				result /= value;
				break;
			case "=":
				result = value;
				break;
		}
		textScreen.setText("" + result);
	}

}