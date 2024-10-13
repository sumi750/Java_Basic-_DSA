package queue;

public class ArrayImplement {
    public static class queueA{
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[100];

        public void add(int val){
            if(r == arr.length-1) {
                System.out.println("Queue is Full");
                return;
            }
            if(f == -1){
                f = r = 0;
                arr[0] = val;
            }
            else{
                arr[r+1] = val;
                r++;
            }
            size++;
        }

        public int remove(){
            if(size==0) {
                System.out.println("Queue is Empty");
                return -1;
            }
            f++;
            size--;
            return arr[f-1];
        }

        public int peek(){
            return arr[f];
        }

        public boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }

        public void display(){
            if(size==0){
                System.out.println("Queue is Empty");
                return;
            }
            for(int i=f;  i<=r; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        queueA q1 = new queueA();
        q1.display();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.display();
    }
}
