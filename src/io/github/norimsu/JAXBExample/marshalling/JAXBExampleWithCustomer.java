package io.github.norimsu.JAXBExample.marshalling;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import io.github.norimsu.JAXBExample.marshalling.model.Customer;

public class JAXBExampleWithCustomer {

  public static void main(String[] args) {
    Customer customer = new Customer();
    customer.setId(100);
    customer.setName("SANGHYUN");
    customer.setAge(29);
    
    try {
      File file = new File("./file.xml");
      JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
      Marshaller marshaller = jaxbContext.createMarshaller();
      
      marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
      
      marshaller.marshal(customer, file);
      marshaller.marshal(customer, System.out);
    } catch (PropertyException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (JAXBException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
