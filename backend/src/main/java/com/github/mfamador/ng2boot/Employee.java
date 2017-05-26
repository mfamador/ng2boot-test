package com.github.mfamador.ng2boot;

import javax.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;

@Entity
//@Document(collection = "employees")
public class Employee {

  @Id
  private String id;
  private String email;
  private String fullName;
  private String managerEmail;

  public String getId() {

    return id;
  }

  public void setId(String id) {

    this.id = id;
  }

  public final String getManagerEmail() {

    return managerEmail;
  }

  public final void setManagerEmail(final String managerEmail) {

    this.managerEmail = managerEmail;
  }

  public final String getEmail() {

    return email;
  }

  public final void setEmail(final String email) {

    this.email = email;
  }

  public final String getFullName() {

    return fullName;
  }

  public final void setFullName(final String fullName) {

    this.fullName = fullName;
  }

  @Override public String toString() {

    return "Employee{" +
        "id='" + id + '\'' +
        ", email='" + email + '\'' +
        ", fullName='" + fullName + '\'' +
        ", managerEmail='" + managerEmail + '\'' +
        '}';
  }
}
