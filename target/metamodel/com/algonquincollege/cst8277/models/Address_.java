package com.algonquincollege.cst8277.models;

import com.algonquincollege.cst8277.models.Employee;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.3.v20180807-rNA", date="2019-11-03T20:52:07")
@StaticMetamodel(Address.class)
public class Address_ extends ModelBase_ {

    public static volatile SingularAttribute<Address, String> country;
    public static volatile SingularAttribute<Address, String> city;
    public static volatile SingularAttribute<Address, String> street;
    public static volatile SingularAttribute<Address, String> postal;
    public static volatile SingularAttribute<Address, String> state;
    public static volatile SingularAttribute<Address, Employee> employee;

}