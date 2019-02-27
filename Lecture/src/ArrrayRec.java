public class ArrrayRec
{
    public static void main(String[] args) {
        int[] nums={7,43,7,54};

               int[] sol= countAll(nums,7,0,0);

    }
    static int[] countAll(int[] nums,int target,int index,int count)
    {
        if(index==nums.length){
            int[] sol=new int[count];
            return sol;}

        if(nums[index]==target) {
            int[] sol = countAll(nums, target, index + 1, count + 1);
            sol[count] = index;
            return sol;
        }

            return countAll(nums,target,index+1,count);
    }
}
