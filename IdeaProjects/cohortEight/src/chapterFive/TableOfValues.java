package chapterFive;

public class TableOfValues {

    private static int count = 1;

    public static void main(String[] args) {

            for (; count <=5;){
                System.out.println(count + " " + count*10 + " " + " " + count*100 + " "+ count*1000);
                count++;
            }
    }
}
