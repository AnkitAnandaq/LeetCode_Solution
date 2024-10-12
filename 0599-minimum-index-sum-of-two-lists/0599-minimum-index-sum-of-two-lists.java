class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int minSum = Integer.MAX_VALUE;
        String[] tempResult = new String[list1.length + list2.length];
        int resultCount = 0;

        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    int indexSum = i + j;

                    if (indexSum < minSum) {
                        minSum = indexSum;
                        resultCount = 0;
                        tempResult[resultCount++] = list1[i];
                    } else if (indexSum == minSum) {
                        tempResult[resultCount++] = list1[i];
                    }
                }
            }
        }
        String[] result = new String[resultCount];
        for (int k = 0; k < resultCount; k++) {
            result[k] = tempResult[k];
        }
        return result;
    }
}