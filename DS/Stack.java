class Stack{
    int max = 1000;
    int a[] = new int[max];

    int top = -1;

    public void push(int data) {
        a[++top] = data;
    }

    public int pop(){
        int delete = a[top];
        top--;
        return delete;
    }

    public int peak(){
        return a[top];
    }

    public int size(){
        return top+1;
    }

    public void print(){
        for(int j = top; j > -1; j--){
            System.out.println(a[j]);
        }
    }
    public static void main(String[] args) {

        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.print();
        s.peak();
        System.out.println();
        s.pop();
        s.size();
        s.print();


        
    }
}