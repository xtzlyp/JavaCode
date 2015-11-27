package expend;
import java.io.*;
/*
 * 控制流文件
 * copy by xtzlyp@aliyun.com
 * */
public class Contro extends Partents {
	
	public static void main(String []args) throws IOException {
		/*char c;
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      do {
	         c = (char) br.read();
	         System.out.println(c);
	      } while(c != 'q');
	      */
		
		String c;
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
	      do {
	    	  	System.out.print(1);
		         c = br.readLine();
		         System.out.println(c);
		      } while(!c.equals("end"));
    }
	
	
	
}
