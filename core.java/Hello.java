class Hello {
public static void main(String[] args) {
	String s1 = "Hello";
	String s2 = "hello";
	String s3 = s2;
	
	System.out.println(s1.equalsIgnoreCase(s2));
	System.out.println(s2.equalsIgnoreCase(s3));
}
}

