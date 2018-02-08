import java.io.*;
import java.util.*;
public class Tester
{
    public static void main(String args[]) throws IOException
    {
        Scanner in = new Scanner(new File("input.txt"));

        while(in.hasNext())
        {
            String[] strs = in.nextLine().split(", ");
            double[] nums = new double[strs.length];
            for(int i = 0; i < nums.length; i++)
                nums[i] = Double.parseDouble(strs[i]);

            BST bst = new BST();
            for(double num : nums)
                bst.insertValue(num);


        }
    }
}
