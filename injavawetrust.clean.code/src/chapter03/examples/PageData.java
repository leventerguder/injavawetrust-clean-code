package chapter03.examples;

/**
 */
public interface PageData {
    WikiPage getWikiPage();

    boolean hasAttribute(String attribute);

    String getContent();

    void setContent(String content);

    String getHtml();
}
