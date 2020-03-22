public class Armstrong {

    public static void main(String[] args) {

        int num = 371, oN, r, result = 0;

        oN = num;

        while (oN != 0)
        {
            r = oN % 10;
            result += Math.pow(r, 3);
            oN /= 10;
        }

        if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}