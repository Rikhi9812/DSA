package searching;

public class Ternary {
    public static void main(String[] args) {

        int[] array = {1, 5, 6, 7, 8, 10};
        int key = 10;
        int left = 0;
        int right = array.length-1;
        System.out.println(TernarySearch(array, key, left, right));
        
    }

    public static int TernarySearch(int[] array, int key, int left, int right){

        if (right >= left) {
            int mid1 = left + ( right - left) /3;
            int mid2 = right - ( right - left) /3;
            
            if(array[mid1] == key) {
                return mid1;
            }
            
        if(array[mid2] == key) {
            return mid2;
        }

        if(array[mid1] > key) {
            return TernarySearch(array, key, left, mid1-1);
        } else if(array[mid2] < key) {
            return TernarySearch(array, key, mid2+1, right);
        } else if(array[mid1] < key && array[mid2] > key) {
            return TernarySearch(array, key, mid1+1, mid2-1);
        }
    }


        return -1;

    }
}
