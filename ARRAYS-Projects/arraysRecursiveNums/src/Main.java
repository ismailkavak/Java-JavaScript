import java.util.Arrays;

public class Main {

    static boolean isFound(int[] arr,int val){
        for ( int i : arr){
            if ( i == val){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {1,1,2,2,3,4,5,5,6,7,8,8,9,11,12};
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++){
            for ( int j = 0; j < list.length; j++){
                if( (i != j) && (list[i] == list[j]) && ( list[i] % 2 ==0 && list[j] % 2 ==0 )){
                    if (!isFound(duplicate,list[i])){
                        duplicate[startIndex++] = list[i];

                    }

                }
            }
        }


        for ( int value : duplicate){
            if ( value != 0 ){
                System.out.println(value);
            }
        }

    }
}
