package CodeWars;

public class SelectiveFearOfNumbers {
    public static void main(String[] args) {

    }

    static public boolean AmIAfraid(final String day, final int num) {
        int[] fears = {12, 95, 34, 0, 2, 56, 666, -666};

        for(int i = 0; i <fears.length; i++) {
            System.out.println("Checking fears...");

            switch(day) {
                case "Monday" :
                    return (fears[i] == 12) ? true : false;
                case "Tuesday" :
                    return (fears[i] > 95) ? true : false;
                case "Wednesday":
                    return (fears[i] == 34) ? true : false;
                case "Thursday":
                    return (fears[i] == 0) ? true : false;
                case "Friday":
                    return (fears[i] % 2 == 0) ? true : false;
                case "Saturday": ;
                    return (fears[i] == 56) ? true : false;
                case "Sunday": ;
                    return (fears[i] == 666 || fears[i] == -666) ? true : false;
            }
        }
        return true;
    }
}
