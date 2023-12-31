package code;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Student_Login extends InheritanceFrame {
	
	private JButton loginbtn = new JButton();
	
	private JTextField idtx = new JTextField();
	private JTextField pwtx = new JTextField();
	
	public Student_Login() {
		super("STUDENT LOGIN", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setLayout(null);
		
		JButtonStyle(loginbtn, 400, 530, "Student_LogIn_Screen_Login_Button.png");
		
		TextFieldStyle(idtx, 285);
		TextFieldStyle(pwtx, 410);
		
		JLabel lb = new JLabel(new ImageIcon(getClass().getResource("/image/Student_Login_Screen.png")));
        lb.setBounds(0, 0, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
        add(lb);
        
        loginbtn.addActionListener(e -> {
        	dispose();
        	new Student().setVisible(true);
        });
        
	}
	
	// 버튼 설정 메소드
    private void JButtonStyle(JButton button, int x, int y, String imageName) {
        button.setIcon(new ImageIcon(getClass().getResource("/image/" + imageName))); // 버튼 이미지 아이콘 설정
        button.setBorderPainted(false); // 버튼 테두리 제거 
        button.setContentAreaFilled(false); // 버튼 내부 영역 투명하게 설정 → 배경색상표시X
        button.setFocusPainted(false); // 포커스 받을 때 테두리 표시되지 않도록 설정
        button.setBounds(x, y, 500, 65); // 버튼 위치 나타내는 x, y좌표와 버튼 크기 설정인 가로 500, 세로 65
        add(button); // 프레임 추가
    }
    
 // 텍스트필드 설정 메소드
    private JTextField TextFieldStyle(JTextField textField, int x) {
        textField.setBounds(500, x, 450, 55);
        textField.setBackground(Color.decode("#DFD4D6"));
        textField.setFont(new Font("SUITE", Font.PLAIN, 18));
        textField.setBorder(BorderFactory.createEmptyBorder());
        add(textField);
        return textField;
    }

}
