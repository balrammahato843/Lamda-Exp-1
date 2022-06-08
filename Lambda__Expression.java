package Lambda_Expression;

//class Test
//{
//    public static int squareIt(int n)
//    {
//        return n*n;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("The square of 4 : " +squareIt(4));
//        System.out.println("The square of 5 : " +squareIt(5));
//    }
//}


import java.util.function.Function;
import java.util.function.Predicate;

//class Test
//{
//    public static void main(String[] args) {
//        Function<Integer,Integer> f=i -> i*i;
//        System.out.println("The square of 40 : " +f.apply(40));
//        System.out.println("The square of 50 : " +f.apply(50));
//    }
//}

//class Test
//{
//    public static void main(String[] args) {
//        Predicate<Integer> p= i -> i%2==0;
//        System.out.println( p.test(4));  //true
//        System.out.println(p.test(5));  //false
//    }
//}



//public void m1()
//{
//System.out.println("Hello");
//}

//-------converted into lamda Expression------------------//

// () -> System.out.println("Hello");

// EX 2 //

//public void m1(int a, int b)
//        {
//        System.out.println(a+b);
//        }

//-------converted into lamda Expression------------------//

       // ( a,  b) -> System.out.println(a+b);

// EX 3 //

//public int squareIt (int n)
//        {
//            return n*n;
//        }
//
//        (int n) -> {return n*n;} //return can be only used within curly braces
//        (int n) -> n*n; // no need of data atype
//        (n) -> n*n;   // if only one parameter dont use paranthesis
//        n -> n*n;  // Lamda Expression


// EX 4 //


//public void m1(String s)
//        {
//            return s.length();
//        }

// s ->  s.length(); // Lamda Expression


// HOW TO WRITE LAMDA EXPRESSIONS //














