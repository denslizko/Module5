public class Task2 {
    public static void main(String[] args) {

        int[] massive = {55, 47, 1, 100, 32};
        boolean swapReplay = true;

        while (swapReplay) {
            swapReplay = false;
            for (int i = 0; i < massive.length - 1; i++) {
                if (massive[i] > massive[i + 1]) {
                    int temporary = massive[i];

                    massive[i] = massive[i + 1];
                    massive[i + 1] = temporary;

                    swapReplay = true;
                }
            }
        }
        for (int element : massive){
            System.out.println(element);
        }
    }
}
