package basic.split;

public class SplitClient {
public static void main(String[] args) {
	SplitTest splitTest = new SplitTest();
	String mc = splitTest.splitDemo();
	String[] spl = mc.split(",");
	for(String i:spl) {
		System.out.println(i);
	}
}
}
