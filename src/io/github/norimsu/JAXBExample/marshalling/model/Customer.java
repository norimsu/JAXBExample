package io.github.norimsu.JAXBExample.marshalling.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {
  String name;
  int age;
  int id;

  public String getName() {
    return name;
  }

  @XmlElement
  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  @XmlElement
  public void setAge(int age) {
    this.age = age;
  }

  public int getId() {
    return id;
  }

  @XmlElement
  public void setId(int id) {
    this.id = id;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Customer [name=").append(name).append(", age=").append(age).append(", id=")
        .append(id).append("]");
    return builder.toString();
  }


}
