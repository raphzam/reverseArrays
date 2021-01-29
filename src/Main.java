public class Main {

    private static String[] invArray(String[] arr){
        int first = 0;
        int last = arr.length-1;

        while (first < last){
            String temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        return arr;

    }

    public static void main(String[] args){
        String[] arr = {"hello,", "how", "are", "you?"};

        for(String s : arr){
            System.out.print(s + " ");
        }

        invArray(arr);

        System.out.println();

        for(String s : arr){
            System.out.print(s + " ");
        }
    }
}
