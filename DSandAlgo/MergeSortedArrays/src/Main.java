public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] array1 = new int[] {1,3,5};
        int[] array2 = new int[] {2,4};
        int[] finalArray = sortedArray2(array1,array2);
        for (int j : finalArray) {
            System.out.println(j);
        }
    }
    public static int[] sortedArray1(int[] arr1, int[] arr2) {
        int[] finalArray= new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        while (i<arr1.length && k<finalArray.length) { //1,3,5,7 and //2,4,6,8
            while (j<arr2.length) { //2,4,6,8 and //1,3,5,7
                if(arr1[i]<arr2[j]) {
                    finalArray[k]=arr1[i];
                    k++;
                    i++;
                    if(i== arr1.length) {
                        finalArray[k] = arr2[arr2.length-1];
                        j++;
                    }
                    break;
                } else {
                    finalArray[k]=arr2[j];
                    k++;
                    j++;
                    if(j== arr2.length) {
                        finalArray[k] = arr1[arr1.length-1];
                        i++;
                    }
                }

            }
            //finalArray[finalArray.length-1] = arr2[arr2.length-1];
        }
        return finalArray;
    }
    public static int[] sortedArray2(int[] arr1, int[] arr2) {
        int[] mergerArray = new int[arr1.length+ arr2.length];
        int i=0,j=0,k=0;
        while (i<arr1.length && j<arr2.length) {
            if(arr1[i]<arr2[j]) {
                mergerArray[k]=arr1[i];
                i++;
                k++;
                //or
                //mergerArray[k++]=arr1[i++];
            } else {
                mergerArray[k++]=arr2[j++];
            }
        }
        while(i<arr1.length) {
            mergerArray[k++]=arr1[i++];
        }
        while(j<arr2.length) {
            mergerArray[k++]=arr2[j++];
        }
        return mergerArray;
    }
}