package com.algonquincollege.cst8277.models;

import com.algonquincollege.cst8277.models.Employee;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.3.v20180807-rNA", date="2019-04-02T11:08:56")
@StaticMetamodel(Project.class)
public class Project_ extends ModelBase_ {

    public static volatile SingularAttribute<Project, String> name;
    public static volatile SingularAttribute<Project, String> description;
    public static volatile ListAttribute<Project, Employee> employees;

}