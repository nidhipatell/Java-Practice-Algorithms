public class main
{
    public static void main(String[] args) 
    
    {
        int [] arr1 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int [] arr2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        sorting in = new sorting();
        in.sort(arr1);
        in.printArray();
        /** Best case and worst case: O(n^2) // if its already sorted then o(n) */

        System.out.println("Quick sorting");
        Quicksort qs = new Quicksort();
        qs.inPlaceQuicksort(arr2, 0, arr2.length - 1);
        qs.printArr();
        /** worst case: o(n^2) and best case: nlogn */
    }
}