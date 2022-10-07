package 형변환;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class 신호등 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(0, 0, 0));
		f.setSize(618,692);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton b1 = new JButton("빨강신호");
		b1.setFont(new Font("굴림", Font.BOLD, 30));
		b1.setBackground(new Color(255, 0, 0));
		f.getContentPane().add(b1);

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//라벨을만든다.
				JLabel img = new JLabel();
				//이미지 아이콘을 만든다.
				ImageIcon icon = new ImageIcon("r.png");
				//라벨에 이미지를 낀다.
				img.setIcon(icon);
				//f에 라벨을낀다.
				f.add(img);
				f.setVisible(true);
			}
		});
		
		JButton b2 = new JButton("노랑신호");
		b2.setFont(new Font("굴림", Font.BOLD, 30));
		b2.setBackground(new Color(255, 255, 0));
		f.getContentPane().add(b2);

		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JLabel img = new JLabel();
				ImageIcon icon = new ImageIcon("y.png");
				img.setIcon(icon);
				f.add(img);
				f.setVisible(true);
			}
		});
		
		JButton b3 = new JButton("파랑신호");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel img = new JLabel();
				ImageIcon icon = new ImageIcon("g.png");
				img.setIcon(icon);
				f.add(img);
				f.setVisible(true);
			}
		});
		b3.setFont(new Font("굴림", Font.BOLD, 30));
		b3.setBackground(new Color(0, 0, 255));
		f.getContentPane().add(b3);
		f.setVisible(true);
	
	}
}
