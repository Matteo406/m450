**M450 Testing**

[Miro Board](https://miro.com/app/board/uXjVNO4koFs=/)
[NapMap](https://napmap.vercel.app/)

## Begriffe

- Fehlermaskierung
  - Fehlermaskierung ist ein Verfahren, bei dem ein Fehler durch einen anderen Fehler überdeckt wird. Dies kann zu einer Fehlfunktion des Systems führen.

# 01-Teststrategie

## Lernziele

- Elemente einer Teststrategie kennenlernen
- Unterschied zwischen abstrakten und konkreten Testfällen erklären
- Unterschied zwischen funktionalen und nicht-funktionalen Testfällen verstehen
- Testmethoden erläutern

---

## Teststrategie und Planung

Eine klare Teststrategie ist für effektives Softwaretesting unerlässlich. Testing erfordert einen durchdachten Plan, ähnlich wie die Softwareentwicklung selbst. Teststrategie und Testkonzept sind eng miteinander verbunden. Die Strategie beschreibt den Testprozess, während im Testkonzept die wesentlichen Elemente festgelegt werden. Im Fokus dieses Abschnitts stehen vier grundlegende Punkte:

1. **Testobjekte:** Eine kurze Liste der Softwarekomponenten, die getestet werden, wie z. B. Programmmodule, Units oder Skripte.

2. **Was wird getestet – Testfälle:** Hier werden funktionale und nicht-funktionale Testfälle definiert. In diesem Modul liegt der Fokus auf funktionalen Testfällen. Unterschieden wird zwischen abstrakten und konkreten Testfällen.

   - _Funktionale Testfälle_ beschreiben die vom Kunden definierten Softwarefunktionen.
   - _Nicht-funktionale Testfälle_ beziehen sich auf Aspekte wie die Performance der Anwendung.

3. **Testmethoden auswählen:** Hier wird festgelegt, wie getestet wird – ob es sich um Black-Box- oder White-Box-Tests handelt und ob die Tests automatisiert oder manuell durchgeführt werden.

   - _White-Box Testfälle_ werden auf der Unit-Testebene durchgeführt, wobei der Code sichtbar ist.
   - _Black-Box Testfälle_ werden auf einem höheren Testniveau durchgeführt, ohne dass der Code sichtbar ist.

   Die Automatisierung von Testfällen wird später im Detail behandelt.

4. **Testumgebung festlegen:** Die Auswahl von Tools und Ressourcen, die für die Testdurchführung benötigt werden.

Die genannten Punkte bilden die Grundlage einer umfassenden Teststrategie. In den folgenden Modulkapiteln werden diese Themen detaillierter behandelt.

# 02-Testlevels

## Glossar:

| Abkürzung | Erklärung               |
| --------- | ----------------------- |
| Bug       | Software Fehler / Error |
| UAT       | User Acceptance Testing |
| QA        | Quality Assurance       |
| SLA       | Service Level Agreement |

## Lernziel:

- Ich kenne die verschiedenen Stufen von Testing
- Ich kenne die Reihenfolge dieser Stufen im Entwicklungs Prozess
- Ich kenne Begrifflichkeiten wie White-Box und Black-Box
- Ich weiss welche Stufen von welchen Rollen abgedeckt sind
- Sie kennen den funktionale und nichtfunktionale Anforderungen

## Testlevels:

![Testlevels](who-does-what-level.png)

**Ablauf der Testlevels:**
![Tests](time-complexity.png)

## White-Box vs. Black-Box:

**White-Box Testing**:
White-Box Testing ist eine Testmethode, bei der der Tester die interne Struktur, das Design und die Implementierung des Codes kennt. Der Tester wählt Testfälle basierend auf dem Code aus, um die interne Struktur des Programms zu testen. Es wird auch als Struktur-, Code- oder Glass-Box-Test bezeichnet.

**Black-Box Testing**:
Black-Box Testing ist eine Testmethode, bei der der Tester die interne Struktur, das Design und die Implementierung des Codes _nicht_ kennt. Der Tester wählt Testfälle basierend auf den funktionalen Anforderungen aus, ohne die interne Struktur des Programms zu kennen. Es wird auch als funktioneller, externer oder Spezifikationstest bezeichnet.
