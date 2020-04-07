public class BinarySearch {
    static int[] List = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    public static int binarySearch (int[] list, int key){
        int low = 0;
        int high = List.length - 1;
        while (high >= low){
            int mid = (low + high) / 2;
            if (List[mid] == key)
                return mid;
            else if (List[mid] > key)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(List,2));
        System.out.println(binarySearch(List,11));
        System.out.println(binarySearch(List,79));
        System.out.println(binarySearch(List,1));
        System.out.println(binarySearch(List,5));
        System.out.println(binarySearch(List,80));
    }
}
