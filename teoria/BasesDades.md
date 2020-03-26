# Persistència en bases de dades

## 1. Introducció

Les aplicacions que hem fet fins ara només guarden la informació durant el temps
d'execució del programa.
Quan creem un objecte emmagatzemem el valor dels seus atributs, però aquesta 
informació es perd en finalitzar el programa.
La **persistència** es refereix a emmagatzemar aquesta informació de manera 
permanent en algun suport, com pot ser un fitxer de text o una base de dades, 
de tal manera que el puguem recuperar en successives execucions del programa.

## 2. Consultes SQL

El paquet *java.sql* proporciona una API per accedir a dades emmagatzemades en
una base de dades relacional.

En primer lloc cal carregar el controlador de la base de dades utilitzant `Class.forName()`.
Cal tenir en compte que aquesta instrucció pot llençar la excepció `ClassNotFoundException`.
En el cas d'utilitzar MySQL seria:
```java
Class.forName("com.mysql.cj.jdbc.Driver");
```

A continuació cal crear una connexió a la base de dades.
Per fer-ho creem un objecte de la classe `Connection` amb el mètode `DriverManager.getConnection()`
especificant la url de la base de dades l'usuari i la contrasenya.
En MySQL serà:
```java
String urlBaseDades = "jdbc:mysql://adreçaIP:3306/EsquemaBD";
Connection c = DriverManager.getConnection(urlBaseDades, "usuari", "contrasenya");
```

Per enviar una sentència a la base de dades cal crear un objecte `Statement` 
utilitzant el mètode `createStatement()` de la connexió a la base de dades.
```java
Statement statement = c.createStatement();
``` 

Si volem realitzar una inserció o actualització de dades utilitzarem el mètode `executeUpdate`.
```java
String sentencia = "INSERT INTO Taula (columna1, columna2) VALUES ('valor1','valor2')";
statement.executeUpdate(sentencia);
```

[Exemple d'inserció a una base de dades MySQL](../src/main/java/bbdd/Insercio.java)

Si volem fer una consulta utilitzarem el mètode `executeQuery`.
```java
ResultSet r = cerca.executeQuery("SELECT * FROM Taula");
```

Els resultats de la consulta es poden obtenir iterant el resultat.
```java
while (r.next()) {
    System.out.println(r.getString("columna1");
}
```

[Exemple de consulta a una base de dades MySQL](../src/main/java/bbdd/Consulta.java)

Per acabar, haurem de tancar la connexió a la base de dades amb el mètode `close()`.
```java
c.close();
```

## 3. Hibernate

Hibernate és una eina de mapeig objecte-relacional (ORM) per a Java.
Aquesta tècnica consisteix a mapejar les representacions de dades del model
d'objectes a un model de dades relacional.
Per tant, permet guardar els objectes d'una aplicació Java de manera permanent 
en una base de dades relacional.
A més, permet la consulta i recuperació de dades de la base de dades.

Per començar a utilitzar aquesta eina necessitarem importar la llibreria.
La manera més senzilla és crear un projecte amb Maven i afegir la dependència
al fitxer `pom.xml`, dins de l'etiqueta `<dependencies>`.
També necessitarem importar el connector de la base de dades, en aquest cas MySQL.

```xml
<dependency>
    <groupId>org.hibernate</groupId>
    <artifactId>hibernate-core</artifactId>
    <version>5.4.10.Final</version>
</dependency>
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.17</version>
</dependency>
```

[Exemple de fitxer pom.xml](../pom.xml)

A continuació hem de crear les classes que voldrem emmagatzemar a la base de dades.
Cada classe es guardarà en una taula de la base de dades i cada atribut en una columna de la taula.
Per tant, caldrà indicar quina classe correspon a cada taula i quin nom té la 
columna on es guardarà cada atribut. 
Això es pot fer amb un fitxer xml de mapeig o utilitzant anotacions sobre la 
mateixa definició de la classe.

Aquest exemple mostra una classe Contacte que es guarda en una taula del mateix nom.
El mapeig es realitza utilitzant les anotacions `@Entity`, `@Table`, `@Id` i `@Column`.

```java
@Entity
@Table(name="Contacte")  // Nom de la taula a la BD
public class Contacte implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;
    
    @Column(name="nom")  // Nom de la columna a la BD
    String nom;
    
    @Column(name="telefon")
    String telefon;
}
```

[Exemple de classe amb anotacions](../src/main/java/bbdd/hibernate/Contacte.java)

Per indicar la configuració d'hibernate necessitem crear el fitxer `hibernate.cfg.xml`.
Aquest fitxer s'ha de guardar a la carpeta resources del projecte Maven: src/main/resources.
El fitxer haurà d'indicar la cadena de connexió a la base de dades,
l'usuari i contrasenya de la connexió i el nom de la classe a mapejar.

En el següent exemple es realitza una connexió a l'esquema "EsquemaBD" d'una base 
de dades MySQL, situada a l'adreça `localhost` pel port 3306. La classe on 
s'emmagatzemen les dades es troba a "paquet.Classe".

```xml
<?xml version="1.0" encoding="UTF-8"?> 
<!DOCTYPE hibernate-configuration PUBLIC "-//Hibernate/Hibernate Configuration DTD 3.0//EN" 
"http://hibernate.sourceforge.net/hibernate-configuration-3.0.dtd">

<hibernate-configuration> 
    <session-factory>         
        <property name="connection.driver_class">com.mysql.cj.jdbc.Driver</property>         
        <property name="connection.url">jdbc:mysql://AdreçaIP:3306/EsquemaBD</property>     
        <property name="connection.username">usuari</property>       
        <property name="connection.password">contrasenya</property>     
        <property name="connection.pool_size">1</property>         
        <property name="dialect">org.hibernate.dialect.MySQL5Dialect</property>     
        <property name="show_sql">true</property>     
        <property name="hbm2ddl.auto">create-drop</property>      
        <mapping class="paquet.Classe" />     
    </session-factory>
</hibernate-configuration>
```

Ara només queda crear el codi d'accés a la base de dades.
La classe `HibernateUtil.java` permet establir l'accés a la base de dades creant
un objecte de la classe `SessionFactory`.

[Codi de la classe HibernateUtil](../src/main/java/bbdd/hibernate/HibernateUtil.java)

A més, caldrà crear una classe que guardi un objecte de la classe `HibernateUtil` i
implementi tots els mètodes per consultar, actualitza i inserir dades.

[Implementació dels mètodes per accedir a la base de dades](../src/main/java/bbdd/hibernate/Controlador.java)

Finalment, la classe principal haurà d'instanciar la classe Controlador i utilitzar
els seus mètodes per interactuar amb la base de dades. Per exemple:

```java
Controlador ct = new Controlador();
Contacte contacte = new Contacte("Nom", "telefon");
ct.inserta(contacte);
```

## 4. Recursos

Activitats
* [Pràctiques]

Documentació
* [java.sql](https://docs.oracle.com/javase/8/docs/api/index.html?java/sql/package-summary.html)
* [hibernate.org](https://hibernate.org/)

Enllaços
* [Hibernate a javatutoriales.com](https://www.javatutoriales.com/2009/05/hibernate-parte-2-persistiendo-objetos.html)




