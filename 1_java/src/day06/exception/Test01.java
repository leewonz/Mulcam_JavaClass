package day06.exception;

public class Test01 {

	public static void main(String[] args) {
		System.out.println("Start");

		String num = "0.4";
		try {
			System.out.println("1 자원 사용");
			System.out.println(20 / Integer.parseInt(num));
			int[] s = new int[Integer.parseInt(num)];
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("데이터 입력 에러");
			System.out.println("정수 숫자만 입력하세요");
			System.out.println("입력 예)4");
		} catch (ArithmeticException e) {
			System.out.println("0 은 X");
		} catch(NegativeArraySizeException e) {
			System.out.println("음수 입력 ㄴㄴ");
		} catch(Exception e) {
			System.out.println("^^ 문제 발생");
		} finally {
			System.out.println("2 자원 반납");
		}

		System.out.println(20 / Integer.parseInt(num));

		System.out.println("");

		System.out.println("End");

	}

}
