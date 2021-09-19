
public class StringToInt {

	public static void main(String []args){
        String words[] = "hello this is alpha 5051 8888 and 9475".split(" ");
        int max = 0;
        for(String s:words)
        {
            if(s.charAt(0) >= 48 && s.charAt(0) <= 57)
            {
                int x = Integer.parseInt(s);
                boolean flag = true;
                int temp = x;
                while(temp>0)
                {
                    int l = temp%10;
                    if(l==9)
                        flag = false;
                    temp/=10;
                }
                if(flag)
                    max = Math.max(x, max);
            }
        }
        System.out.println(max);
     }

}
