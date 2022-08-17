public class Circulararray {
    void circle(char[] arr,int n,int step){
        char[] circle = new char[n*2];
        for(int i=0;i<n;i++){
            circle[i] = circle[n+i] = arr[i];
        }
        for(int i=step;i<step+n;i++){
            System.out.println(" "+circle[i]);
        }
        return;
    }
    public static void main(String[] args){
        Circulararray cr = new Circulararray();
        char[] a = {'a','b','c','d','e','f'};
        cr.circle(a, 6, 3);
    }
}
