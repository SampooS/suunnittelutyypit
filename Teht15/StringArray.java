package Teht15;

public class StringArray implements IStringArray {
    public StringArray() {}

    @Override
    public String getJoined(String[] strings) {
        StringBuilder strb = new StringBuilder();

        for (String string : strings) {
            strb.append(string);
        }
        return strb.toString();
    }
    
}
