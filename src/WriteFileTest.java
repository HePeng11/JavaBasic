import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * 字符流操作文件IO
 * @author hepeng
 *
 */
public class WriteFileTest {
	public static void main(String[] args) {
		try {
			String data = " This content will\r\n append to the end of the file";
			File file = new File("javaio-appendfile.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			System.out.println(file.getCanonicalPath());
			System.out.println(file.getName());
			
			FileWriter fileWritter = new FileWriter(file.getName());//参数可传相对或绝对路径
			fileWritter.write(data);
			fileWritter.close();
			System.out.println("Done");
			
			FileReader fileReader=new FileReader(file.getCanonicalPath());
		    char[] chs = new char[1024] ;
		    int len = 0 ;
		    while((len=fileReader.read(chs))!=-1) {
		        System.out.println(new String(chs,0,len));
		    }
		    fileReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
