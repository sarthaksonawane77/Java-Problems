public class practice {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size= scanner.nextInt();
        int[] arr= new int[size];
        System.out.println("Enter array elements");
        for(int i=0;i<size;i++){
            arr[i]= scanner.nextInt();
        }
        int temp;
        for(int i=0;i<size/2;i++){
            temp=arr[i];
            arr[i]=arr[size-1-i];
            arr[size-1-i]=temp;
        }
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
}


