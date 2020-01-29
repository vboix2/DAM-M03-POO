# Pràctiques

## Excepcions

### 1. Cafeteria

L'objectiu és crear una aplicació que simuli una cafeteria (classe *Cafeteria*).
A la cafeteria entren clients (classe Client) i se'ls assigna un taula.
Cada client demana una tassa de cafè (classe TassaCafe), que tindrà una temperatura aleatòria entre 50ºC i 90ºC.
Quan el client pren el cafè (mètode beureCafe(TassaCafe)) pot passar: 

* Si el troba massa fred (<60ºC) es llença l'excepció MassaFredException i es mostra un avís.
* Si el troba massa calent (>80ºC) es llença l'excepció MassaCalentException i es mostra un avís.
* Si la temperatura és correcta es mostra el text "És un cafè excel·lent".

Implementa l'aplicació en Java per a 20 clients.

[Solució](../src/excepcions/cafeteria)

### 2. Fira

Una atracció de fires paga una assegurança d'accidents.
L'asseguradora cobreix tots els accidents sempre que la persona que pateix un accident tingui una alçada entre 150 i 190 cms.
Per tal d'estar coberts, els propietaris de l'atracció col·loquen un sensor a l'entrada que detecta l'alçada de la persona que vol pujar a l'atracció.
Aquest sensor s'ha de programar amb una classe Java que tindrà només un mètode *obtenirAlcada()* que tornarà un natural (els cms que medeix una persona).
Per generar aquest número es pot utilitzar la classe Random.
Aquest valor es passarà a un controlador (mètode *comprovar()*)que porta incorporat la porta de l'atracció, el qual validarà l'alçada, obrint la porta  a aquelles persones que tinguin l'alçada correcta.
En qualsevol altre cas es generarà un error que més tard serà tractat.
Es vol tenir els diferents tipus d'errors ben diferenciats (per poder-ne deixar constància) segons les següents situacions:

* S'ha sobrepassat l'alçada màxima permesa.
* No s'arriba a l'alçada mínima permesa.

Es demana:

* Programar la classe Sensor i PortaEntrada, així com les excepcions necessàries.
* Programar també una classe AtraccioFires que contingui el mètode main, el qual, simularà l'entrada a l'atracció de 20 persones que tenen unes alçades compreses entre 130 i 215 cms (les dades del sensor).
* Si cal programar qualsevol altra classe, fes-ho, tot comentant dins el codi perquè es necessita.

Restriccions a tenir en compte:

* Obtenir la solució, codificant només un bloc try amb un únic bloc catch.
* No es pot capturar l'excepció Exception: només es poden capturar els errors a partir de classes d'excepció pròpies.

[Solució](../src/excepcions/fira)

## Lectura i escriptura d'informació

### 1. Agenda de contactes

L'objectiu d'aquesta pràctica és implementar una petita aplicació en Java que funcioni com a agenda de contactes.

Requeriments:

* Cal que guardi el nom, el telèfon i el correu electrònic
* L'agenda ha de poder guardar 20 contactes com a mínim
* Ha d'oferir les opcions:
  * Afegir contacte (afegeix un nou contacte a l'agenda)
  * Buscar contacte (cerca un contacte per nom i en mostra totes les dades)
  * Imprimir agenda (mostra tots els contactes de l'agenda)
  * Sortir (surt de l'aplicació)
* Els contactes s'han de guardar de manera permanent en un fitxer de text. Els contactes guardats s'han de poder recuperar en successives execucions de l'aplicació.

Ajuda:

* Cal crear una classe Contacte que guardi les dades d'un mateix contacte amb els mètodes associats que consideris necessaris.
* Cal crear una classe Agenda que guardi tots els contactes en un array. A més, caldrà definir-hi diferents atributs i mètodes per afegir, cercar o eliminar contactes.
* El fitxer de text ha d'utilitzar un caràcter únic com a separador per les dades de cada contacte, per exemple '|'. A més, els contactes se separaran per un salt de línia.
* La classe String proporciona mètodes per manipular les cadenes de text. Per exemple, el mètode split() separa una cadena de text a partir del caràcter especificat.

BONUS: si vols pots provar d'afegir una opció per a esborrar contactes.

[Solució](../src/fluxos/agenda)

