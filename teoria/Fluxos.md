# Lectura i escriptura d'informació

## 1. Fluxos de dades

Un flux (*stream*) és un mecanisme que permet transmetre un conjunt de dades de manera seqüencial des d'un origen a una destinació.
Un flux d'entrada permet llegir dades i un flux de sortida escriure'n. Els fluxos de dades inclouen qualsevol operació amb dades: fitxers, pantalla, teclat, comunicacions en xarxa...

En Java, les classes relacionades amb l'entrada i sortida de dades es troben al paquet *java.io*.
D'altra banda, les excepcions vinculades als errors de lectura o escriptura hereten de la classe *IOException*.

Hi ha dos tipus de fluxos de dades:

* Orientats a dades. Permeten gestionar entrades i sortides de dades en binari (*byte*). Utilitzen les classes abstractes *InputStream* i *OutputStream*.
* Orientats a caràcter. Permeten gestionar dades de tipus caràcter (*char*). Utilitzen les classes abstractes *Reader* i *Writer*.

## 2. Sortida de dades

La classe més habitual és **PrintStream** que deriva d'*OutputStream*. Per tant, es tracta d'un flux orientat a dades.

Per escriure dades per pantalla utilitzem *System.out*, que és un atribut estàtic de la classe *System*.
Aquest atribut conté un objecte de tipus *PrintStream* que apunta a la pantalla.
La classe *PrintStream* conté els mètodes *print* i *println* que permeten escriure dades a l'exterior.
Per tant, per escriure dades per pantalla fem *System.out.print()*.

[Exemples de sortida de dades per pantalla](../src/fluxos/SortidaPantalla.java)

Per escriure dades a altres fonts hem de crear un objecte *PrintStream* associat a la sortida que ens interessi.
Si volem escriure dades en un fitxer hem d'utilitzar el constructor de *PrintStream* indicant la ruta al fitxer com a String.
Si la ruta no existeix es produirà una excepció, per aquest motiu cal capturar una excepció de tipus *FileNotFoundException*.
A més, després d'escriure al fitxer cal tancar-lo i això s'ha de fer al bloc *finally* per assegurar que es tanqui encara que es produeixi una excepció.

Malgrat tot, a partir de Java 7, si es crea l'objecte a l'obertura del bloc *try* es tancarà automàticament al final del bloc o de l'excepció, sense necessitat d'utilitzar *finally*.
Aquest tipus d'escriptura de fitxers sempre sobreescriu el contingut anterior del fitxer.

Si volem afegir dades noves al final d'un fitxer, mantenint les anteriors, hem d'introduir un objecte de tipus **FileOutputStream** al constructor de la classe *PrintStream*.
A més, en construir l'objecte *FileOutputStream* caldrà indicar la ruta del fitxer i el paràmetre *append* com a *true*.

[Exemples de sortida de dades per fitxer](../src/fluxos/SortidaFitxer.java)

## 3. Entrada de dades

Per llegir dades des del teclat utilitzem la classe **Scanner** del paquet *java.util*.
El constructor té un paràmetre d'entrada de tipus *InputStream* on cal especificar l'atribut estàtic *System.in*, que fa referència al teclat.
La classe *Scanner* disposa de diferents mètodes per llegir dades de diferents tipus.

[Exemples de lectura de dades des del teclat](../src/fluxos/EntradaTeclat.java)

Per llegir dades des d'un fitxer utilitzem la classe **BufferedReader**, que deriva de *Reader*; per tant, es tracta d'un flux orientat a caràcters.
El constructor requereix un objecte de la classe *Reader*, que construim amb *FileReader* i especificant la ubicació del fitxer.

[Exemples de lectura de dades des d'un fitxer](../src/fluxos/EntradaFitxer.java)

## 4. Gestió de fitxers

La classe **File** també forma part del paquet *java.io* i permet representar fitxers i directoris del sistema.
Disposa d'alguns mètodes per obtenir informació o gestionar fitxers i directoris.

* *boolean exists()*. Permet saber si existeix la ruta al sistema.
* *boolean isFile()*. Retorna *true* si la ruta indica un fitxer.
* *boolean isDirectory()*. Retorna *true* si la ruta indica un directori.
* *long length()*. Indica la longitud del fitxer.
* *boolean createNewFile()*. Crea el fitxer amb el nom i la ruta especificats.
* *String[] list()*. Retorna un array amb tots els fitxers i directoris que es troben dins del directori especificat.

[Exemples d'utilització de la classe File](../src/fluxos/Fitxers.java)

## 5. Recursos

* [Classe PrintStream](https://docs.oracle.com/javase/8/docs/api/java/io/PrintStream.html)
* [Classe FileOutputStream](https://docs.oracle.com/javase/8/docs/api/java/io/FileOutputStream.html)
* [Classe Scanner](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html)
* [Classe BufferedReader](https://docs.oracle.com/javase/8/docs/api/java/io/BufferedReader.html)
* [Classe File](https://docs.oracle.com/javase/8/docs/api/java/io/File.html)