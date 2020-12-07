package java1207;

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]array2d= {
				{1,2,3,4,5,6},
				{0,8,9,10,7,12},
				{7,8,9,18,11,13},
				{7,8,9,19,15,14},
				{88,66,92,102,151,999}
				
		};
		new Find().findZero(array2d);
		new Find().findLeft(array2d);
		new Find().findRight(array2d);
		new Find().findUP(array2d);
		new Find().findDown(array2d);
	}

}
