public class MyMain {

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) {
        double count = 0;

        for (int row = 0; row < mat.length; row++) {
			for (int col = 0; col < mat[0].length; col++) {
				count += mat[row][col];
			}
		}

        double size = mat.length * mat[0].length;
        double fin = count/size;
        return fin;
    }

    // Returns the median of the 2D array mat
    public static double median(double[][] mat) { 
        int size = mat.length * mat[0].length;
        int row = mat.length;
        int col = mat[0].length;

        if (size % 2 != 0) {
            int userow = row/2;
            int usecol = col/2;
            return mat[userow][usecol];
        }

        if (row%2 == 0) {
            int userow1 = row/2 - 1;
            int userow2 = row/2;
            double first = mat[userow1][col - 1];
            double second = mat[userow2][0];
            return (first + second)/2;
        }

        int userow = row/2;
        int usecol1 = col/2 - 1;
        int usecol2 = col/2;
        double first = mat[userow][usecol1];
        double second = mat[userow][usecol2];
        return (first + second)/2;
    }
    

    // Returns the mode of the 2D array mat
    public static double mode(double[][] mat) {
        int count = 0;
        int temp = 0;
        double num = 0;
        for (int row = 0; row < mat.length; row++) {
			for (int col = 0; col < mat[0].length; col++) {

                double test = mat[row][col];
                for (int row1 = 0; row1 < mat.length; row1++) {
			        for (int col1 = 0; col1 < mat[0].length; col1++) {
				        if (mat[row1][col1] == test) {
                            count++;
                        }
			        }
                }
                if (count > temp) {
                    num = test;
                    temp = count;
                    count = 0;
                }
                else {
                    continue;
                }
			}
        }
        
        return num;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
