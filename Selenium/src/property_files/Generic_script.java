package property_files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Generic_script {
	@Test
	public void state(String key, String path) throws FileNotFoundException, IOException
	{
		Properties p=new Properties();
		p.load(new FileInputStream(path));
		String a1 = p.getProperty(key);
		System.out.println(a1);
	}
}
