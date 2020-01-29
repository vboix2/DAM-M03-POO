# Expressions regulars

## 1. Introducció

Una **expressió regular** és un patró que descriu un conjunt de cadenes de text.
Les expressions regulars s'utilitzen per:

* Cercar informació. Per exemple, cercar totes les cadenes de text que contenen determinats caràcters o que encaixen amb certa estructura. 
* Verificar el format d'unes dades d'entrada. Per exemple, comprovar que una cadena de text conté un correu electrònic correcte o un DNI vàlid.

## 2. Sintaxi

### 2.1. Símbols habituals

Un caràcter representa un literal i només pot coincidir amb una expressió igual.

* L'expressió regular "abc" només coincideix amb la cadena "abc".

També hi ha caràcters especials que representen grups de caràcters.
El punt '.' representa qualsevol caràcter.

* a. coincideix amb "aa", "af", "a3"...
* ..e coincideix amb "eee", "qwe", "12e", "@#e"...

Per representar un caràcter amb dues possibilitats podem utilitzar '|'.

* a|b representa les cadenes "a" i "b" 

Si es vol representar només un conjunt de caràcters possibles pot utilitzar-se el símbol de coincidència [].

* [abc] representa les cadenes "a", "b" i "c".
* [a-z] representa qualsevol caràcter entre "a" i "z".
* [a-zA-Z] o també [a-Z] representa qualsevol lletra majúscula o minúscula.
* [0-9] representa un dígit numèric.
* [^0-9] representa qualsevol caràcter excepte els números.

Altres símbols possibles són:

* '^' inici de la cadena
* '$' final de la cadena
* '\\' caràcter d'escapada

### 2.2. Quantificadors

Quan els símbols poden repetir-se a l'expressió podem utilitzar quantificadors:

* '\*' indica que pot aparèixer entre 0 i N vegades (a\* representa "", "a", "aa", "aaa"...).
* '+' indica que pot aparèixer entre 1 i N vegades (5+ representa "5", "55"...).
* '?' indica que pot aparèixer cap o una vegada (x? només representa "" i "x").
* '{x}' indica que només pot aparèixer x vegades ([0-9]{9} representa una cadena formada per 9 dígits, per exemple un número de telèfon).
* '{x,y}' indica que pot aparèixer entre x i y vegades.

### 2.3. Meta-caràcters

Es tracta de caràcters que equivalen a patrons habituals.

* \d Un dígit numèric, equival a [0-9]
* \D Un caràcter no numèric, equival a [^0-9]
* \s Un espai en blanc, [\\t\\n\\x0b\\r\\f]
* \S Un caràcter diferent a l'espai en blanc
* \w Un caràcter alfanumèric, [a-zA-Z0-9]
* \W Un caràcter no alfanumèric

## 3. Classes i mètodes

En Java disposem de dues classes per gestionar les expressions regulars, Pattern i Matcher, que es troben al paquet *java.util.regex*.
En primer lloc cal crear un objecte de la classe **Pattern** que contingui l'expressió regular a avaluar.
Per fer-ho utilitzem el mètode *compile*, indicant com a paràmetre d'entrada l'expressió regular com a String.
A continuació creem un objecte **Matcher** amb l'objecte *Pattern* i el mètode *matcher*, indicant ara la cadena de text a avaluar.
Finalment, podem utilitzar diferents mètodes de la classe *Matcher* per realitzar operacions sobre la cadena de text:

* *boolean find()*. Avalua si la cadena de text conté l'expressió regular.
* *boolean matches()*. Avalua si la cadena de text coincideix amb l'expressió regular.
* *String replaceAll(String s)*. Substitueix el patró coincident per el text especificat.

És important recordar que en els tipus String de Java el caràcter d'escapada és '\\', això vol dir que quan vulguem escriure una expressió regular amb aquest caràcter haurem d'utilitzar '\\\\'.

[Exemples d'utilització d'expressions regulars](../src/main/java/regex/Exemples.java)

## 4. Recursos

* [Regular expressions](https://docs.oracle.com/javase/tutorial/essential/regex/)
* [Regular expressions test page](http://www.regexplanet.com/advanced/java/index.html)
* [Classe Pattern](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html)
* [Classe Matcher](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Matcher.html)
