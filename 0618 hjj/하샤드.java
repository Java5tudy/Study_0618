class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
		int a = x;
      
		while (a != 0) {
			sum += a % 10; //나머지
			a /= 10; //몫
		}

		if (x % sum == 0) return true;
        
        return false;
			
        }
}