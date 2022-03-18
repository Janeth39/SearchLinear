public class search
{
    public static int sort(int[] array,int num)
    {
        int output = -1;
        if(array.length > 1)
        {

            for (int i = 0; i < array.length; i++)
            {
                if (array[i] == num)
                {
                    num = i;
                }
            }
            System.out.println("Index: " + num);
            output = num;
        }
        return output;

    }
}
