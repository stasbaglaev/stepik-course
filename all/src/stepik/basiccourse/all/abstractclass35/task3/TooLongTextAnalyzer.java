package stepik.basiccourse.all.abstractclass35.task3;

public class TooLongTextAnalyzer implements TextAnalyzer {
    private final int maxLength;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    public int getMaxLength() {
        return maxLength;
    }

    @Override
    public Label processText(String text) {
        return (text.length() > getMaxLength()) ? Label.TOO_LONG : Label.OK;
    }
}
