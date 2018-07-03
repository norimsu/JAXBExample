package io.github.norimsu.JAXBExample.unmarshalling;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import io.github.norimsu.JAXBExample.marshalling.model.Customer;

public class JAXBExample {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    try {
      File file = new File("./file.xml");
      JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
      
      Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
      Customer customer = (Customer) unmarshaller.unmarshal(file);
      System.out.println(customer);
    } catch (JAXBException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}
