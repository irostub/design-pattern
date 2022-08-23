package com.irostub.designpatterns._11flyweight.after;

import java.util.HashMap;
import java.util.Map;

public class FontFlyweightBuilder {
    private final Map<String, Font> fontMap = new HashMap<>();

    public Font getFont(String font) {
        if (fontMap.containsKey(font)) {
            return fontMap.get(font);
        }else{
            String[] split = font.split(":");
            Font newFont = new Font(split[0], Integer.parseInt(split[1]));
            fontMap.put(font, newFont);
            return newFont;
        }
    }
}
