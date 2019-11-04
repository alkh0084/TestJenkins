package com.algonquincollege.cst8277.models;

import com.algonquincollege.cst8277.models.Address;
import com.algonquincollege.cst8277.models.Phone;
import com.algonquincollege.cst8277.models.Project;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.3.v20180807-rNA", date="2019-11-03T20:52:07")
@StaticMetamodel(Employee.class)
public class Employee_ extends ModelBase_ {

    public static volatile SingularAttribute<Employee, String> firstName;
    public static volatile SingularAttribute<Employee, String> lastName;
    public static volatile ListAttribute<Employee, Project> projects;
    public static volatile SingularAttribute<Employee, Address> address;
    public static volatile ListAttribute<Employee, Phone> phones;
    public static volatile SingularAttribute<Employee, Double> salary;

}