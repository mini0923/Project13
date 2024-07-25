package innerclass.quiz;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Quiz1 {

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setLayout(new FlowLayout());
		frame.setBounds(500, 300, 500, 300);
		frame.setVisible(true);
		

		// 키 이벤트 등록하기
		// 프레임을 열고, 키를 누르면 -> 키를 눌렀습니다 출력
		
		// 구현 클래스 사용해서 등록
//		frame.addKeyListener(new EventHandler());
		
		// 익명 클래스를 사용해서 등록
		frame.addKeyListener(new KeyListener() {
				
			
			
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println(e.getKeyChar());
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("키를 눌렀습니다.");
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
			}
			

		});
		
		
	}

}

class EventHandler implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("키를 눌렀습니다");
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}


}
