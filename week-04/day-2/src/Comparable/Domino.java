package Comparable;

import java.util.Arrays;

    public class Domino implements Comparable<Domino>{
    private final int left;
    private final int right;

    public Domino(int left, int right) {
      this.left = left;
      this.right = right;
    }

    public int getLeftSide() {
      return left;
    }

    public int getRightSide() {
      return right;
    }



    @Override
    public String toString() {
      return "[" + left + ", " + right + "]";
    }


      @Override
      public int compareTo(Domino o) {
        if (left!=o.left){
         return Integer.compare(left,o.left);
        } else {
          return Integer.compare(right,o.right);
        }
      }
    }

