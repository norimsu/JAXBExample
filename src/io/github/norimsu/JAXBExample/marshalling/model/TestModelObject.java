package io.github.norimsu.JAXBExample.marshalling.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TestModelObject {
  private String userId;
  private String userName;

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

}
