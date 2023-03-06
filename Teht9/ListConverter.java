package Teht9;

import java.util.List;

public class ListConverter {
    
    ListStrategy strategy;    
    
    ListConverter(ListStrategy strategy) {
        this.strategy = strategy;
    }

    public String listToString(List list) {
        return strategy.listToString(list);
    }
}
