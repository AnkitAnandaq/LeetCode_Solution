class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String jword1 = String.join("" , word1);
        String jword2 = String.join("" , word2);

        return jword1.equals(jword2);
    }
}