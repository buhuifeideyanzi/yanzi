package java1207;

public class Find {
//column X轴
//row y轴
	void findZero(int array2d[][]) {
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				if (array2d[row][column]==0) {
					System.out.println("坐标是：R_zero("+column+","+row+")");
				}
				
			}
			
		}
	}
	
	void findLeft(int array2d[][]) {
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				if (array2d[row][column]==0) {
					int www=column-1;
					if (www<0) {
						www=column;
					}
					
					System.out.println("坐标是：R_left("+www+","+row+")");
				}
				
			}
			
		}
	}
	
	void findRight(int array2d[][]) {
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				if (array2d[row][column]==0) {
					int www=column+1;
					System.out.println("坐标是：R_right("+www+","+row+")");
				}
				
			}
			
		}
	}
	
	void findUP(int array2d[][]) {
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				if (array2d[row][column]==0) {
					int www=row-1;
					System.out.println("坐标是：R_up("+column+","+www+")");
				}
				
			}
			
		}
	}
	
	void findDown(int array2d[][]) {
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				if (array2d[row][column]==0) {
					int www=row+1;
					System.out.println("坐标是：R_down("+column+","+www+")");
				}
				
			}
			
		}
	}


}
