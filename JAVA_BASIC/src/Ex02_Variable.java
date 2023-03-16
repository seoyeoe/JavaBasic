
public class Ex02_Variable {
	public static void main(String[] args) {
		int value;
		value = 100;

		int age = 99;

		// stack에 emp 생성,
		// 주소값 가짐 emp@46d46f4d
		Emp emp;

		// new 연산자 메모리에 올리는 작업
		// heap 영역에 Emp 생성
		emp = new Emp();
		System.out.println(emp);
		System.out.println(emp.empNo);

		int a = 100;
		int b = 200;
		int c = 300;

		int data = 100;

		int result = a + b;
		System.out.println();

	}
}
