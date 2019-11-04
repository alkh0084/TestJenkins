package com.algonquincollege.cst8277.models;

import com.algonquincollege.cst8277.models.Employee;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.3.v20180807-rNA", date="2019-11-03T21:12:00")
@StaticMetamodel(Phone.class)
public class Phone_ extends ModelBase_ {

    public static volatile SingularAttribute<Phone, String> areaCode;
    public static volatile SingularAttribute<Phone, String> phoneNumber;
    public static volatile SingularAttribute<Phone, Employee> employee;

}