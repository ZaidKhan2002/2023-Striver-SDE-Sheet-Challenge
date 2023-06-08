public class Sort012 {
    public static void sort012(int[] arr)
    {
        //Write your code here
        int low = 0, mid = 0, temp = 0;
        int high = arr.length - 1;

        while(mid <= high){
            switch (arr[mid]){
                case 0: {
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }

                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }
            }
        }
    }
}
