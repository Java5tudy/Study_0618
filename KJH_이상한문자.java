class Solution {
    public String solution(String s) {
        String[] array = s.split(" ");
        String answer = "";
        for(int i = 0; i<array.length; i++) {
            for (int j = 0; j<array[i].length(); j++) {
                char c = array[i].charAt(j);
                String x = String.valueOf(c);
                if(j % 2 == 0) {
                	x.toUpperCase();
                	answer += x;
                }
                else {
                	x.toLowerCase();
                	answer += x;
                }
            }
            for (int k = 0; k<array.length-1;k++) {
                answer.concat(" ");
            }
            
        }
        return answer;
    }
}
