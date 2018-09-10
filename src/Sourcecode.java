
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
 
class Sourcecode {
	private static FileInputStream fs = null;
	private static DataInputStream in = null;
	private static BufferedReader br = null;
	public static void main(String args[]) {
		try {
			fs = new FileInputStream("//Users//kahuja-mbp//eclipse-workspace//Testing//src//Sourcecode.java");
			in = new DataInputStream(fs); 
			br = new BufferedReader(new InputStreamReader(fs));
			String s = null;
			StringBuilder s1 = null;
			Integer i=new Integer(1);
			
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(null != in) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
} 
