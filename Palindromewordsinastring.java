import java.util.*;
public class Palindromewordsinastring {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String string = "";
        String line = in.nextLine();//The madam drove her racecar to the civic center to meet a radar technician They discussed the level of maintenance required for the rotor and refer to the manual The deified figure was seen as a reviver of traditions and the entire situation was a rotator of events
        line=line+" ";
        String words[]=new String[1000];
        String wordss[]=new String[1000];
        String word="";
        int counter=0,counter2=0;
        int length=line.length();
        for(int i=0;i<length;i++)
        {
            char character=line.charAt(i);
            if(character==' ')
            {
               words[counter]=word;
               counter=counter+1;
               word="";
            }
            else
            word=word+character;
        }
        for(int i=0;i<counter;i++)
        {
            if(words[i]=="@")
            continue;
            wordss[counter2]=words[i];
            for(int j=i+1;j<=counter;j++)
            {
                if(words[i].equals(words[j]))
                {
                    words[j]="@";
                }
            }
            counter2++;
        }
        for(int i=0;i<counter2;i++)
        {
            if(wordss[i]!="@")
            System.out.println(+i+1+"---->"+wordss[i]+" ");
        }
        for(int i=0;i<counter2;i++)
        {
            if(wordss[i]!="@")
            findAllPalindromes(wordss[i]);
        }
    }
    public static void findAllPalindromes(String string) {
        int n = string.length();
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j <= n; j++) 
            {
                String subStr = string.substring(i,j);
                if (isPalindrome(subStr)) 
                {
                    if(subStr.length()>2)
                    {
                    System.out.println("Palindromes in--->"+string);
                    System.out.println(subStr);
                }
                }
            }
        }
    }
    public static boolean isPalindrome(String str) {
        int len = str.length();
        for (int i = 0; i < len/2; i++) {
            if (str.charAt(i) != str.charAt(len-i-1)) {
                return false;
            }
        }
        return true;
    }
}
