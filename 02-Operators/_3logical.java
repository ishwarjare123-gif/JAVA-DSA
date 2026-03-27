public class logical {
    public static void main(String[] args) {
        // logical AND  (&&)
        System.out.println((3>2)&&(5>4));  // both statement must be true then output is true
         System.out.println((3<2)&&(5>4));  // if any statement false or both false  then output is false

        //logical OR (||)
         System.out.println((3>2)||(5>4));   // If any statement is true then output is true
          System.out.println((3<2)||(6<4));  // If both Statement is false then output is false

            //logical NOT (!)
         System.out.println(!(3>2));   // IF staement is true then then output is opposite (false)
          System.out.println(!(3<2)); //  F staement is false then then output is opposite (true)
    }
}
