import java.util.HashMap;

public class LargestSubarrayWith0Sum {

    public static int largestSubArrayWith0Sum(int arr[], int n){

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, max = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
            if(sum ==0){
                max = Math.max(max, i+1);
            }
            if(map.containsKey(sum)){
                max = Math.max(max, i-map.get(sum));
            }
            else {
                map.put(sum, i);
            }
        }return max;
    }

    public static void main(String[] args) {

    }
}
