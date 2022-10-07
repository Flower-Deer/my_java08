package 형변환;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 형변환그래픽 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300,300);
		f.setLayout(new FlowLayout());
		
		JButton b= new JButton("나는 버튼");
		f.add(b); //component(부모) <---Button(자식)
		
		JTextField t = new JTextField("나는 텍스트");
		f.add(t);
		
		JLabel l = new JLabel("나는라벨");
		f.add(l);
		
		JTextField tf = new JTextField("나는 텍스트 필드");
		f.add(tf);
		
		f.setVisible(true);
	}

}
