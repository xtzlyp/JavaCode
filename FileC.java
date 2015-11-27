package expend;
import java.io.*;
/*
 * 文件操作文件
 * copy by xtzlyp@aliyun.com
 * */
public class FileC extends Partents {
	
	public static void main(String []args) throws IOException {
		File filename= new File("file_s/first.txt");
		FileOutputStream fop= new FileOutputStream(filename);//打开文件
		OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");//把文件格式设置成 utf-8
		
    }
	
}
