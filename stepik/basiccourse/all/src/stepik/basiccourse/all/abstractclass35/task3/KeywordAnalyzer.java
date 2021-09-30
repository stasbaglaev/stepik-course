package stepik.basiccourse.all.abstractclass35.task3;

public abstract class KeywordAnalyzer implements TextAnalyzer {
    @Override
    public Label processText(String text) {
        for (String keyword : getKeywords()) {
            if (text.contains(keyword)) {
                return getLabel();
            }
        }
        return Label.OK;
    }

    protected abstract String[] getKeywords();

    protected abstract Label getLabel();
}
