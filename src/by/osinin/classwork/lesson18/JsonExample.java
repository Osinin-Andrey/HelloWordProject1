package by.osinin.classwork.lesson18;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class JsonExample {
    public static void main(String[] args) throws IOException {
        Person person = new Person(1, "Anton2", Arrays.asList("write", "dance"), true);
        ObjectMapper mapper = new ObjectMapper();
        String result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(person);
        System.out.println(result);
        Person currentPerson = mapper.readValue(new File("test.json"), Person.class);
        System.out.println(currentPerson);

    }

}
