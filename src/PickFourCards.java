import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.*;
import javax.swing.*;
import java.awt.GridLayout;


public class PickFourCards extends JFrame{
	public static void main(String[] args) {
	
		PickFourCards frame = new PickFourCards();
		
		JButton jbtRefresh = new JButton("Refresh");
		frame.add(jbtRefresh);
		frame.setTitle("PickFourCards");
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 350);
		frame.setVisible(true);
		
		int[] deck = new int[52];
		String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        
		// Initialize cards
		for (int i = 0; i < deck.length; i++)
		deck[i] = i;
    
		// Shuffle the cards
		for (int i = 0; i < deck.length; i++) {
			// Generate an index randomly
			int index = (int)(Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index]; 
			deck[index] = temp;
		}

		// Display the first four cards
		for (int i = 0; i < 4; i++) {
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
		}
	}
}

class TestPanels extends JFrame {
	public TestPanels() {
		// Create panel p1 for the buttons and set GridLayout
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(4, 3));

		

		p1.add(new JButton("" + 0));
		p1.add(new JButton("Start"));
		p1.add(new JButton("Stop"));

		// Create panel p2 to hold a text field and p1
		JPanel p2 = new JPanel(new BorderLayout());
		p2.add(new JTextField("Time to be displayed here"),
		BorderLayout.NORTH);
		p2.add(p1, BorderLayout.CENTER);

		// add contents into the frame
		add(p2, BorderLayout.EAST);
		add(new JButton("Food to be placed here"),
		BorderLayout.CENTER);
	}
	
}


public class ShowGridLayout extends JFrame {
  public ShowGridLayout() {
    // Set GridLayout, 3 rows, 2 columns, and gaps 5 between
    // components horizontally and vertically
    setLayout(new GridLayout(3, 2, 5, 5));

    // Add labels and text fields to the frame
    add(new JLabel("First Name"));
    add(new JTextField(8));
    add(new JLabel("MI"));
    add(new JTextField(1));
    add(new JLabel("Last Name"));
    add(new JTextField(8));
  }

  /** Main method */
  public static void main(String[] args) {
    ShowGridLayout frame = new ShowGridLayout();
    frame.setTitle("ShowGridLayout");
    frame.setSize(200, 125);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}


class ShowBorderLayout extends JFrame {
	public ShowBorderLayout() {
		// Set BorderLayout with horizontal gap 5 and vertical gap 10
		setLayout(new BorderLayout(5, 10));

		// Add buttons to the frame
		add(new JButton("East"), BorderLayout.EAST);
		add(new JButton("South"), BorderLayout.SOUTH);
		add(new JButton("West"), BorderLayout.WEST);
		add(new JButton("North"), BorderLayout.NORTH);
		add(new JButton("Center"), BorderLayout.CENTER);
	}

	/** Main method */
	public static void main(String[] args) {
		ShowBorderLayout frame = new ShowBorderLayout();
		frame.setTitle("ShowBorderLayout");
		frame.setSize(300, 200);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}



