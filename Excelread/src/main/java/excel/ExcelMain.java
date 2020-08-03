package excel;

import java.io.IOException;

public class ExcelMain {
	public static void main(String args[]) throws IOException
	{	
   ExcelCode ob=new ExcelCode();
  /* String h=ob.readData(0, 0);
   System.out.println("The String is "+h);
   String g=ob.readData(0, 1);
   System.out.println("The value is "+g);*/
   for(int i=0;i<ob.rowSize();i++)
   {
	   for(int j=0;j<2;j++)
	   {
		  String str=ob.readData(i, j);
		  System.out.println(str);
	   }
   }
	}
	
}
