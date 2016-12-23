package fib;

public class Fib {

	public long cal(int num) throws Exception {
		if(num < 0){
			throw new Exception("n should be > 0");
		}

		if(num==0 || num==1){
			return num;
		}

		return sum(num);
	}

	public long sum(int num) {
		long sum = 0, tmp1 = 0, tmp2 = 1;
		for (int i = 2; i <= num; i++) {
			sum = tmp1 + tmp2;
			tmp1 = tmp2;
			tmp2 = sum;
		}
		return sum;
	}
}
