package Khol.Bean;

import Khol.Bean.Os;
import Khol.Bean.Utilisateur;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-26T19:06:39")
@StaticMetamodel(Ordinateur.class)
public class Ordinateur_ { 

    public static volatile SingularAttribute<Ordinateur, String> reference;
    public static volatile SingularAttribute<Ordinateur, Utilisateur> idUser;
    public static volatile SingularAttribute<Ordinateur, String> disque;
    public static volatile SingularAttribute<Ordinateur, Integer> id;
    public static volatile SingularAttribute<Ordinateur, Os> idOs;
    public static volatile SingularAttribute<Ordinateur, String> marque;
    public static volatile SingularAttribute<Ordinateur, String> ram;

}