class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] array = s1.toCharArray();
        Arrays.sort(array);
        String sortedArray = new String(array);

        for(int i = 0; i < s2.length(); i++){
            for(int j = i; j < s2.length(); j++){
                char[] subArray = s2.substring(i, j+1).toCharArray();
                Arrays.sort(subArray);
                
                if(sortedArray.equals(new String(subArray))){
                    return true;
                }
            }
        }
        return false;
    }
}
