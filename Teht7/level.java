package Teht7;

public enum level {
    BEGINNER,
    EXPERIENCED,
    LEGENDARY{
        @Override
        public level advance() {
            return level.LEGENDARY;    
        }
    };


    public level advance() {
        return values()[ordinal() + 1];
    }
}
