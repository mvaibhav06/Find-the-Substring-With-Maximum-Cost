import java.util.List;

public class MaxCost {
    public static int maximumCostSubstring(String s, String chars, int[] vals) {
        List<Character> temp = List.of('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');

        int out = 0;
        for(int i=0; i<s.length(); i++){
            int max = 0;
            int index = chars.indexOf(s.charAt(i));
            if(index == -1){
                index = temp.indexOf(s.charAt(i))+1;
            }else {
                index = vals[index];
            }
            max += index;
            if(max < 0){
                max = 0;
            }
            if(max > out){
                out = max;
            }

        }
        return out;
    }

    public static void main(String[] args) {
        int[] vals = {-1000};
        System.out.println(maximumCostSubstring("adaa","d",vals));
    }
}
