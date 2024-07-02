package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
//        String results ="";
//        for(int i=1; i <=5; i++){
//            for(int j = 1; j<= 5; j++){
//                results += String.format("%3d |", i * j);
//            }
//            results += "\n";
//        }
//
//        return results;
        return getMultiplicationTable(5);
       // "  1 |  2 |  3 |  4 |  5 |\n"

    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);

//        String results ="";
//        for(int i=1; i <=10; i++){
//            for(int j = 1; j<= 5; j++){
//                results += String.format("%3d |", i * j);
////                if(i == 1){
//////
////                    if(j==5){
////                        results += " " + Integer.toString(j) + " |";
////                    }else{
////                        results += " " + Integer.toString(j) + " | ";
////                    }
////
////                }else {
////                    if((j*i) >9){
////                        if(j==5){
////                            results +=  Integer.toString(j *i) + " |";
////                        }else{
////                            results +=  Integer.toString(j *i) + " | ";
////                        }
////
////                    }else{
////                        results += " "+ Integer.toString(j *i) + " | ";
////                    }
//
//                //  }
//
//            }
//
//            results += "\n";
//
//
//
//        }
//
//        return results;
    }

    public static String getMultiplicationTable(int tableSize) {

        String results ="";
        for(int i=1; i <=tableSize; i++){
            for(int j = 1; j<= tableSize; j++){
                results += String.format("%3d |", i * j);
//                if(i == 1){
////
//                    if(j==5){
//                        results += " " + Integer.toString(j) + " |";
//                    }else{
//                        results += " " + Integer.toString(j) + " | ";
//                    }
//
//                }else {
//                    if((j*i) >9){
//                        if(j==5){
//                            results +=  Integer.toString(j *i) + " |";
//                        }else{
//                            results +=  Integer.toString(j *i) + " | ";
//                        }
//
//                    }else{
//                        results += " "+ Integer.toString(j *i) + " | ";
//                    }

                //  }

            }

            results += "\n";



        }

        return results;
    }
}
