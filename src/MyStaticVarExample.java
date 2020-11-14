// This demonstrates the use of a static variable
public class MyStaticVarExample {     // declaring of a class MyStaticVarExample
       public static String myClassVariable = "My static or class variable"; // static variable declaration

    /*main function begins */
    public static void main(String args[]){
        /* creation of 3 objects of class MyStaticVarExample*/
     MyStaticVarExample obj_01 = new MyStaticVarExample();
     MyStaticVarExample obj_02 = new MyStaticVarExample();
     MyStaticVarExample obj_03 = new MyStaticVarExample();

    /*Testing outputs of the created objects*/
        System.out.println(obj_01.myClassVariable);
        System.out.println(obj_02.myClassVariable);
        System.out.println(obj_03.myClassVariable);

     /*Changes made to object obj_02*/
        obj_02.myClassVariable = "Content changed";
        /*Testing how the changes made to obj_02 also affected the other two objects*/
        System.out.println(obj_01.myClassVariable);
        System.out.println(obj_02.myClassVariable);
        System.out.println(obj_03.myClassVariable);
    }
}
