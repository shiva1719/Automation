package property_files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Fetch_value_by_propertyfile {
@Test
public void state() throws FileNotFoundException, IOException
{
	Properties p=new Properties();
	p.load(new FileInputStream("./p.properties"));
	String a1 = p.getProperty("baseurl");
	System.out.println(a1);
}
}
