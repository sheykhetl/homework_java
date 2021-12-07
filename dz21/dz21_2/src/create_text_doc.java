public class create_text_doc implements i_create_doc {
    public i_doc CreateNew() {
        text_doc textDocument = new text_doc();
        return textDocument;
    }
    public i_doc CreateOpen() {
        text_doc textDocument = new text_doc();
        return textDocument;
    }
}