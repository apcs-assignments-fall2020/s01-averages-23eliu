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
            int userow1 = mat.length/2 - 1;
            int userow2 = mat.length/2;
            double first = mat[userow1][col - 1];
            double second = mat[userow2][0];
            return (first + second)/2;
        }
    }
    

    // Returns the mode of the 2D array mat
    public static double mode(double[][] mat) { 
        // YOUR CODE HERE
        return -1.0;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
