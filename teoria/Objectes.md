# Orientació a objectes

## 1. Herència

L'herència permet crear classes que adquireixin automàticament els mètodes i atributs d'una classe ja existent i, a més, definir-ne de propis.
La classe que conté els mètodes i atributs s'anomena **superclasse** i la classe (o les classes) que els hereta s'anomena **subclasse**.
En Java, una subclasse només pot heretar d'una única superclasse, l'herència múltiple no està permesa.

L'herència permet aprofitar codi d'una classe en una altra sense necessitat de reescriure'l.
Generalment s'utilitza per agrupar en una superclasse tots els atributs o mètodes comuns a un conjunt de classes, de tal manera que no és necessari repetir aquest codi a cada classe.

El constructor d'una subclasse sempre ha d'incloure com a primera instrucció una crida al constructor de la classe superior a través de la instrucció *super()*.
Si no la posem, el compilador afegirà el constructor per defecte *super()* sense paràmetres.

[Exemple d'herència de classes](../src/main/java/objectes/herencia)

En Java, totes les classes hereten de la superclasse **Object**.
El compilador afegeix sempre *extends Object*.

Quan declarem una classe com a **final** no pot ser heretada.

## 2. Sobrecàrrega

La **sobrecàrrega de mètodes** permet definir en una mateixa classe diferents mètodes amb un mateix nom.
Aquests mètodes s'han de diferenciar pel tipus o quantitat de paràmetres d'entrada, el paràmetre de sortida no permet diferenciar-los.

Els constructors també poden sobrecarregar-se per disposar de diferents maneres de crear un objecte.

[Exemple de sobrecàrrega de constructors](../src/main/java/objectes/herencia/Persona.java)

## 3. Sobreescriptura

La sobreescriptura consisteix a substituir un mètode d'una superclasse per un de nou definit a la subclasse.
És important respectar el format de l'original per anul·lar-lo i evitar la sobrecàrrega.
Per tant, cal tenir en compte:

* El nom del mètode ha de ser el mateix
* La llista de paràmetres d'entrada ha de ser igual
* El tipus de dada de sortida ha de ser igual o un subtipus de l'original

Per evitar errors, convé avisar al compilador que volem sobreescriure un mètode amb l'anotació *@Override*.

[Exemple de sobreescriptura d'un mètode](../src/main/java/objectes/herencia/Alumne.java)

Per cridar al mètode original de la superclasse des d'un mètode sobreescrit podem utilitzar l'expressió *super.nomMetode()*.

Els mètodes declarats com a **final** no poder ser sobreescrits.

## 4. Classes abstractes

Una **classe abstracte** és una superclasse que conté algún **mètode abstracte**, és a dir, un mètode que està declarat però no implementat.
Les classes abstractes serveixen per definir un format per als mètodes de les subclasses.
Per tant, el seu codi s'implementarà sobreescrivint el mètode a la subclasse.
Les subclasses d'una classe abstracta estan obligades a sobreescriure els mètode abstractes, a no ser que també es declari com a abstracte.

[Exemple de classe abstracta](../src/main/java/objectes/polimorfisme/Figura.java)

[Exemple d'implementació d'un mètode abstracte](../src/main/java/objectes/polimorfisme/Cercle.java)

## 5. Polimorfisme

En Java és possible guardar en una variable d'una superclasse un objecte d'una subclasse.
A través d'aquesta variable podem cridar mètodes de l'objecte que també pertanyin a la superclasse.
El **polimorfisme** consisteix a poder utilitzar una mateixa expressió per cridar diferents versions d'un mateix mètode.
Això permet simplificar i reutilitzar el codi.

[Exemple de polimorfisme](../src/main/java/objectes/polimorfisme/Principal.java)

## 6. Interfícies

### 6.1. Introducció

Una **interfície** és un conjunt de mètodes abstractes; no té constructors, atributs ni mètodes amb codi.
Les interfícies s'utilitzen per definir el format de certs mètodes que les classes s'encarregaran d'implementar.
En una interfícies totes els mètodes seran *public* i *abstract* per defecte.

[Exemple d'interfície](../src/main/java/objectes/interficies/Operacions.java)

Una classe que implementa una interfícies està obligada a sobreescriure (implementar) tots els mètodes.

[Exemple d'implementació d'una interfície](../src/main/java/objectes/interficies/Aritmetica.java)

Una interfíce pot incloure constants.
Per defecte, les variables definides a la interfície són *public static final*.

Una classe pot heretar d'una altra classe i a la vegada implementar una o més interfícies.
Per exemple:

*public class NomClasse extends Superclasse implements Interficie1, Interficie2...*

### 6.2. Herència i polimorfisme

Una interfície pot heretar d'una o més interfícies (les interfícies permeten l'herència múltiple).
En aquest cas, la classe que implementi aquesta subinterfície haurà de sobreescriure tots els mètodes que hereti.

El polimorfisme també pot aplicar-se a les interfícies.
Podem definir un mètode que operi sobre un objecte de qualsevol classe que implementi determinada interfície.
Per exemple:

*static void nomMetode (NomInterficie variable) ...*

### 6.3. Interfícies a Java 8 i Java 9

A partir de Java 8, una interfície pot incloure implementacions per defecte d'un mètode, utilitzant la paraula *default*.
Les classes només estan obligades a implementar els mètodes abstractes, no els *default*;
però si una classe implementa dues interfícies amb el mateix mètode *default* està obligada a sobreescriure'l.

Les interfícies de Java 8 també poden incloure mètodes estàtics.
Aquests mètodes no són heretats per les classes, només poden ser cridats amb el nom de la interfícies.

A partir de Java 9, les interfícies poden incloure mètodes privats, per a ús intern d'algun mètode *default*.

