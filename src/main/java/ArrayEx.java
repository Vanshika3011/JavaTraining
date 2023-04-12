public class ArrayEx {
    static void printArray(int arr[]){
        for(int value : arr){
            System.out.println(value);
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[3];
        arr[0]= 1;
        arr[1]= 2;
        arr[2]= 3;
        System.out.println(arr[0]);
        System.out.println();

        String s[] = {"Ram", "Sam", "Ria", "Ali"};
        for(int i=0; i<s.length; i++){
            System.out.println(s[i]);
        }
        System.out.println();
        for(String k:s){
            System.out.println(k);
        }

        printArray(new int[]{1,2,3,4,5});
    }
}
