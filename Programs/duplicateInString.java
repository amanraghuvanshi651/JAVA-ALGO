import java.util.HashMap;

public class duplicateInString {
    
    public void find_dupplicates(String str){

        char[] arr = str.toCharArray();

        HashMap<Integer, String> data = new HashMap<>(); 

        for(int i = 0; i < arr.length - 1; i++){
            Integer count = 1;
            for(int j = i + 1; j < arr.length - 1; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            data.put(arr[i], count);
        }

    }

}
