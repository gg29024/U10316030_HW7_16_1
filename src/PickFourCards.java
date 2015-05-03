
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PickFourCards extends JFrame{
	public static void main(String[] args) {
	
		JFrame frame = new PickFourCards();
		frame.setTitle("Pick Four Cards");
		frame.setLocationRelativeTo(null); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 350);
		frame.setVisible(true);
		
	}
	
	JButton jbtRefresh = new JButton("Refresh");
	
	ImageIcon[] cards = new ImageIcon[52];
	public JLabel card1;
	public JLabel card2;
	public JLabel card3;
	public JLabel card4;
	
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	
	public PickFourCards(){
	
		int[] deck = new int[52];
		
		for(int i = 0 ; i < cards.length ; i ++){
			cards[i] = new ImageIcon((getClass().getResource("image/card/" + (i+1) +".png")));
		}
		
		// Initialize cards
		for (int i = 0; i < deck.length; i++)
		deck[i] = i;
		
		// Refresh the cards
		for (int i = 0; i < deck.length; i++) {
			// Generate an index randomly
			int index = (int)(Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index]; 
			deck[index] = temp;
		}
		
		p1.add(jbtRefresh);
		p2.setLayout(new GridLayout(1,4,1,1));
			
		card1 = new JLabel(cards[deck[0]]);
		card2 = new JLabel(cards[deck[1]]);
		card3 = new JLabel(cards[deck[2]]);
		card4 = new JLabel(cards[deck[3]]);
		
		p2.add(card1);
		p2.add(card2);
		p2.add(card3);
		p2.add(card4);
		this.add(p1,BorderLayout.SOUTH);
		this.add(p2,BorderLayout.CENTER);
		
		jbtRefresh.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			
			p2.repaint();
			for(int i = 0; i < deck.length; i++)
				deck[i] = i;
			
				  
			for(int i = 0; i < deck.length; i++){
				int index = (int)(Math.random() * deck.length);
				int temp = deck[i];
				deck[i] = deck[index];
				deck[index] = temp;
			}	
			
			card1.setIcon(cards[deck[0]]);
			card2.setIcon(cards[deck[1]]);
			card3.setIcon(cards[deck[2]]);
			card4.setIcon(cards[deck[3]]);

			}
		});
	}
}




