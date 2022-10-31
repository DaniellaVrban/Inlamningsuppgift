public class Counter {

    private int rowAmount;
    private int characterCount;

    public Counter() {

    }

    public int getCharacterCount() {
        return characterCount;
    }

    public int getRowAmount() {
        return rowAmount;
    }

    public void addCharacterCount(String userInput) {
        if (!userInput.equals("stop")) {
            characterCount += userInput.length();
        }
    }

    public void increaseRowAmount() {
        this.rowAmount++;
    }
}