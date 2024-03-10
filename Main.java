/* The function accepts string str of size n as an argument. Implement the function which returns 1 if given string str is valid password else 0.
str is a valid password if it satisfies the below conditions.

– At least 4 characters
– At least one numeric digit
– At Least one Capital Letter
– Must not have space or slash (/)
– Starting character must not be a number*/

class checkPass {
    public int checkpwd(String str, int n) {
        //char[] charArr=str.toCharArray();
int num=0,cap=0;

        // Check for empty string
        if (n == 0 ||  n<4 || (str.charAt(0) >= '0' && str.charAt(0) <= '9'))
        return 0;
        
        else{
    
        // Check whether first char of entered String is a Number
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='0' && str.charAt(i)<='9')
            num++;
            if(str.charAt(i)>='A' && str.charAt(i)<='Z')
            cap++;
            if(str.charAt(i)==' ' && str.charAt(i)=='/')
            return 0;
        }
        if(num>0 && cap>0)
        return 1;
        else
        return 0;
    }
        

    }

    
}
class Main
{
    public static void main(String [] args)
    {
        checkPass obj=new checkPass();
        String str="Aedf1234WQERT4212345f/";
        int len=str.length();
        int res=obj.checkpwd(str,len);
        System.out.println("The result is :"+res);
    }
}