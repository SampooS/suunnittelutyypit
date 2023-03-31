package Teht15;

public class Test {
    public static void main(String[] args) {

        String[] arr = { "asdf", "12345", "Marko", "boy" };
        StringArray strArr = new StringArray();

        // print array using StringArray -class (LAME)

        System.out.println(strArr.getJoined(arr));

        ArrayToListAdapter adapter = new ArrayToListAdapter();

        // print array by using StringList -class to add styling using adapter to make String[] -> ArrayList<String> (MEGA COOL)

        System.out.println(adapter.printArray(arr));

    }
}
