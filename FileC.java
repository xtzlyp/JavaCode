package expend;
import java.io.*;
/*
 * �ļ������ļ�
 * copy by xtzlyp@aliyun.com
 * */
public class FileC extends Partents {
	
	public static void main(String []args) throws IOException {
		File filename= new File("file_s/first.txt");
		FileOutputStream fop= new FileOutputStream(filename);//���ļ�
		OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");//���ļ���ʽ���ó� utf-8
		
    }
	
}
