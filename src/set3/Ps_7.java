package set3;

/**
 *
 * @author rajes
 */
public class Ps_7 
{
    public int countVowel(String num)
    {
        int count=0;
        for(int i=0;i<num.length();i++)
        {
            char temp = num.charAt(i);
            if(temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u')
                count++;
        }
        return count;
    }
    public int totalVowelCount(int []num,String []text)
    {
        int sum = 0;
            for(int i=0;i<num.length;i++)
            {
                sum += countVowel(text[num[i]]);
            }
        return sum;
    }
    public int pair(int []num,String []text)
    {
        int count = 0;
        int targetSum =totalVowelCount(num,text);
        for(int i=0;i<num.length-1;i++)
        {
            for(int j=i+1;j<num.length;j++)
            {
                if(num[i]+num[j] == targetSum)
                    count++;
            }
        }
        return count;
    }
    public static void main(String args[])
    {
        int num[] = {7,4,2};
        String[] numbers = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
            "twentyone", "twentytwo", "twentythree", "twentyfour", "twentyfive", "twentysix", "twentyseven", "twentyeight", "twentynine", "thirty",
            "thirtyone", "thirtytwo", "thirtythree", "thirtyfour", "thirtyfive", "thirtysix", "thirtyseven", "thirtyeight", "thirtynine", "forty",
            "fortyone", "fortytwo", "fortythree", "fortyfour", "fortyfive", "fortysix", "fortyseven", "fortyeight", "fortynine", "fifty",
            "fiftyone", "fiftytwo", "fiftythree", "fiftyfour", "fiftyfive", "fiftysix", "fiftyseven", "fiftyeight", "fiftynine", "sixty",
            "sixtyone", "sixtytwo", "sixtythree", "sixtyfour", "sixtyfive", "sixtysix", "sixtyseven", "sixtyeight", "sixtynine", "seventy",
            "seventyone", "seventytwo", "seventythree", "seventyfour", "seventyfive", "seventysix", "seventyseven", "seventyeight", "seventynine", "eighty",
            "eightyone", "eightytwo", "eightythree", "eightyfour", "eightyfive", "eightsix", "eightyseven", "eightyeight", "eightynine", "ninety",
            "ninetyone", "ninetytwo", "ninetythree", "ninetyfour", "ninetyfive", "ninetysix", "ninetyseven", "ninetyeight", "ninetynine", "onehundred"
        };
        Ps_7 obj = new Ps_7();
        
        int pairCount = obj.pair(num,numbers);
        if(pairCount<numbers.length)
            System.out.println(numbers[pairCount]);
        else
            System.out.println("Pair Count Exceeds");
    }
}
