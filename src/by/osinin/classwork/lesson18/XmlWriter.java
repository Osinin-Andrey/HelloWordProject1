package by.osinin.classwork.lesson18;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class XmlWriter {
    public static void main(String[] args) throws JAXBException {
        Student student = new Student(1, "Andrey", "male", new Course ("first"));
        JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); //для форматирования
        marshaller.marshal(student, new File("student.xml"));
    }
}
