package com.easylearning.easylearning.model;

import org.greenrobot.greendao.converter.PropertyConverter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Malcolm-X on 03.12.2016.
 */
public class StringListConverter implements PropertyConverter<List<String>, String> {
    /**
     * no context here so we use a static string
     */
    public final static String SEPERATOR = ";";

    @Override
    public List<String> convertToEntityProperty(String databaseValue) {
        if (databaseValue == null) return null;
        String[] split = databaseValue.split(SEPERATOR);
        List<String> tokens = new ArrayList<>(split.length);
        for (String stringToken : split)
            tokens.add(stringToken);
        return tokens;
    }

    @Override
    public String convertToDatabaseValue(List<String> stringList) {
        if (stringList == null) return null;
        StringBuilder sb = new StringBuilder();
        for (String string : stringList)
            sb.append(string);
        return sb.toString();
    }
}
