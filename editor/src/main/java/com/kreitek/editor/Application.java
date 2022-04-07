package com.kreitek.editor;

public class Application {

    public static void main(String[] args) {
        EditorFactory editorFactory = new EditorFactory();
        Editor editor = editorFactory.getEditor("TEXT");
        Editor editor1 = editorFactory.getEditor("JSON");

        if(args[0].equalsIgnoreCase("text")) {
            editor.run();
        }
        else if(args[0].equalsIgnoreCase("json"));{
            editor1.run();
        }
    }
}
