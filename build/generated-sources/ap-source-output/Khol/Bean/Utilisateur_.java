package Khol.Bean;

import Khol.Bean.Ordinateur;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-26T19:06:39")
@StaticMetamodel(Utilisateur.class)
public class Utilisateur_ { 

    public static volatile SingularAttribute<Utilisateur, String> mat;
    public static volatile CollectionAttribute<Utilisateur, Ordinateur> ordinateurCollection;
    public static volatile SingularAttribute<Utilisateur, String> tel;
    public static volatile SingularAttribute<Utilisateur, Integer> id;
    public static volatile SingularAttribute<Utilisateur, String> poste;
    public static volatile SingularAttribute<Utilisateur, String> nom;

}