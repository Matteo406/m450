**Grundlagen zu Testing und Testing in Vorgehensmodelle**

## Lernziele

- Sie können Gründe für das Testen einer Applikation nennen
- Sie kennen den Unterschied zwischen einem Fehler und einem Mangel
- Sie können den Begriff Fehlermaskierung erklären
- Sie können erläutern, wieso ein vollständiges Testen nicht möglich ist
- Sie können die Kriterien für gute Testfälle erklären
- Sie kennen SW-Vorgehensmodelle und können diese beschreiben
- Sie können die Arten von Tests den jeweiligen SW-Vorgehensmodellen zuordnen

### Grund für Testing

Testing wird in der Softwareentwicklung eingesetzt, um die Qualität der Software zu verbessern und zu garantieren. Testing wird auch bereits vor der Softwareentwicklung in anderen Branchen eingesetzt.

### Fehler und Mangel

Fehler und Mangel sind zwei Begriffe, die in der Softwareentwicklung oft verwendet werden. Ein Fehler ist wenn die Ausführung nicht dem erwarteten entspricht und Mangel sind wenn die Ausführung nicht den Anforderungen entspricht.

### Fehlermaskierung

Fehlermaskierung ist wenn ein anderer Teil der Software ein Fehler verursacht. Dieser Fehler wird dann nicht mehr erkannt, da der andere Fehler diesen verdeckt.

### Vollständiges Testen

Vollständiges Testen ist nicht möglich, da es zu viele Kombinationen gibt. Es ist auch nicht möglich, alle möglichen Eingaben zu testen.

### Kriterien für gute Testfälle

- Aus Tests, welche eine hohe Wahrscheinlichkeit von Fehler aufzeigen
- Aus Tests, die nicht dasselbe testen (keine Redundanz)
- Aus Tests, die unabhängig von einander sind
- Aus Tests, die möglichst viel Code abdecken

### SW-Vorgehensmodelle

Das SW-Vorgehensmodell ist ein Modell, welches den Ablauf der Softwareentwicklung beschreibt. Das V Modell ist ein verbesserts Wasserfall Modell.

![V Modell](peco-v-modell.png)

_Beschreibung von Modell_

Der **linke Ast** steht für die Entwicklungsschritte, in deren Verlauf das gewünschte System schrittweise und zunehmend detailierter entworfen und programmiert wird. Diese Schritte sind sehr ähnlich wie im Wasserfallmodell, also aufgegliedert in

- **Anforderungsdefinition** mit den Wünschen und Anforderungen des Auftraggebers
- **Funktionaler Systementwurf** wo die Anforderungen auf Funktionen und Dialoge abgebildet werden
- **Technischer Systementwurf** wo die technische Realisierung entworfen wird (System wird in Komponente unterteilt, Schnittstellen werden definiert)
- **Komponentenspezifikation**, wo jedes Teilsystem im Detail beschrieben wird
- **Programmierung**, wo jeder Baustein (Modul, Klasse, etc.) in einer Programmiersprache programmiert wird

Der **rechte Ast** zeigt die Integrations- und Testarbeiten, in deren Verlauf elementare Programmbausteine sukzessive zu grösseren Teilsystemen zusammengesetzt (= integriert) werden.
Wir haben somit auf jeder Ebene eine bestimmten Test:

- **Komponententest** prüft, ob jeder elementare Softwarebaustein seine Vorgaben erfüllt.
- **Integrationstest** prüft, ob Gruppen von Komponenten korrekt zusammenspielen
- **Systemtest** prüft, ob das System als Ganzes die Anforderungen erfüllt.
- **Abnahmetest** prüft, ob das System vom Kunden als korrekt akzeptiert wird.

Für jede dieser Testart gibt es unterschiedliche Testmethoden und Testwerkzeuge. Es gibt auch unterschiedliches Personal (z.bsp. wird sich der Programmierer um den Komponententest kümmern).

Das V-Modell sieht so aus, als ob das Testen erst spät beginnen würde. Dieser Eindruck ist aber falsch. Im V-Modell ist das Testen gleichwertig wie das Entwickeln einer Software. Somit werden diese Teststufen parallel mit der Entwicklung durchgeführt.

## SCRUM als Beispiel für das iterative Testen

SCRUM haben Sie schon im Modul 426 kennengelernt. Hier steht der iterativer Prozess im Vordergrund, mit der Idee, dass jede folgende Iteration einer Software eine verbesserte Version des Produkts erstellt. Das Produkt wird nicht _an einem Stück_ entwickelt, sondern in einer Abfolge von Versionen.
Die Entwicklung wird somit agiler.

### Arten von Tests im SW-Vorgehensmodell

**Quellen**
https://gitlab.com/ch-tbz-it/Stud/m450/m450/-/blob/main/Unterlagen/grundlagen/README.md#grundlagen-zu-testing-und-testing-in-vorgehensmodelle

## Aufgabe 01

## Aufgabe 02

## Aufgabe 03
