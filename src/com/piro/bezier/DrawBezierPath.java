package com.piro.bezier;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawBezierPath extends JFrame {
	private static final long serialVersionUID = 1L;

	private static class View extends JPanel {
		private static final long serialVersionUID = 1L;

		private BezierPath path = new BezierPath();
		
		private float delta = 0.01f;
		
		private int dotSize = 2;
		
		public synchronized void drawBezierPath(String description) {
			path.parsePathString(description);
		}
		
		@Override
		public synchronized void paintComponent(Graphics g) {
			super.paintComponent(g);
			for (float i = 0; i < 1.0f; i += delta) {
				Vector2 v = path.eval(i);
				g.drawOval((int)v.x, (int)v.y, dotSize, dotSize);
			}
		}
	}
	
	public DrawBezierPath () {
		setTitle("Bezier Path");
		
		String svgPath = "M 68.571429,923.79075 C 480,860.93361 511.42857,615.21933 511.42857,615.21933 L 228.57143,286.6479 c 0,0 -305.714287,105.71428 -31.42857,117.14285";

		View v = new View();
		v.drawBezierPath(svgPath);
		add(v);
		
		setSize(500, 500);
	}
	
	public static void main(String[] args) {
		DrawBezierPath usage = new DrawBezierPath();
		usage.setVisible(true);
	}
}
