package methods;

public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4)); // false
        System.out.println(canPack(1, 0, 5)); // true
        System.out.println(canPack(0, 5, 4)); // true
        System.out.println(canPack(2, 2, 11)); // true
        System.out.println(canPack(-3, 2, 12)); // false
        System.out.println(canPack(2, 2, 12)); // true
    }

    public static boolean canPack (int bigCount, int smallCount, int goal) {
        int totalFlour = bigCount * 5 + smallCount;
        int totalBigCountFlour = bigCount * 5;

        if ( bigCount < 0 || smallCount < 0 || goal < 0) {
            System.out.println("got to this code block 1!");
            return false;
        }

        if (totalFlour < goal) {
            System.out.println("got to this code block 2!");
            return false;
        }

        if (goal < 5) {
            System.out.println("got to this code block 3!");
            return smallCount >= goal;
        }

        if (goal == totalBigCountFlour || goal == smallCount ) {
            System.out.println("got to this code block 4!");
            return true;
        }

        if (goal > totalBigCountFlour) {
            System.out.println("got to this code block 5!");
            int smallCountNeeded = goal - totalBigCountFlour;
            return smallCount >= smallCountNeeded;
        } else {
            // goal < totalBigCountFlour
            System.out.println("got to this code block 6!");
            int bigCountNeeded = goal / 5;
            int smallCountNeeded = goal - (bigCountNeeded * 5);

            return smallCount >= smallCountNeeded;
        }

    }
}
