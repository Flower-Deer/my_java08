package 크롤링;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의주식크롤링 {
	private static JTextField textField;
	private static JButton btnNewButton;
	private static JButton btnNewButton_1;
	private static JButton btnNewButton_2;
	private static JButton btnNewButton_3;
	static JTextArea textArea;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(128, 128, 192));
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CODE :");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(142, 274, 229, 54);
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(new Color(0, 255, 64));
		textField.setFont(new Font("굴림", Font.BOLD, 30));
		textField.setBounds(64, 338, 370, 54);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setForeground(Color.BLUE);
		textArea.setFont(new Font("Monospaced", Font.BOLD, 30));
		textArea.setBounds(64, 501, 382, 152);
		f.getContentPane().add(textArea);
		f.setSize(500,750);
		f.setVisible(true);
		
		btnNewButton = new JButton("모나미");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				크롤링연습6 크롤링 = new 크롤링연습6();
				String result = 크롤링.naver("005360");
				textArea.setText(result);
			}
		});
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton.setBounds(110, 10, 271, 54);
		f.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("삼성전자");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//code를 주면서, 크롤링 해달라하자
				//크롤링연습 5 naver(code)호출!!
				크롤링연습6 크롤링 = new 크롤링연습6();
				String result = 크롤링.naver("005930");
				textArea.setText(result);
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setBounds(110, 89, 271, 54);
		f.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("셀트리온");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				크롤링연습6 크롤링 = new 크롤링연습6();
				String result = 크롤링.naver("068270");
				textArea.setText(result);
			}
		});
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton_2.setBackground(Color.ORANGE);
		btnNewButton_2.setBounds(110, 178, 271, 54);
		f.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("크롤링시작");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String code = textField.getText();
				크롤링연습6 크롤링 = new 크롤링연습6();
				String result = 크롤링.naver(code);
				textArea.setText(result);
			}
		});
		btnNewButton_3.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton_3.setBounds(110, 402, 271, 71);
		f.getContentPane().add(btnNewButton_3);
		
		
		
		
	}
}
