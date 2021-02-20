package lab_4;

import java.util.*;

public class GENERIC {
    static Integer testInt[]={1,2,3,4,5,6,7,8,9};
    static String testStr[]={"A","B","C","D","E","F","G","H","I"};
    static Double testDou[]={1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0};
    public static <A>void reverse(A a[]){
    int n =a.length-1;
        for (int i = 0; i < a.length/2; i++) {
            A t = a[i];
            a[i]= a[n];
            a[n]= t;
            n--;
        }
        System.out.println(Arrays.toString(a));
    }
    public static <B>void merig(B a[],B b[]){
        ArrayList<B> merger = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            merger.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            merger.add(b[i]);
        }
        System.out.println("Mereged this "+Arrays.toString(a)+" & "+Arrays.toString(b)+" To This "+merger);
    } 
    public static void main(String[] args) {
        reverse(testInt);
        reverse(testStr);
        reverse(testDou);
        merig(testInt, testStr);
    }
    
}
