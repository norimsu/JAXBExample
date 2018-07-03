package io.github.norimsu.JAXBExample.marshalling;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import io.github.norimsu.JAXBExample.marshalling.model.Family;
import io.github.norimsu.JAXBExample.marshalling.model.Person;

public class JAXBClientWithPerson {
  public static void main(String[] args) {
    JAXBContext context = null;
    List<Person> list = null;
    Person p1 = null;
    Person p2 = null;
    Family f1 = null;
    Marshaller marshaller = null;

    try {
      context = JAXBContext.newInstance(Person.class);
      list = new ArrayList<Person>();

      p1 = new Person();
      f1 = new Family();

      f1.setDescription("Simpson's Family");
      p1.setFirstName("Homer");
      p1.setLastName("Simpson");
      p1.setFamily(f1);
      list.add(p1);

      p2 = new Person();
      p2.setFirstName("Marge");
      p2.setLastName("Simpson");
      p2.setFamily(f1);
      list.add(p2);

      marshaller = context.createMarshaller();
      marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
      marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

      marshaller.marshal(p2, System.out);
    } catch (PropertyException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (JAXBException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }
}
