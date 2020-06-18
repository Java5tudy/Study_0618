class Solution {
    public long solution(long n) {

		if(Math.pow((int)Math.sqrt(n), 2) == n) // 제곱근이 정수인지 확인, 다시 제곱해서 n과 같다면 정수
			return (int)Math.pow(Math.sqrt(n) + 1, 2);
		return -1; 
    }
}