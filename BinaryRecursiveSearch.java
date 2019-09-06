public class BinaryRecursiveSearch implements Practice03Search
{
    public int search(int[]a, int target)
    {
        int low=0;
        int high = a.length-1;
        return search(a, target, low, high );
    }

    public int search(int[]a, int target, int low, int high)
    {
        if (low>high)
        {
            return -1;
        }
        int mid = (high+low)/2;
        if (target==a[mid])
        {
            return mid;
        }
        if (target > a[mid])
        {
            return search(a,target,mid+1,high);
        }
        else 
        {
            return search(a, target, low, mid-1);
        }
    }

    public String searchName()
    {
        return "Binary Recursive Search";
    }
}