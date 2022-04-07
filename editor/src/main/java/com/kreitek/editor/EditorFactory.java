package com.kreitek.editor;

public class EditorFactory {


    public Editor getEditor(String consoleType) {
        if(consoleType == null){
            return null;
        }
        else if(consoleType.equalsIgnoreCase("JSON")){
            return new JsonEditor();
        }
        else if(consoleType.equalsIgnoreCase("TEXT")){
            return new ConsoleEditor();
        }
        return null;
    }
}
