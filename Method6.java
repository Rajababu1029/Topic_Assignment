package com.method;

public class Method6 {
	 public  int sumDigits(long num) {
			int sum = 0;
			
			while(num > 0) {
				sum += num% 10;
				num /= 10;
			}
			System.out.println(sum);
			return sum;
		}
	public static void main(String[] args) {
		Method6 m6 = new Method6();
		
		m6.sumDigits(25);
	}

}
