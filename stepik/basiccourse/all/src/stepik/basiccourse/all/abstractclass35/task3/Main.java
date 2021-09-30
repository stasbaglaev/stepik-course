package stepik.basiccourse.all.abstractclass35.task3;

public class Main {
    public static void main(String[] args) {
        String str = "subscribe fsd :(";
        String[] keywords = {"qwerty", "subscribe"};
        TextAnalyzer[] analyzers = {new SpamAnalyzer(keywords), new NegativeTextAnalyzer(), new TooLongTextAnalyzer(5)};
        System.out.println(checkLabels(analyzers, str));

    }

    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer analyzer : analyzers) {
            Label label = analyzer.processText(text);
            if (label != Label.OK) return label;
        }
        return Label.OK;
    }
}
