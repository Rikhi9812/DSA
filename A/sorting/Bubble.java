package sorting;

public class Bubble{
    public static void main(String[] args) {
        Bubble b = new Bubble();
        int[] arr = new int[]{4, 3, 2, 1};
        System.out.println(System.currentTimeMillis());
        b.b(arr);
        for(int i : arr) {
            System.out.print(i);
        }
    }

    void b(int[] arr){
        boolean swapped;
        for(int i=0; i< arr.length-1; i++) {
            swapped = false;
            for(int j=0; j< arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false)
            break;
        }
    }
}

/*
 * 4 3 2 1
 * 3 4 2 1
 * 3 2 4 1
 * 3 2 1 4
 * 
 */