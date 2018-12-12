import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 面向字节流的文件IO
 * @author hepeng
 *
 */
public class FileIOTest {
	
	public static void main(String[] args) {
		try {
			String data = " This content will\r\n append to the end of the file";
			File file = new File("javaio-appendfile.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			System.out.println(file.getCanonicalPath());
			System.out.println(file.getName());
			
			FileOutputStream fops=new FileOutputStream(file);
			fops.write(data.getBytes());
			fops.close();
			
			FileInputStream fips=new FileInputStream(file);
			int len = 0 ;
			byte[] bys = new byte[1024];
			while ((len = fips.read(bys)) != -1) {
			    System.out.println(new String(bys,0,len));
			}
			fips.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
