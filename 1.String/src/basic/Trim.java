package basic;

//trim() method: remove whitespace of leading and  trailing spc
public class Trim {
public static void main(String[] args) {
	
	String trm = "edt6tn 5bym ry thu f";
	//String op = trm.trim();
	String[] spl = trm.split("\\s");
	for(String t: spl) {
		System.out.print(t);
	}
	}
}
