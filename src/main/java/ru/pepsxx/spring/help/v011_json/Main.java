package ru.pepsxx.spring.help.v011_json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {

        System.out.println("""
                Для использования RestTemplate требуются зависимость:
                1: spring-web.
                Для парсинга Json требуются зависимость:
                1: jackson-databind.
                
                Тут можно по запрашивать данные "https://reqres.in/"
                """);

        RestTemplate restTemplate = new RestTemplate();

        System.out.println("Получение данных:");
        String url = "https://reqres.in/api/users/2";
        String response = restTemplate.getForObject(url, String.class);
        System.out.println(response);

        System.out.println("Отправка данных:");
        Map<String, String> jesonMap = new HashMap<>();
        jesonMap.put("name", "TestPepUser");
        jesonMap.put("job", "TestPepWork");
        HttpEntity<Map<String, String>> request = new HttpEntity<>(jesonMap);
        url = "https://reqres.in/api/users";
        response = restTemplate.postForObject(url, request, String.class);
        System.out.println("response = " + response);

        System.out.println("Ручной парсинг:");
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(response);
        String name = jsonNode.get("name").asText();
        String job = jsonNode.get("job").asText();
        System.out.println(name+" "+job);

        System.out.println("jsonNode.has(\"name\") = " + jsonNode.has("name"));
        System.out.println("jsonNode.has(\"no name\") = " + jsonNode.has("no name"));
    }
}
