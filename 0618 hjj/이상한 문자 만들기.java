class Solution {
    public String solution(String s) {
        String answer = "";
	    String sss = "";
	    int index = 0;
	     
	    for(int i = 0; i < s.length(); i++) {
	        sss = s.substring(i, i+1); //한글자씩(인덱스) 자르기
	    	if(sss.equals(" ")) { // 공백 체크
	    	    answer += sss; 
	    		index = 0; 
	    	} else {
	    		if(index % 2 == 0 ) { 
	    			answer += sss.toUpperCase();
	    		} else { 
	    			answer += sss.toLowerCase();
	    		}
	    		index++;	    		
	    	}
	     }
	     return answer;
      }
}