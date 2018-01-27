package Khol.Bean;

import Khol.Bean.Ordinateur;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-26T19:06:39")
@StaticMetamodel(Os.class)
public class Os_ { 

    public static volatile CollectionAttribute<Os, Ordinateur> ordinateurCollection;
    public static volatile SingularAttribute<Os, Integer> id;
    public static volatile SingularAttribute<Os, String> nom;
    public static volatile SingularAttribute<Os, String> version;

}