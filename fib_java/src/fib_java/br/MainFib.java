package fib_java.br;

public class MainFib {
	public static int fib(int valorFib) {
		if(valorFib == 0){
			return 0;
		} else if(valorFib == 1) {
			return 1;
		}else {
			return fib(valorFib - 1) + fib(valorFib -2 );
		}
	}
	
	public static void main(String[] args) {
		System.out.println(fib(10));
	}

}
