public class VaryingArguments {

    public static void main(String[] args) {

  System.out.println(getSum(1,2,3));
  System.out.println(getSum(7,7,7));
    }

    public  static  int getSum(int... nums){
        int total = 0;
        for(int n: nums){
            total += n;
        }
        return  total;
    }
}
