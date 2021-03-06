package main.java;

class Propagate {
	public static void main(String[] args) {
		try {
		Propagate p = new Propagate();
		String j = p.reverse("");
		System.out.println(j);
		}
		catch(Exception e) {
			System.out.println("caught Exception");
			e.printStackTrace();
		}
		finally {
			System.out.println("finally always runs.");
		}
	}
	String reverse(String s) throws Exception{
		if (s.length()==0) {
			throw new Exception();
		}
		String reverseStr = "";
		for(int i=s.length()-1;i>=0;--i) {
			reverseStr += s.charAt(i);
		}
		return reverseStr;
	}
	/*	Output is:
		caught Exception
		java.lang.Exception
		finally always runs.
			at main.java.Propagate.reverse(Propagate.java:20)
			at main.java.Propagate.main(Propagate.java:7)
	 */

}