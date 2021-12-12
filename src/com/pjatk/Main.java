package com.pjatk;

public class Main {

    public static void main(String[] args) {
        zadanie1();
        zadanie2();
        zadanie3();
        zadanie4();
        zadanie5();
        zadanie6();
        zadanie7();
        zadanie8();

    }

    private static void zadanie8() {
        int[] arr= {1,3,5,57,13,8,2345};
        System.out.println("Kolejnosc niemalejaca: "+isIncreasing(arr));
    }

    public static boolean isIncreasing(int[] arr){
        for(int i= 0; i < arr.length; i++) {
            if(arr[i] > arr[i+1])  return false;
        }
        return true;
    }

    private static void zadanie7() {
        double[] arr= {1.00, 2.34, 3.76, 654.23, 908.32};
        System.out.println("Srednia arytmetyczna: "+getAlgebraicMean(arr));
    }

    public static double getAlgebraicMean(double[] arr){
        double arrSum= 0.00;
        if(arr.length > 0) {
            for(int i= 0; i < arr.length; i++) {
                arrSum+= arr[i];
            }
//            sume wszystkich elementow dzielimy na rozmiar tablicy
            return arrSum/arr.length;
        }
        System.out.println("Tablica musi miec co najmniej 1 element");
//        umowna wartosc w przypadku braku elementow w tablicy - 0.00
        return arrSum;
    }

    private static void zadanie6() {
        double[] arr= {1.00, 2.34, 3.76, 654.23, 908.32};
        double num= 3.76;
        System.out.println("element "+num+" znajduje sie w tablicy: "+isInArray(arr, num));
    }

    public static boolean isInArray(double[] arr, double num){

        for(int i= 0; i < arr.length; i++) {
            if(arr[i]==num) return true;
        }
        return false;
    }

    private static void zadanie5() {
        int[] arr= {1,3,5,57,13,8,2345};
        printArray(arr);
    }

    public static void printArray(int[] arr){

        for(int i= 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void zadanie4(){
//        identyczne tablice
        int[] arr = {5,6,7};
        int[] arr2 = {5,6,7};
//        rozne tablice
        int[] arr3 = {10,20,30};
        int[] arr4 = {10,30,40,50};
        System.out.println(arrayEquals(arr, arr2));
        System.out.println(arrayEquals(arr3, arr4));

    }

    public static boolean arrayEquals(int[] arr, int[] arr2){
        if(arr.length==arr2.length) {
            for(int i= 0; i < arr.length; i++) {
                if(arr[i]!=arr2[i])
                    return false;
            }
            return true;
        }
        else
            return false;
    }

    private static void zadanie3(){
        int[] array = new int[]{1, 2, 3, 4, 10, 20, 25, 30, 305};
        int[] evenArray = getEven(array);
        System.out.println(arrayToString(evenArray));
   }

    private static int[] getEven(int[] array) {
        int length= 0;
        for(int i= 0; i < array.length; i++) {
            if((array[i]%2)==0 || array[i]==0) {
                length++;
            }
        }
        int[] evenArray= new int[length];
        int iterate= 0;
        for(int i= 0; i < array.length; i++) {
            if((array[i]%2)==0 || array[i]==0) {
                evenArray[iterate]= array[i];
                iterate++;
            }
        }

        return evenArray;
    }


    private static void zadanie2(){
        int[] array = new int[]{10, 20, 30};
        String stringResult = arrayToString(array);
        System.out.println(stringResult);
    }
    private static String arrayToString(int[] array) {
        String result = "[";
        for (int i= 0; i < array.length; i++) {
            if(i==0)
                result = result + array[i];
            else
                result = result+","+ array[i];
        }
        return result+"]";
    }


    private static void zadanie1(){
        int[] array = new int[] {1, 2, 3};

        int[] reversedArray = reverse(array);
        for (int j : reversedArray) {
            System.out.println(j);
        }
            }

    private static int[] reverse(int[] array) {
        int length = array.length;
        for(int i= 0; i < length/2; i++){
            int tmp = array[i];

            array[i] = array[length - 1 - i];
            array[length - 1 - i] = tmp;
        }
        return array;

    }
}
















