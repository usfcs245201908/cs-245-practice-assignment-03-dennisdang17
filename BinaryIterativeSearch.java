public class BinaryIterativeSearch implements Practice03Search
{
    public int search(int[]a, int target)
    {
        int mid, low, high;
        low=0;
        high=a.length-1;
        for (int i=0; i<a.length; i++)
        {
            mid = (high+low)/2;
            if (a[mid] == target)
            {
                return mid;
            }
            if (target > a[mid])
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return -1;
    }

    public String searchName()
    {
        return "Binary Iterative Search.";
    }
}