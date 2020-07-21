package ex;

/*
 * 
[*] 고전 암호학(Classical Cryptography)에서 사용하는 기법 중 
“Caesar Cipher” 는 
암호화의 대상이 되는 각각의 문자들을 알파벳 상의 
세번째 오른쪽 문자로 치환하는 간단한 치환 암호기법
(즉, a는 d로, b는 e로, … , x는 a로, y는 b로, z는 c로)입니다.  

“everyday we have is one more than we deserve” 라는 문자열에 대해 
Caesar Cipher 를 적용하여 암호화된 문자열 값을 아래와 같이 출력하도록 
Prob4의 클래스의 main 함수를 완성하십시오. 
(단, 공백에 대해서는 치환을 적용하지 않습니다.)

암호화할 문자열 : everyday we have is one more than we deserve
암호화된 문자열 : hyhubgdb zh kdyh lv rqh pruh wkdq zh ghvhuyh

*/
public class Prob3_이원기 {
	public static void main(String[] args) {
		String sourceString = 
		"everyday we have is one more than we deserve";
		String encodedString = "";
		
		int add = 3;
		
		for(int i = 0; i < sourceString.length(); i++) {
			char sourceChar = sourceString.charAt(i);
			char encodedChar;
			
			if(sourceChar >= 'a' && sourceChar <= 'z' ) {
				encodedChar = (char)(sourceChar + add);
				if (encodedChar > 'z') {
					encodedChar -= 26;
				}
			}else if(sourceChar >= 'A' && sourceChar <= 'Z' ) {
				encodedChar = (char)(sourceChar + add);
				if (encodedChar > 'Z') {
					encodedChar -= 26;
				}
			}else {
				encodedChar = sourceChar;
			}
			/*
			if (sourceChar != ' ') {
				encodedChar = (char)(sourceChar + add);
				if (encodedChar > 'z') {
					encodedChar -= 26;
				}
			}else {
				encodedChar = sourceChar;
			}*/
			
			encodedString += encodedChar;
		}
		
		System.out.println("암호화할 문자열 : " + sourceString);
		System.out.println("암호화된 문자열 : " + encodedString);
	}
}
