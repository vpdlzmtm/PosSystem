package saleSystem;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Login { 
	
	private static Login singleton = new Login();
	private Login() {}
	public static Login getInstance() {
		return singleton;
	}
	
	
	
	
	// 로그인 화면 생성 및 로그인 구분
	private String login;
	private String Password;
	private String truelogin;
	private String truepassword;
	
	
	DateTimeFormatter dft = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
	
	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getTruelogin() {
		return truelogin;
	}

	public void setTruelogin(String truelogin) {
		this.truelogin = truelogin;
	}

	public String getTruepassword() {
		return truepassword;
	}

	public void setTruepassword(String truepassword) {
		this.truepassword = truepassword;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	
	
	Scanner sca = new Scanner(System.in);
	//Scanner scapass = new Scanner(System.in);
	//int N=in.nextInt();

	
	public void getLogin() { //아이디와 비밀번호를 정해놓고 시도.	
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		while(true) {			
			System.out.println("ID를 입력하세요 : ");
			String scalogin = sca.next();
			System.out.println("패스워드를 입력하세요 : ");
			String scapassword = sca.next();
			if(scalogin.equals(getTruelogin()) && scapassword.equals(getTruepassword())) {
				System.out.println("오늘 하루도 힘차게");
				LocalDateTime login = LocalDateTime.now();
				setLogintime(login);				
				System.out.println(login.format(dft));
				break;				
			} else {
				System.out.println("ID 혹은 Password가 틀립니다. 다시 입력해주세요.");
			}					
		} 
		
	}	
	
	public LocalDateTime getLogintime() {
		return logintime;
	}

	public void setLogintime(LocalDateTime logintime) {
		this.logintime = logintime;
	}


	private LocalDateTime logintime = LocalDateTime.now();
	

}