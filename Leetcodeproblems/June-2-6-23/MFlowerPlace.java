package com.java.Leetcodeproblems;

	import javax.swing.*;
	import java.awt.*;
//Java's Swing library to display a flower on a graphical user interface (GUI)
	public class MFlowerPlace extends JFrame {
		private static final long serialVersionUID = 1L;

		public MFlowerPlace() {
	        setTitle("Flower Program");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(400, 400);
	        setLocationRelativeTo(null);
	        setVisible(true);
	    }
//paint method is responsible for drawing the flower
		//using the Graphics object
	    public void paint(Graphics g) {
	        super.paint(g);

	        // Draw the stem
	        g.setColor(Color.GREEN);
	        g.fillRect(195, 300, 10, 100);

	        // Draw the flower petals
	        g.setColor(Color.PINK);
	        g.fillOval(150, 200, 100, 100);
	        g.fillOval(200, 200, 100, 100);
	        g.fillOval(175, 250, 100, 100);

	        // Draw the flower center
	        g.setColor(Color.BLUE);
	        g.fillOval(200, 250, 50, 50);
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> new MFlowerPlace());
	    }
	}

