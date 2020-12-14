import java.io.*;
import java.util.*;
public class HelloWorld 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int N = Integer.parseInt(br.readLine().trim());
         String[] arr_ch = br.readLine().split(" ");
         char[] ch = new char[N];
         for(int i_ch = 0; i_ch < arr_ch.length; i_ch++)
         {
         	ch[i_ch] = arr_ch[i_ch].charAt(0);
         }
         String out_ = FindIt(N, ch);
         System.out.println(out_);
         wr.close();
         br.close();
    }
    static String FindIt(int N, char[] ch)
    {
    	StringBuffer str = new StringBuffer(110);
    	str.append("Some text");
    	for (int i = 0; i <= N; i++) 
    	{
    	  str.append(i);
    	}
    	return str.toString();
    }
}

	