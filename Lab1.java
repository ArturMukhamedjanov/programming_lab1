import java.util.Arrays;
public class Lab1{
	public static void main(String[] args){
        	long[] h;
		int indx = 0;
        	h = new long[(18 - 2) / 2 + 1];
        	for(int i = 18; i >= 2; i--){
        		if(i % 2 == 0){
				h[indx] = i;
				indx += 1;
			}
        	}
        	System.out.println(Arrays.toString(h));

		float[] x;
		x = new float[14];
		for(int i = 0; i< 14; i++){
			x[i] = (float)Math.random() * 26 - 11;
		}
		System.out.println(Arrays.toString(x));

		double[][] s;
		s = new double[9][14];
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 14; j++){
				if(h[i] == 18){
					s[i][j] = Math.atan((2 / 3) * (1 / (Math.pow(Math.E, Math.abs(x[j])))));
					System.out.printf("%5.3f", s[i][j]);
					System.out.print(" ");
					continue;
				}
				if(h[i] == 4 || h[i] == 6 || h[i] == 10 || h[i] == 12){
					s[i][j] = Math.pow((Math.pow(Math.E, x[j] * (Math.cbrt(x[j]) - 3))) / (Math.asin(Math.cos(x[j])) + 0.5), 2);
					System.out.printf("%5.3f", s[i][j]);
					System.out.print(" ");
					continue;
				}
				s[i][j] = Math.cbrt(Math.cbrt(Math.pow(Math.E, Math.log(Math.abs(x[j])))));
				System.out.printf("%5.3f", s[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}