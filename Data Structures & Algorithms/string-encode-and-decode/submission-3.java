class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        for(String s : strs){
            str.append(s.length()).append('>').append(s);
        }
        return str.toString();
    }

    //"4#Hello5#World"
    //i.j 
    //.ij 
    //.i......j
    
    public List<String> decode(String str) {
    List<String> strs = new ArrayList<>();
    int i = 0;

    while (i < str.length()) {
        int j = i;
        while (str.charAt(j) != '>') {
            j++;
        }
        int length = Integer.parseInt(str.substring(i, j));

        i = j + 1;

        String s = str.substring(i, i + length);
        strs.add(s);

        i = i + length;
    }

    return strs;
}
}
