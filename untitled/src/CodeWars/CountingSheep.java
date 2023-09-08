package CodeWars;

public class CountingSheep {
    public static void main(String[] args) {

        Boolean[] sheeps = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true};
        System.out.println(countSheep(sheeps));
    }
    public static int countSheep(Boolean[] arrayOfSheeps) {

        int count = 0;
        for(int i =0; i < arrayOfSheeps.length; i++) {

            if(arrayOfSheeps[i] == null) {
                return count;
            }

            if(arrayOfSheeps[i]== true) {
                count++;
            }
        }
        return (Integer)count;
    }
}
