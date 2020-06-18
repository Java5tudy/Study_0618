import java.util.*;

public class Solution {
    public int solution(int n) {
        int sum = 0 ;
		while(n != 0) {
			sum += n%10; // 나머지
			n /= 10; // 몫
		}
        return sum;
    }
}