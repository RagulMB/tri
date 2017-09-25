package tri;

import java.io.DataInputStream;
import java.io.*;
public class trin {

	public static void main(String[] args)throws IOException
	{
		// TODO Auto-generated method stub
		int i,j,n=0,x;
		System.out.println("enter a no");
		DataInputStream d=new DataInputStream(System.in);
		x=Integer.parseInt(d.readLine());
		for(i=1;i<=x;i++)
		{
			for(j=1;j<=i;j++)
			{
				n++;
				System.out.print(n+" ");
			}
			System.out.println();
		}

	}

}
