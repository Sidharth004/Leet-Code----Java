import java.util.*;

public class Solution {
    public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<a.length;i++){
            ans.add(a[i]);
        }
        //insert 2nd arr elements into 2nd list
        for(int j=0;j<b.length;j++){
            ans.add(b[j]);
        }

        //need to sort the array first
        Collections.sort(ans);

        //remove duplicates
        /*for(int i=0;i<ans.size();i++){
            if(i==ans.size()-1){
                //return ans;
                continue;
            }
            for(int j=i+1;j<ans.size();j++){
                if((ans.get(i)).equals(ans.get(i+1))){
                    ans.remove(j);
                }
            }
        }
        */
        for(int i=1;i<ans.size();i++){
            if( ans.get(i) == ans.get(i-1)){
				ans.remove(i);
				i--;
				//n--;
			}
        }
        return ans;
    }
}
