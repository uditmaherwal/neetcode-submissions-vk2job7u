class Solution {

    public boolean isFreqSame(int[] freq1, int[] freq2){
        for(int i = 0; i < 26; i++){
            if(freq1[i] != freq2[i]){
                return false;
            }
        }
        return true;
    }


    public boolean checkInclusion(String s1, String s2) {
        int[] frequency = new int[26];

        for(int i = 0; i < s1.length(); i++){
            frequency[s1.charAt(i) - 'a']++;
        }

        int l = 0;
        for(int r = 0; r < s2.length(); r++){
            int windIdx = 0;
            int idx = r;
            int[] windfrequency = new int[26];
            while(windIdx < s1.length() && idx < s2.length()){
                windfrequency[s2.charAt(idx) - 'a']++;
                idx++;
                windIdx++;
            }
            
            if(isFreqSame(frequency, windfrequency)){
                return true;
            }
        }
        return false;
    }
}
