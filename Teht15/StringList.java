package Teht15;

import java.util.ArrayList;

public class StringList implements IStringList {

    ArrayList<String> list;

    public StringList() {}

    public void setList(ArrayList<String> strings) {
        this.list = strings;
    }

    @Override
    public String fancyString(ArrayList<String> strings) {
        StringBuilder strb = new StringBuilder();

        for (String string : strings) {
            strb.append(String.format("%-5s%-10s%1s", "~", string, "~\n") );
        }
        return strb.toString();
    }

    @Override
    public String getJoined(ArrayList<String> strings) {
        String returnMe = "\n";
        for (String string : strings) {
            returnMe += string;
        }
        return returnMe;
    }


    
    
}
