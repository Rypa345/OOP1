package point;

/**
 *
 * @author RYPA
 */
public class Point {

    public static void main(String[] args) {

        class point {
            // member variabel

            private int X;
            private int Y;
//construktor

            public point(int X, int Y) {
                this.X = X;
                this.Y = Y;
            }
//getter and setter

            public int getX() {
                return X;
            }

            public void setX(int X) {
                this.X = X;
            }

            public int getY() {
                return Y;
            }

            public void setY(int Y) {
                this.Y = Y;
            }

   
    public int kuadran() {
        //menghasilkan kuadran dari point
        if (this.X > 0 && this.Y > 0) {
            return 1;
        } else if (this.X < 0 && this.Y > 0) {
            return 2;
        } else if (this.X < 0 && this.Y > 0) {
            return 3;
        } else if (this.X < 0 && this.Y > 0) {
            return 4;
        }
    
}
    }
}
