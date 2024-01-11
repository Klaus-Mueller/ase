package com.sap.cc.handsoff;

import com.sap.cc.handsoff.CodeCreator;
import com.sap.cc.handsoff.DeveloperEvent;
import com.sap.cc.handsoff.UnsupportedDevelopmentLanguageException;

import java.util.List;

public class Hackathon implements DeveloperEvent {



    @Override
    public String codeTogether(List<CodeCreator> codeCreators) {
        StringBuilder result = new StringBuilder();

        codeCreators.forEach(codeCreator -> {
            try {
                String code = codeCreator.code();
                result.append(code).append("\n");
            } catch (UnsupportedDevelopmentLanguageException e) {
                throw new RuntimeException(e);
            }
        });
        return result.toString();
    }
}
