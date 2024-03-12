package sorting;

public class Insertion {


    public static void main(String[] args) {
        Insertion i = new Insertion();
        int[] arr = new int[]{4, 3, 2, 1};
        System.out.println(System.currentTimeMillis());
        i.i(arr);
        for(int b : arr) {
            System.out.print(b);
        }
        
    }

    void i(int[] arr){
        for(int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key; 
            
        }
    }
    
}
