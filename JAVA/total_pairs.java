class Solution
{
    public int TotalPairs(int[] nums, int x, int y)
    {
        // Code here 
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int pro=nums[i]*nums[j];
                if(x<=pro&&pro<=y)
                {
                    c++;
                }
            }
        }
        return c;
    }
}
/*output
Input: nums[] = {3,5,5,2,6}, x = 8, y = 13
Output: 3
Explanation: Pairs which satisfiy the given
conditions are (2,4), (3,4), (4,5).*/
