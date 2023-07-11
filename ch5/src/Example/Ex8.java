package Example;

public class Ex8 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        for(int[] firstAry : array){
            for(int secondAry : firstAry){
                System.out.print(secondAry + " ");
            }
            System.out.println();
        }

        System.out.println(array.length);
        System.out.println(array[2].length); // Ex6
    }
}
