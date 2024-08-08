class incdec {
	public static void main(String[] args){
		int a = 30;
		int b = a++;
		int c = ++a;
		int d = a--;
		int e = --a;
		System.out.println("a: " + a + ", b: " + b);
		System.out.println("a: " + a + ", c: " + c);
		System.out.println("a: " + a + ", d: " + d);
		System.out.println("a: " + a + ", e: " + e);
	}
}