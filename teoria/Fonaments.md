# Fonaments de la programació orientada a objectes

## 1. Introducció

La programació funcional ens permet crear variables, dades compostes i funcions, però no podem lligar la declaració del tipus de dades amb les accions que s'hi poden efectuar.
La **programació orientada a objectes** encapsula en un mateix lloc (objecte) la definició del tipus de dades i les operacions que s'hi podran utilitzar.

Una **classe** conté la definició del tipus de dades (atributs) que formen un objecte i el conjunt d'operacions (mètodes) que permeten gestionar-ne els atributs.
Un **objecte** és una instància de la classe i està format pels valors dels atributs d'una classe.
Les classes es corresponen amb conceptes o elements abstractes del món real i els objectes amb elements concrets amb característiques determinades.

La programació orientada a objectes permet separar el disseny de les classes del seu ús. Per utilitzar els objectes no cal saber com estan construïts, només com funcionen.

## 2. Objectes

Per crear un objecte cal utilitzar l'operador **new** seguit del constructor, que és un mètode especial que permet instanciar la classe.
Aquest objecte pot assignar-se a una variable per poder fer-hi referència.
Els constructors poden tenir paràmetres d'entrada, cal consultar la documentació de cada classe per saber de quins constructors es disposa i quins paràmetres demanen.

Per manipular els objectes utilitzem els **mètodes** de la classe a la que pertany.
Això ho fem indicant el nom de la variables que fa referència a l'objecte, seguida d'un punt '.' i del nom del mètode a utilitzar: *variable.mètode()*.
Els mètodes també poden requerir paràmetres d'entrada i també caldrà consultar la documentació.

[Exemples de creació i manipulació d'objectes](../src/main/java/fonaments/Principal.java)

Els objectes que no s'utilitzen o que han perdut la seva referència s'eliminen automàticament a través del procés *Garbage Collector*.
També se'l pot cridar de manera manual utilitzant *System.gc()*.

## 3. Classes

### 3.1. Declaració

Per definir una classe necessitem la **declaració** i el **bloc de la classe**, seguint l'estructura: *declaració {bloc}*.

La declaració utilitza la paraula reservada **class** seguida del nom de la classe.
El nom de la classe ha de coincidir amb el nom del fitxer; a més, és recomanable (no obligatori) que comenci per majúscula.

El bloc de la classe s'escriu entre claus {} i pot contenir: atributs, iniciadors, constructors i mètodes.

[Exemple de definició d'una classe](../src/main/java/fonaments/Compte.java)

### 3.2. Atributs

Els atributs són variables que representen propietats de l'objecte.
Es declaren a l'inici de la classe com una variable de tipus primitiu o com una referència a un altra classe.

### 3.3. Iniciadors i constructors

Els iniciadors són blocs de codi (entre claus) que s'executen cada cop que es crea un objecte.

Els constructors serveixen per instanciar els objectes; també s'executen en crear un objecte, però permeten introduir paràmetres d'entrada i s'acostumen a utilitzar per inicialitzar els atributs.
Es declaren com un mètode, però no tenen paràmetres de sortida i han de tenir sempre el mateix nom que la classe.
Poden crear-se tants com calgui, però han de tenir tots el mateix nom i diferenciar-se pel número o tipus de paràmetres d'entrada.
Si no se'n defineix cap els objectes es crearan amb el constructor per defecte (*NomClasse()*).

Els iniciadors s'executaran sempre que es creï un objecte, abans de qualsevol constructor.
En canvi, els constructors permeten executar diferents blocs de codi en funció de quin s'utilitzi.

### 3.4. Mètodes

Es tracta de funcions que actuen sobre els objectes de la classe. Han de tenir:

* Modificador d'accés: Controla l'accés al mètode (public, private, protected...)
* Tipus de sortida: Tipus de dada per al paràmetre de sortida (String, int, double, void...)
* Nom del mètode: Nom que s'utilitzarà per cridar al mètode (preferiblement en *camelCase*).
* Paràmetres d'entrada: Tipus de dada i nom de la variable per als paràmetres d'entrada (entre parèntesis).
* Cos del mètode: Bloc de codi (entre claus {}) amb les instruccions a executar.

[Exemple de definició i ús de mètodes](../src/main/java/fonaments)


### 3.5. Modificadors i directives

Tant les classes com els seus elements (atributs i mètodes) poden contenir modificadors.
Els **modificadors d'accés** s'indiquen a l'inici de la declaració i s'encarreguen de controlar-ne l'accés a través de quatre opcions:

* *public* - tothom hi té accés
* *private* - només tenen accés els mètodes de la pròpia classe
* *protected* - *public* per a les classes derivades i *private* per a la resta
* (sense modificador) - *public* per a les classes del mateix paquet i *private* per a la resta.


## 4. Paquets

Quan disposem de diverses classes convé organitzar-les en directoris que agrupin classes semblants o relacionades. En Java les classes s'organitzen en paquets o biblioteques de classes. Per indicar a quin paquet pertany una classe utilitzem la sentència **package** seguida de l'identificador del paquet  (aquesta sentència sempre ha de ser la primera).

El llenguatge Java proporciona una gran quantitat de paquets de classes. Per utilitzar-los hem d'importar-los al nostre codi a través de la sentència **import** seguida del nom del paquet (tot i que hi ha alguns paquets que no és necessari importar-los). Abans d'utilitzar qualsevol paquet hem de consultar la documentació de Java per saber de quins mètodes disposem i com s'utilitzen.

Alguns dels paquets estàndard de l'API de Java són:

* java.io - conté classes que defineixen diferents fluxos de dades, és a dir, entrades i sortides de dades.
* java.lang - conté classes essencials per al llenguatge i s'importa implícitament sense utilitzar import.
* java.util - conté classes amb utilitats per al programador.
* java.net - permet enviar i rebre dades a través de la xarxa


### 4.1. Classe Math

La classe *Math* proporciona mètodes per realitzar operacions matemàtiques. Aquesta classe forma part del paquet *java.lang* i no cal importar-la (s'importa per defecte).

Les constants *Math.PI* i *Math.E* contenen el valor dels nombres 'pi' i 'e'.

Tots els mètodes de la classe *Math* són estàtics; això vol dir que no cal instanciar cap objecte i poden utilitzar-se amb el nom de la classe. Alguns dels més habituals són:

* int round(double n) - arrodoneix a l'enter més proper
* int floor(double n) - arrodoneix a l'enter inferior
* int ceil(double n ) - arrodoneix a l'enter superior
* int max(int a, int b) - retorna el major
* int min(int a, int b) - retorna el menor
* double random() - retorna un nombre aleatori entre 0 i 1 (exclòs)

Per exemple, per obtenir un nombre aleatori entre 0 i 10 podem fer:

*Math.floor(Math.random()*10 + 1);*

### 4.2. Classes String i StringBuilder

La classe **String** genera cadenes de text immutables, no es poden modificar.
Per crear-les podem utilitzar el constructor *new String("text")* o crear-les de manera abreviada amb una simple assignació.

Els objectes *String* permeten operacions de concatenació (+) per crear noves cadenes de text.
Malgrat tot, aquests objectes mai es modifiquen, es crea un nou objecte que s'apunta des de la mateixa variable.

[Exemple d'utilització de la classe String](../src/main/java/fonaments/Text.java)

La classe **StringBuilder** representa una cadena de text que pot ser modificada.
A diferència de la classe *String*, només admet la creació a través del constructor i no admet l'operació de concatenació.
S'utilitza quan cal modificar sovint una cadena de text perquè evita crear i eliminar objectes constantment.
Alguns dels mètodes dels que disposa són:

* *append(String s)* - afegeix text al final
* *insert(int p, String s)* - afegeix text a la posició especificada
* *delete(int i, int f)* - elimina els caràcters entre la posició inicial (inclosa) i la posició final (no inclosa)
* *substring(int i, int f)* - extreu un tros de la cadena
* *length()* - longitud de la cadena
* *toString()* - converteix a un objecte de la classe *String*  

[Exemple d'utilització de la classe StringBuilder](../src/main/java/fonaments/Text.java)


### 4.3. Classes d'envoltori

Les classes d'envoltori es troben al paquet *java.lang* i representen als diferents tipus primitius de Java:
*Byte, Short, Integer, Long, Float, Double, Character, Boolean*.
Serveixen per encapsular els tipus primitius en objectes, d'aquesta manera podem crear col·leccions o realitzar determinades operacions que els tipus primitius no permeten.

[Exemple d'utilització de les classes d'envoltori](../src/main/java/fonaments/Envoltori.java)

A partir de Java 5, la conversió entre tipus primitius i classes d'envoltori es realitza automàticament (*autoboxing*).

Les classes d'envoltori numèriques també disposen de mètodes estàtics per convertir cadenes de text en nombres.
Els mètodes són *parseInt, parseFloat, parseDouble...*.
