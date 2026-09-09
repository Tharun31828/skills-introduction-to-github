import java.util.*;

class TwoSum{

    public static void main(String[]) args){

      ArrayList<Integer>ar=new ArrayList<>();

      int a[]={1,2,3,4};

      int target=5

      int left=0;

      int right=left+1;

      while(left < right){

        if(a[left]+a[right]==target){

          ar.add(left);

          ar.add(right);

        }
    }

      System.out.println(ar);
    }
}
