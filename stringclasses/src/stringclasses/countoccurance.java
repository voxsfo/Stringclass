package stringclasses;

import java.util.HashMap;


public class countoccurance
{
    private static void characterCount(String inputString)
    {
        
  
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
  
        
  
        char[] strArray = inputString.toCharArray();
  
       
  
        for (char c : strArray)
        {
            if(charCountMap.containsKey(c))
            {
               
  
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            {
                
                charCountMap.put(c, 1);
            }
        }
         
         
        System.out.println(inputString+" : "+charCountMap);
    }
  
    public static void main(String[] args)
    {
       characterCount("Welcome to Java Training");
  
       characterCount("COVID19");
  
       characterCount("In God We Trust");
    }
}





