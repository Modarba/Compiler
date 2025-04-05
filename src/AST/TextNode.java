package AST;

public class TextNode {
    private String content;

    public TextNode(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "TextNode{" +
                "content='" + content + '\'' +
                '}';
    }
}
