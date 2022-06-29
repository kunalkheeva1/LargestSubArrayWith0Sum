import java.util.HashMap;

public class LargestSubarrayWith0Sum {

    public static int largestSubArrayWith0Sum(int arr[], int n){

        HashMap<Integer, Integer> map = new HashMap<>();
        //sum and the max index
        int sum = 0, max = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];

            //if sum is zero jsut ruturn its index + 1, which will be the count of largest subarray of zeros
            if(sum ==0){
                max = Math.max(max, i+1);
            }
            //if map contains sum then check it with the already stored sum
            // and update the max according to the index of newly added sum
            if(map.containsKey(sum)){
                max = Math.max(max, i-map.get(sum));
            }
            //else put sum wrt its index
            else {
                map.put(sum, i);
            }
        }return max;
    }

    public static void main(String[] args) {

    }
}
