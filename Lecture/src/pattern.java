public class pattern
{
    public static void main(String[] args)

        int[] nums=int[]{3,5,1,6};
        pattern(5,0,nums);
    }

    public static void pattern(int row,int col,int[] nums) {
        if(row==0)
            return ;

        if(row==col)
        {

         pattern(row-1,0,nums);
         return;
        }

        if(nums[])
        pattern(row,col+1,nums);


    }
}
