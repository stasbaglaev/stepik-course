package stepik.basiccourse.analyzer;

public class NegativeTextAnalyzer extends KeywordAnalyzer {
    private final String[] keywords = {":(", "=(", ":|"};

    @Override
    protected String[] getKeywords() {
        return this.keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
