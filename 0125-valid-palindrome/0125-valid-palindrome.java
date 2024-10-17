class Solution {
    public boolean isPalindrome(String s) {

         String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
         int start=0;
         int end=result.length()-1;
         while(start<=end){
            if(result.charAt(start)!=result.charAt(end)){
                return false;
            }
            start++;
            end--;
         }
         return true;
        // StringBuilder trimmedStr = new StringBuilder();
        // for (char c : s.toCharArray()) {
        //     if (Character.isLetterOrDigit(c)) {
        //         trimmedStr.append(Character.toLowerCase(c));
        //     }}
        // String forwardStr = trimmedStr.toString();
        // String reversedStr = trimmedStr.reverse().toString();
        // return forwardStr.equals(reversedStr);
    }
}