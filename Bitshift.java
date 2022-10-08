
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Bitshift
{
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(new File("bitshift.dat"));
        int goUntil = Integer.parseInt(in.nextLine());
        int counter = 0;
        while(counter<goUntil)
        {
            counter++;
            Shift(in.nextLine());
        }
        

    }
    public static void Shift(String input)
    {
        boolean right = (input.substring(0,2).equals("RS")) ? true : false;
        int shift = Integer.parseInt(input.substring(2,3));
        String daInts = input.substring(4);
        int[] orig = new int[daInts.length()];
        int[] shifted = new int[daInts.length()];
        for(int i = 0; i<daInts.length(); i++)
        {
            orig[i]=Integer.parseInt(daInts.substring(i,i+1));
            //System.out.println(orig[i]);
        }
        //System.out.println(shift);
        if(right)
        {
            for(int i =0; i<daInts.length(); i++)
            {
                if(i<shift)
                {
                    shifted[i]=0; //replacing all the shifted places with a 0
                }
                else
                {
                    shifted[i]=orig[i-shift]; //shifting the array
                }
                System.out.print(shifted[i]);
            }
        }
        else
        {
            for(int i = 0; i<daInts.length(); i++)
            {
                if(i>=daInts.length()-shift)
                {
                    shifted[i]=0; //same as above except from the other side
                }
                else
                {
                    shifted[i]=orig[i+shift];
                }
                System.out.print(shifted[i]);
            }
        }
        System.out.println("");
    }
}