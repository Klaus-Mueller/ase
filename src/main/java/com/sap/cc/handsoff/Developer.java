package com.sap.cc.handsoff;

import com.sap.cc.handsoff.CodeCreator;
import com.sap.cc.handsoff.UnsupportedDevelopmentLanguageException;

public class Developer extends CodeCreator {
    private String name;
    private String language;


    public Developer(String name, String language) {
        this.name = name;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String code() throws UnsupportedDevelopmentLanguageException {
        if(this.language == "go"){
            return String.format("fmt.Println(\"Hello, %s!\")", this.name);
        }

        if(this.language == "nodejs"){
            return String.format("console.log(\"Hello, %s!\")",this.name);
        }

        if(this.language == "python"){
            return String.format("print(\"Hello, %s!\")",this.name);
        }
        throw new UnsupportedDevelopmentLanguageException(this.language);
    }

}
