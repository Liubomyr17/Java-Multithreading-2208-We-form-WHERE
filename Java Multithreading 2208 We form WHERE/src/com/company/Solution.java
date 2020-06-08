package com.company;

/*

2208 We form WHERE

Form the part of the WHERE request using StringBuilder.
If null, then the parameter should not be included in the request.
Example:
{"name", "Ivanov", "country", "Ukraine", "city", "Kiev", "age", null}
Result:
"name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'"

Requirements:
1. The getQuery method must accept one parameter of type Map.
2. The getQuery method must have a return type of String.
3. The getQuery method must be static.
4. The getQuery method should return a string formed according to the rules described in the problem statement.



import com.sun.org.apache.xpath.internal.operations.String;

import java.util.HashMap;
import java.util.Map;


public class Solution {
    public static void main(String[] args) {
        Map<java.lang.String, java.lang.String> map = new HashMap<>();
        map.put("name", "Ivanov");
        map.put("country", "Ukraine");
        map.put("city", "Kiev");
        map.put("age", null);

        System.out.println(getQuery(map));
    }

    public static Object getQuery(Map<String, String> params) {

        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        for (Map.Entry<String, String> str : params.entrySet()) {
            if (str.getValue() != null) {
                if (index > 0) {
                    stringBuilder.append(" and ");
                }
                stringBuilder.append(str.getKey()).append(" = '").append(str.getValue()).append("'");
                index++;
            }
        }

        return stringBuilder.toString();
    }
}


*/