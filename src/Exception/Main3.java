package Exception;

public class Main3 {
    /**
     *    throws
     */
    public static void main(String[] args) throws Exception {
        System.out.println(getFact(1));

}
    public static int getFact(int num) throws Exception{
        if (num < 1) throw new Exception("В аргументе передано число менее 1");
        int result = 1;
        for (int i = 1; i <= num; i++){
            result += i;

        }
        return result;
    }
    }
