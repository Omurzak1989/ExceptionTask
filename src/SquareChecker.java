public class SquareChecker {
    public static void checkSquare(int number) throws Exception{
        double sqrt = Math.sqrt(number);

        if (sqrt - Math.floor(sqrt) != 0){
            throw new Exception("Берилген сан квадрат эмес:- " + number);
        }
        System.out.println("Берилген сан квадрат:- " + number);
    }

}
