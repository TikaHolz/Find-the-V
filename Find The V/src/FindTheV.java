import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class FindTheV
	{
	static int index = 0;

	public static void main(String[] args) throws IOException
		{
		sequentialSearch();
			
		}
	public static void sequentialSearch() throws IOException
		{
		Scanner myFile = new Scanner(new File("FindTheV.txt"));
		while(myFile.hasNext())
			{
			String letter = myFile.next();
			//System.out.println(letter);
			if(letter.equals("v"))
				{
				System.out.println("I found the v");
				System.out.println("The index is: " + index + ".");
				}
			index++;

			}
		}

		}


