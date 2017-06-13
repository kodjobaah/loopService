package com.aire.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;

public enum Events {

    INCREASE_HIGH_RISK("INCREASE_HIGH_RISK"),
    NEW_GEO("NEW_GEO"),
    EXAGGERATED_INCOME("EXAGGERATED_INCOME"),
    INCREASE_GEO("INCREASE_GEO"),
    SEASONAL_VARIATION("SEASONAL_VARIATION"),
    SIMILAR_APPLICATION("SIMILAR_APPLICATION");

    private final String event;

    private static Map<String, Events> namesMap = new HashMap<String, Events>(3);

    static {
        namesMap.put("INCREASE_HIGH_RISK", INCREASE_HIGH_RISK);
        namesMap.put("EXAGGERATED_INCOME", EXAGGERATED_INCOME);
        namesMap.put("NEW_GEO", NEW_GEO);
        namesMap.put("INCREASE_GEO", INCREASE_GEO);
        namesMap.put("SEASONAL_VARIATION", SEASONAL_VARIATION);
        namesMap.put("SIMILAR_APPLICATION", SIMILAR_APPLICATION);
    }

    Events(String event) {
        this.event = event;
    }

    @JsonCreator
    public static Events forValue(String value) {
        return namesMap.get(value.toUpperCase());
    }

    @JsonValue
    public String toValue() {
        for (Map.Entry<String, Events> entry : namesMap.entrySet()) {
            if (entry.getValue() == this)
                return entry.getKey();
        }

        return null; // or fail
    }

    @Override public String toString() { return event; }
}
