package advancedhomework2;

public class UpDownTransformer extends TextTransformer {

    public UpDownTransformer() {
        super();
    }

    @Override
    public String transform(String text) {
        String resultString = "";

        for (int i = 0; i < text.length(); i++){
            if (i%2 == 0){
                resultString = resultString + Character.toLowerCase(text.charAt(i));
            }
            else {
                resultString = resultString + Character.toUpperCase(text.charAt(i));
            }
        }
        return resultString;
    }

    @Override
    public String toString() {
        return "UpDownTransformer{}";
    }
}
