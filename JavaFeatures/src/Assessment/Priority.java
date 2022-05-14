package Assessment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import thread.MyThread1;

class ThreadClass extends Thread
{
	public ThreadClass()
	{
		System.out.println(Thread.currentThread().getPriority());
	}
}
public class Priority 
{
	public static void main(String[] args) throws IOException 
	{
		FileOutputStream fos=new FileOutputStream("C:/output.txt");
		String data = "Learning ";
		fos.write(data.getBytes());
		fos.close();
//		fos = new FileOutputStream("C:/output.txt");
//		data = "Java is really fun!";
//		fos.write(data.getBytes());
//		fos.close();
	}
}