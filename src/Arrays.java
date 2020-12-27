public class Arrays {
    public static void main(String[] args) {
        //Creating two numeric arrays with data in reverse order
        int[] firstArr = new int[900];
        int[] secondArr = new int[firstArr.length];

        for(int i = 0, j = firstArr.length-1; i < firstArr.length; i++, j--)
        {
            firstArr[i] = i + 100;
            secondArr[j] = firstArr[i];
        }

        for(int i : secondArr){
            System.out.print(i + " | ");
        };

    }
}
