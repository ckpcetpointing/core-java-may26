package com.jsn.core.java.str;

public class StringEnhancementsDemo {

    public static void main(String[] args) {

        String language = "Java\nPytho\nJavaScript\nHtml"; // new line character \n
        language.lines()
                .filter(l -> l.startsWith("J"))
                .forEach(System.out::println);


        String request = "{\n" +
                "  \"id\": 123,\n" +
                "  \"name\": \"Sample Item\",\n" +
                "  \"enabled\": true,\n" +
                "  \"tags\": [\"alpha\", \"beta\"],\n" +
                "  \"metadata\": {\n" +
                "    \"createdBy\": \"vijaykumarrshingala\",\n" +
                "    \"version\": \"1.0\"\n" +
                "  }\n" +
                "}";
        System.out.println("Request: " + request);
        String newRequest = """
                {
                  "id": 123,
                  "name": "Sample Item",
                  "enabled": true,
                  "tags": ["alpha", "beta"],
                  "metadata": {
                    "createdBy": "vijaykumarrshingala",
                    "version": "1.0"
                  }
                }
                """;


        String transformStr = "Today is a good day to learn Java";
        String transformed = transformStr.transform( (String s) -> s.toLowerCase());


        String languageStr = new String ("Java\nPython\nJavaScript\nHTML");
        String internLanguageStr = languageStr.intern();

    }
}
