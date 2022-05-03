import java.util.ArrayList;

public class coreJavaBrushUp {

    public static void main(String[] args){

        // Variables
        int num = 5;
        String name = "Aditya Jain";
        System.out.println(name + num);

        // Arrays, two ways to declare
        int[] num_arr = new int[5];
        num_arr[0] = 3535;
        System.out.println(num_arr[0]);

        int[] new_arr = {23, 34, 54, 565, 57};
        System.out.println(new_arr[4]);

        // Loops

        // for loop
        for(int i = 0; i<new_arr.length; i++){
//            System.out.println(new_arr[i]);
        }

        // Enhanced for loop
        for( int current_var : new_arr ){
//            System.out.println(current_var);
        }

        // if else
        for( int current_var : new_arr ){
            if ( current_var % 2 == 0){
                System.out.println("2's multiple " + current_var);
            } else {
                System.out.println("Not 2's multiple " + current_var);
            }
        }

        // arraylist, difference between arrays and arraylist
        // arraylist can dymanically grow the size of an array.

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Aditya");
        arrayList.add("Rajesh");
        arrayList.add("Shreya");

        System.out.println(arrayList.get(2));

        // Strings
        // String is an object in Java, the below way is called String litreal way to declare a String
        String newName = "SuperStar Aditya";
        String newName2 = "SuperStar Aditya";
        // In the above case as text is same no matter, how many variables you create it's always going to point to the memory of the first variable.

        // another way to create, called as to declare String with the new operator
        String s2 = new String("s2");
        String s3 = new String("s2");

        // however in the above case when we use `new` keyword we always create a new object in the memory block having the value.
        
        // string.split(), breaks string in to arrays with the delimiter define in brakets. For below we have "space" as a delimiter.
        String[] nameArr = newName.split("Star");
        System.out.println(nameArr[0]);
        System.out.println(nameArr[1].trim());

        // printing the string in reverse order
        for( int j = newName.length()-1; j>=0; j-- ){

            System.out.println(newName.charAt(j));
        }

        coreJavaBrushUp obj = new coreJavaBrushUp();
        obj.someIntMethod();

    }

    // functions or methods
    // static will move the method to class level and not bind to object, hence we can call it without creating an object.
    public int someIntMethod(){
        System.out.println("I will return you an Int, I promise.");
        return 0;
    }
}