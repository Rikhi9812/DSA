package sorting;

public class Selection {
    public static void main(String[] args) {
        Selection s = new Selection();
        int[] arr = new int[]{4, 3, 2, 1};
        s.s(arr);
        for(int i : arr) {
            System.out.print(i);
        }
    }

    void s(int[] arr){
        int len  = arr.length -1;
        for(int i=0; i < len; i++){
            int min = i;
            for(int j=i+1; j< len+1; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp; 
        }

    }
}


/*
 * 4 3 2 1
 * 1 3 2 4
 * 1 2 3 4
 */