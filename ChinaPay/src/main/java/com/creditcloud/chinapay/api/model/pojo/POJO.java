package com.creditcloud.chinapay.api.model.pojo;

import com.creditcloud.model.BaseObject;
import com.fasterxml.jackson.databind.ObjectMapper;

public class POJO extends BaseObject {

    public String toJSON() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String text = mapper.writeValueAsString(this);
            return text;
        } catch (Exception e) {
            return "{}";
        }
    }

    public String toString() {
        return toJSON();
    }
}
