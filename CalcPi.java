public class CalcPi {
	public static void main(String [] args) { 
		int cnt = Integer.parseInt(args[0]);
		double sum = 0;
		int sign;
		for (int i = 0; i < cnt; i ++){
			if (i % 2 == 0){
				sign = 1;
			}
			else {
				sign = -1;
			}
			double denominator = (1 + (2 * i));
			sum = sum +  sign * (1/denominator);
		}
		double approximated = sum * 4;
		double javaPi = Math.PI;
		System.out.println("pi according to Java: " + javaPi);
		System.out.println("pi, approximated: " + approximated);
	}
}
