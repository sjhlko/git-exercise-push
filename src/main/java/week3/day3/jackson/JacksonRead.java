package week3.day3.jackson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JacksonRead {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(new File("./gaeLines.json"));
        System.out.println(jsonNode.get(0));
        System.out.println(jsonNode.size());
    }
}
//MTAyNDAyNTY4MzIxMjYzNjI5MA.GOg4PP.vnyOd-8tBWfMhLvMak57HZW85HY7cowEySnt40