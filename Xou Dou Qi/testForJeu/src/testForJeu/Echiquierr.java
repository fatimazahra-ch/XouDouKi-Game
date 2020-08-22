package testForJeu;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class Echiquierr extends JComponent {

	private static final long serialVersionUID = 1L;
	ImageIcon chat, chien, elephant, lion, loup, panthere, rat, tigre ;
	
	
	Echiquierr(){
		 chat = new ImageIcon(getClass().getResource("/img/chat.png")); 
		 chien = new ImageIcon(getClass().getResource("/img/chien.png")); 
		 elephant = new ImageIcon(getClass().getResource("/img/elephant.png")); 
		 lion = new ImageIcon(getClass().getResource("/img/lion.png")); 
		 loup = new ImageIcon(getClass().getResource("/img/loup.png")); 
		 panthere = new ImageIcon(getClass().getResource("/img/panthere.png")); 
		 rat = new ImageIcon(getClass().getResource("/img/chat.png")); 
		 tigre = new ImageIcon(getClass().getResource("/img/chat.png")); 
	}
	
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		//Les cases
		int CASE_DIM = 60;
		boolean isColored = true;
		
		for(int i = 0; i < 2; i++) {
			if(isColored)
				g2.setPaint(new Color(34, 152, 55));
			else
				g2.setPaint(new Color(32, 144, 43));
			g2.fill(new Rectangle2D.Double( (i+1)*CASE_DIM, CASE_DIM, CASE_DIM, CASE_DIM ));
			isColored = !isColored;
		}
					
		g2.setPaint(new Color(215, 91, 69));
		g2.fill(new Rectangle2D.Double( (3)*CASE_DIM, CASE_DIM, CASE_DIM, CASE_DIM ));
		
		g2.setPaint(new Color(238, 157, 27));
		g2.fill(new Rectangle2D.Double( (4)*CASE_DIM, CASE_DIM, CASE_DIM, CASE_DIM ));
		
		g2.setPaint(new Color(215, 91, 69));
		g2.fill(new Rectangle2D.Double( (5)*CASE_DIM, CASE_DIM, CASE_DIM, CASE_DIM ));
				
		isColored = !isColored;
		for(int i = 5; i < 7; i++) {
			if(isColored)
				g2.setPaint(new Color(34, 152, 55));
			else
				g2.setPaint(new Color(32, 144, 43));
			g2.fill(new Rectangle2D.Double( (i+1)*CASE_DIM, CASE_DIM, CASE_DIM, CASE_DIM ));
			isColored = !isColored;
		}
			
			
		for(int i = 0; i < 3; i++) {
			if(isColored)
				g2.setPaint(new Color(34, 152, 55));
			else
				g2.setPaint(new Color(32, 144, 43));
			g2.fill(new Rectangle2D.Double( (i+1)*CASE_DIM, 2*CASE_DIM, CASE_DIM, CASE_DIM ));
			isColored = !isColored;
		}
				
		g2.setPaint(new Color(215, 91, 69));
		g2.fill(new Rectangle2D.Double( (4)*CASE_DIM, 2*CASE_DIM, CASE_DIM, CASE_DIM ));
				
		isColored = !isColored;
		for(int i = 4; i < 7; i++) {
			if(isColored)
				g2.setPaint(new Color(34, 152, 55));
			else
				g2.setPaint(new Color(32, 144, 43));
			g2.fill(new Rectangle2D.Double( (i+1)*CASE_DIM, 2*CASE_DIM, CASE_DIM, CASE_DIM ));
			isColored = !isColored;
		}
			
		for(int i = 0; i < 7 ;i++ ) {
			if(isColored)
				g2.setPaint(new Color(34, 152, 55));
			else
				g2.setPaint(new Color(32, 144, 43));
			g2.fill(new Rectangle2D.Double( (i+1)*CASE_DIM, 3*CASE_DIM, CASE_DIM, CASE_DIM ));
			isColored = !isColored;
		}
		
		for( int k = 4; k < 7; k++ ) {
			if(isColored) 
				g2.setPaint(new Color(34, 152, 55));
			else
				g2.setPaint(new Color(32, 144, 43));
			g2.fill(new Rectangle2D.Double( CASE_DIM, k*CASE_DIM, CASE_DIM, CASE_DIM ));
			
			for(int i = 1; i < 3; i++) {
				g2.setPaint(new Color(153, 210, 227));
				g2.fill(new Rectangle2D.Double( (i+1)*CASE_DIM, k*CASE_DIM, CASE_DIM, CASE_DIM ));
			}
			
			isColored = !isColored;
			if(isColored) 
				g2.setPaint(new Color(34, 152, 55));
			else
				g2.setPaint(new Color(32, 144, 43));
			g2.fill(new Rectangle2D.Double( 4*CASE_DIM, k*CASE_DIM, CASE_DIM, CASE_DIM ));
			
			isColored = !isColored;
			if(isColored) 
				g2.setPaint(new Color(34, 152, 55));
			else
				g2.setPaint(new Color(32, 144, 43));
			g2.fill(new Rectangle2D.Double( 7*CASE_DIM, k*CASE_DIM, CASE_DIM, CASE_DIM ));
					
			for(int i = 4; i < 6; i++) {
				g2.setPaint(new Color(153, 210, 227));
				g2.fill(new Rectangle2D.Double( (i+1)*CASE_DIM, k*CASE_DIM, CASE_DIM, CASE_DIM ));
			}
			isColored = !isColored;
		}
		
		for(int i = 0; i < 7 ;i++ ) {
			if(isColored)
				g2.setPaint(new Color(34, 152, 55));
			else
				g2.setPaint(new Color(32, 144, 43));
			g2.fill(new Rectangle2D.Double( (i+1)*CASE_DIM, 7*CASE_DIM, CASE_DIM, CASE_DIM ));
			isColored = !isColored;
		}
			
		for(int i = 0; i < 3; i++) {
			if(isColored)
				g2.setPaint(new Color(34, 152, 55));
			else
				g2.setPaint(new Color(32, 144, 43));
			g2.fill(new Rectangle2D.Double( (i+1)*CASE_DIM, 8*CASE_DIM, CASE_DIM, CASE_DIM ));
			isColored = !isColored;
		}
				
		g2.setPaint(new Color(5, 0, 240));
		g2.fill(new Rectangle2D.Double( (4)*CASE_DIM, 8*CASE_DIM, CASE_DIM, CASE_DIM ));
				
		isColored = !isColored;
		for(int i = 4; i < 7; i++) {
			if(isColored)
				g2.setPaint(new Color(34, 152, 55));
			else
				g2.setPaint(new Color(32, 144, 43));
			g2.fill(new Rectangle2D.Double( (i+1)*CASE_DIM, 8*CASE_DIM, CASE_DIM, CASE_DIM ));
			isColored = !isColored;
		}
		
		for(int i = 0; i < 2; i++) {
			if(isColored)
				g2.setPaint(new Color(34, 152, 55));
			else
				g2.setPaint(new Color(32, 144, 43));
			g2.fill(new Rectangle2D.Double( (i+1)*CASE_DIM, 9*CASE_DIM, CASE_DIM, CASE_DIM ));
			isColored = !isColored;
		}
					
		g2.setPaint(new Color(5, 0, 240));
		g2.fill(new Rectangle2D.Double( (3)*CASE_DIM, 9*CASE_DIM, CASE_DIM, CASE_DIM ));
		
		g2.setPaint(new Color(238, 157, 27));
		g2.fill(new Rectangle2D.Double( (4)*CASE_DIM, 9*CASE_DIM, CASE_DIM, CASE_DIM ));
		
		g2.setPaint(new Color(5, 0, 240));
		g2.fill(new Rectangle2D.Double( (5)*CASE_DIM, 9*CASE_DIM, CASE_DIM, CASE_DIM ));
		
		isColored = !isColored;
		for(int i = 5; i < 7; i++) {
			if(isColored)
				g2.setPaint(new Color(34, 152, 55));
			else
				g2.setPaint(new Color(32, 144, 43));
			g2.fill(new Rectangle2D.Double( (i+1)*CASE_DIM, 9*CASE_DIM, CASE_DIM, CASE_DIM ));
			isColored = !isColored;
		}	
		
		//Le cadre
		
		g2.setPaint(new Color(34, 152, 55));
		g2.setStroke(new BasicStroke(2));
		g2.draw(new Rectangle2D.Double( CASE_DIM, CASE_DIM, 7*CASE_DIM, 9*CASE_DIM ));
		
		//Les legendes
		
		int c;
		for(int i = 0; i < 9; i++) {
			c = i+1+'0';
			g2.drawString(""+(char)c, 2.0f/3*CASE_DIM, (i+1.5f)*CASE_DIM);
		}
		
		for(int i = 0; i < 7; i++) {
			c = i+1+'0';
			g2.drawString(""+(char)c, (i+1.5f)*CASE_DIM-5, 2.0f/3*CASE_DIM+6 );
		}
		
		g2.dispose();
	}
	
}





























