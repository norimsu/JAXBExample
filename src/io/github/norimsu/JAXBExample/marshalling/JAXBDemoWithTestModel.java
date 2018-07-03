package io.github.norimsu.JAXBExample.marshalling;

import java.io.OutputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import io.github.norimsu.JAXBExample.marshalling.model.TestModelObject;

public class JAXBDemoWithTestModel {

  private static TestModelObject createModelObject() {
    TestModelObject testModel = new TestModelObject();
    testModel.setUserId("test");
    testModel.setUserName("name");
    // testModel.setUserId("");
    return testModel;
  }

  private static void writeXML(TestModelObject tm, OutputStream xmlOutPut) throws JAXBException {
    JAXBContext jaxbContext = JAXBContext.newInstance(TestModelObject.class);
    Marshaller marshaller = jaxbContext.createMarshaller();
    marshaller.marshal(tm, xmlOutPut);
  }

  public static void main(String[] args) {
    try {
      TestModelObject tm = createModelObject();
      writeXML(tm, System.out);
    } catch (JAXBException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
