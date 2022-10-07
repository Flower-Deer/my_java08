package 형변환;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 신호등2 {
	static JFrame f;

	public static void main(String[] args) {
		f = new JFrame();
		f.setSize(400, 800);
		f.setLayout(new FlowLayout());

		JButton red = new JButton("---빨---");
		JButton yellow = new JButton("---노---");
		JButton blue = new JButton("---초---");
		f.add(red);
		f.add(yellow);
		f.add(blue);

		red.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Object name = e.getActionCommand();
				System.out.println(name);
				신호등2.show(name);
			}
		});
		yellow.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Object name = e.getActionCommand();
				System.out.println(name);
				신호등2.show(name);
			}
		});
		blue.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Object name = e.getActionCommand();
				System.out.println(name);
				신호등2.show(name);
			}
		});

		f.setVisible(true);
	} // main

	public static void show(Object name) {
		String img = "";
		if (name.equals("---빨---")) {
			img = "r.png";
		} else if (name.equals("---노---")) {
			img = "y.png";
		} else {
			img = "g.png";
		}
		ImageIcon icon = new ImageIcon(img);
		JLabel label = new JLabel();
		label.setIcon(icon);
		f.add(label);
		f.setVisible(true);
	}

}