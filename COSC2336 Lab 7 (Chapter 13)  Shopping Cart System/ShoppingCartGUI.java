/**
 * Created by Snowfoxs on 4/12/2016
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.DecimalFormat;

public class ShoppingCartGUI extends JFrame
{

    private static final int WINDOW_WIDTH = 800;          // Width of GUI
    private static final int WINDOW_LENGTH = 500;     // Length of GUI
    private final double TAX = 0.06;          // Tax rate
    private JPanel bookPanel;               // Holds all the books
    private JPanel buttonPanel;               // Has add/remove/checkout buttons
    private JPanel shoppingCartPanel;          // To hold books added by user
    private JList bookList;                    // List of book names
    private JList selectedList;               // List of books in shopping cart
    private JButton addSelected;               // Adds a book to shopping cart
    private JButton removeSelected;          // Remove book from shopping cart
    private JButton checkOut;
    private String[] bookNames = ProductInfo.getBookNames();
    // Array to hold book names
    private double[] bookPrices = ProductInfo.getBookPrices();
    // Array to hold book prices
    private JScrollPane inventoryList;
    //Holds available books list
    private JScrollPane shoppingCartList;
    private JLabel panelTitle;
    private JLabel cartTitle;
    private int element = -1;
    private int selectedIndex;
    private int index;
    private int count;
    private double total;                    // Total
    private double bookPrice;               // Holds book prices
    private ListModel shoppingCart;
    private DefaultListModel shoppingCartModel;
    private DecimalFormat money;               // Money format
    private Object selectedBookName;          // Selected book


    public ShoppingCartGUI() throws IOException
    {
	   setTitle("Shopping Cart");
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   setLayout(new BorderLayout());
	   setSize(WINDOW_WIDTH, WINDOW_LENGTH);

	   buildBooksPanel();
	   buildButtonsPanel();
	   buildShoppingCartPanel();

	   add(bookPanel, BorderLayout.WEST);
	   add(buttonPanel, BorderLayout.CENTER);
	   add(shoppingCartPanel, BorderLayout.EAST);

	   setVisible(true);
    }

    public static void main(String[] args) throws IOException
    {

	   new ShoppingCartGUI();
    }

    public void buildBooksPanel()
    {
	   bookPanel = new JPanel();

	   bookPanel.setLayout(new BorderLayout());

	   bookList = new JList(bookNames);

	   bookList.setSelectionMode(
			 ListSelectionModel.SINGLE_INTERVAL_SELECTION);
	   bookList.setVisibleRowCount(10);

	   inventoryList = new JScrollPane(bookList);
	   inventoryList.setPreferredSize(new Dimension(175, 50));

	   panelTitle = new JLabel("Available Books");

	   bookPanel.add(panelTitle, BorderLayout.NORTH);
	   bookPanel.add(inventoryList);
    }

    public void buildButtonsPanel()
    {
	   buttonPanel = new JPanel();
	   buttonPanel.setLayout(new GridLayout(3, 1));
	   addSelected = new JButton("Add to Cart");
	   removeSelected = new JButton("Remove from Cart");
	   checkOut = new JButton("Check Out");

	   addSelected.addActionListener(new AddButtonListener());
	   removeSelected.addActionListener(new RemoveButtonListener());
	   checkOut.addActionListener(new CheckOutButtonListener());

	   buttonPanel.add(addSelected);
	   buttonPanel.add(removeSelected);
	   buttonPanel.add(checkOut);
    }

    public void buildShoppingCartPanel()
    {
	   shoppingCartPanel = new JPanel();
	   shoppingCartPanel.setLayout(new BorderLayout());
	   selectedList = new JList();
	   selectedList.setVisibleRowCount(10);
	   shoppingCartList = new JScrollPane(selectedList);
	   shoppingCartList.setPreferredSize(new Dimension(175, 50));
	   cartTitle = new JLabel("Shopping Cart ");
	   shoppingCartPanel.add(cartTitle, BorderLayout.NORTH);
	   shoppingCartPanel.add(shoppingCartList);
    }

    public class AddButtonListener implements ActionListener
    {
	   public void actionPerformed(ActionEvent e)
	   {

		  selectedIndex = bookList.getSelectedIndex();
		  selectedBookName = bookList.getSelectedValue();
		  shoppingCart = selectedList.getModel();
		  shoppingCartModel = new DefaultListModel();
		  for (count = 0; count < shoppingCart.getSize(); count++)
		  {
			 shoppingCartModel.addElement(
				    shoppingCart.getElementAt(count));
		  }
		  if (element == -1)
			 bookPrice += bookPrices[selectedIndex];
		  else
			 bookPrice += bookPrices[element];

		  shoppingCartModel.addElement(selectedBookName);
		  selectedList.setModel(shoppingCartModel);
	   }
    }

    public class RemoveButtonListener implements ActionListener
    {
	   public void actionPerformed(ActionEvent e)
	   {

		  index = selectedList.getSelectedIndex();
		  ((DefaultListModel) selectedList.getModel()).remove(index);

		  if (element == -1)
			 if (bookPrices[selectedIndex] <= bookPrice)
				bookPrice -= (bookPrices[selectedIndex]);
			 else
				bookPrice = (bookPrices[index]) - bookPrice;
		  else if (bookPrices[element] <= bookPrice)
			 bookPrice -= (bookPrices[element]);
		  else
			 bookPrice = (bookPrices[index]) - bookPrice;
	   }
    }

    public class CheckOutButtonListener implements ActionListener
    {
	   public void actionPerformed(ActionEvent e)
	   {

		  money = new DecimalFormat("#,##0.00");
		  total = (bookPrice + (bookPrice * TAX));

		  JOptionPane.showMessageDialog(null, "Subtotal: $" +
				(money.format(bookPrice)) + "\n" +
				"Tax: $" + (money.format((bookPrice * TAX))) + "\n" +
				"Total: $" + (money.format(total)));
	   }
    }
}