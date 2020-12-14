import java.io.*;
import java.util.*;

public class TestClass 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t=0; t<T; t++)
         {
            int N = Integer.parseInt(br.readLine().trim());

            String out_ = Solve(N);
            System.out.println(out_);
         }
         wr.close();
         br.close();
    }
    static String Solve(int N)
    {
        int sum = 0;
        for (int i=1; i<N; i++)
        {
        	if(N%i==0) 
        	{
        		sum = sum + i;
        	}
        }
        if(sum==N)
        {
        	return "YES";
        }
        else
        {
        	return "NO";
        }
    }
}