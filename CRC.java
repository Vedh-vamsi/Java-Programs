package merge;
import java.util.*;
public class CRC{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter generator: ");
		String gen=sc.nextLine();
		System.out.println("Enter data");
		String data=sc.nextLine();
		String code=data;
		while(code.length()<(data.length()+gen.length()-1))
			code+="0";
		code=data+div(code,gen);
		System.out.println("Transmitted code: "+code);
		System.out.println("Enter the recieved code: ");
		String rec=sc.nextLine();
		if(Integer.parseInt(div(code,gen))==0)
			System.out.println("Transmitted code doesn't contains errors");
		else
			System.out.println("Transmitted code contains errors");
	}
	static String div(String num1,String num2) {
		int pointer=num2.length();
		String remainder="";
		String result=num1.substring(0,pointer);
		for(int i=0;i<num2.length();i++) {
			if(result.charAt(i)==num1.charAt(i))
				remainder+="0";
			else
				remainder+="1";
		}
		while(pointer<num1.length()) {
			if(remainder.charAt(0)=='0') {
				remainder=remainder.substring(1,remainder.length());
				remainder+=String.valueOf(num1.charAt(pointer));
				pointer++;
			}
			result=remainder;
			remainder="";
			for(int i=0;i<num2.length();i++) {
				if(result.charAt(i)==num1.charAt(i))
					remainder+="0";
				else
					remainder+="1";
			}
		}
		return remainder.substring(1,remainder.length());

	}
}