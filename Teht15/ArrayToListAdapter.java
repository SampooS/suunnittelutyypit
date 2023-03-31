package Teht15;

import java.util.ArrayList;

public class ArrayToListAdapter implements IStringArray {
    private final StringList list;

    public ArrayToListAdapter() {
        this.list = new StringList();
    }

    public String printArray(String[] strings) {
        ArrayList<String> printMe = arrayToList(strings); 
        return list.fancyString(printMe);
    }


    private ArrayList<String> arrayToList(String[] arr) {
        ArrayList<String> returnMe = new ArrayList<>();

        for (String string : arr) {
            returnMe.add(string);
        }

        return returnMe;
    }

    @Override
    public String getJoined(String[] strings) {
        ArrayList<String> returnMe = arrayToList(strings);
        return list.getJoined(returnMe);
    }
}
