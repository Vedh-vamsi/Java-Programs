package merge;
import java.io.*;
public class Breader {
	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        double d = Double.parseDouble(br.readLine());
        String s = br.readLine();
        char ch = (char) br.read();
        br.readLine();
        float f=Float.parseFloat(br.readLine());
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        System.out.println("Char: " + ch);
}
}