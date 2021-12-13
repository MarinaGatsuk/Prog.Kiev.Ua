package advancedhomework2;

public class InverseTransformer extends TextTransformer {

    public InverseTransformer() {
        super();
    }

    @Override
    public String transform(String text) {
        StringBuffer stringBuffer = new StringBuffer(text);
        return stringBuffer.reverse().toString();
    }

    @Override
    public String toString() {
        return "InverseTransformer{}";
    }
}
