package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String results = "";
        for(int i= 1; i<numberOfRows; i++){
            results += (getRow(i) +"\n");
        }
        return results;

    }

    public static String getRow(int numberOfStars) {
String row = "";
for(int i= 0; i< numberOfStars; i++){
    row+= "*";
}
//        for (int i = 1; i <= numberOfStars; i++) {
//
//            // loop to print the number of spaces before the star
//            for (int j = numberOfStars; j >= i; j--) {
//                System.out.print(" ");
//            }
//
//            // loop to print the number of stars in each row
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//
//            // for new line after printing each row
//            System.out.println();
//        }
        return row;
    }

    public static String getSmallTriangle() {
        return getTriangle(5);
    }

    public static String getLargeTriangle() {
     return getTriangle(10);
    }
}
