public class ReverseWordsInaString {
    public static void main(String[] args) {

    }
    public static String reverseWords(String s){
        int i = 0;
        String res = "";
        int len = s.length();
        while(i < len){
            while(i<len && s.charAt(i) == ' '){ // checking for spaces in the beginning of the string s
                i++;
            }
            if(i >= len){
                break;
            }
            int j = i + 1;
            while(j < len && s.charAt(j) != ' '){
                j++;
            }
            String subStr = s.substring(i,j);
            if(res.length() == 0){
                res = subStr;
            }
            else{
                res = subStr + " " + res;
            }
            i = j + 1;
        }
        return res;
    }
}
