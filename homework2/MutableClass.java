package homework2;

import java.util.Map;

public class MutableClass {
    private String field;
    private Map<String, String> fieldMap;
    public MutableClass(String field, Map<String, String> fieldMap) {
        this.field = field;
        this.fieldMap = fieldMap;
    }
    public String getField() {
        return field;
    }
    public Map<String, String> getFieldMap() {
        return fieldMap;
    }
}
