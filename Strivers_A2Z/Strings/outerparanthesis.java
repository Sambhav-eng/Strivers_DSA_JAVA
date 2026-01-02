import java.util.*;
public class outerparanthesis
{
    public String removeOuterParanthesis(String s)
    {

        /*brute force 
        String st="" ;
        int l = s.length();
        int depth = 0,a=0 ;
        for (int i = 0; i < l; i++)
        {
            

            if(s.charAt(i)=='(')
            {
            a++;
            depth++;
            }
            else 
            depth-- ;

            if(depth == 0 && a == 1)
            {
                st += "";
                continue;
            }
            else if(depth == 0 && a != 1)
            {
                int k = a;
                while(k>1)
                {
                    st+="()";
                    k--;
                }
            }
            if(depth==0)
             a =0 ;
        }
        return st;*/
        
        StringBuilder st = new StringBuilder();
       int depth = 0;

        for (int i = 0; i < s.length(); i++)
        {
        char c = s.charAt(i);

        if (c == '(')
        {
            if (depth > 0) st.append(c);
            depth++;
        }

        else
        {
            depth--;
            if (depth > 0) st.append(c);
        }
    }
    return st.toString();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        System.out.println("The string must contain only '('or ')'. ");
        System.out.println("Enter your String -> ");
        s=in.nextLine();
        outerparanthesis ob = new outerparanthesis();
        String result = ob.removeOuterParanthesis(s);

        in.close();
        System.out.println(result);
    }
}