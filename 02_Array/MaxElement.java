
public class MaxElement {
    public static int findMax(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max =arr[i];

            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] arr ={3 ,2 , 7 ,9,5};
        System.out.println(findMax(arr));
    }
}
