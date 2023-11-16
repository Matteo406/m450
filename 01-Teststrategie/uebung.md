## Übung 1

### Abstrakte Testfälle:

| Testfall | Bedingung                             | Erwartetes Ergebnis |
| -------- | ------------------------------------- | ------------------- |
| T1       | Kaufpreis < 15'000 CHF                | Kein Rabatt         |
| T2       | 15'000 CHF <= Kaufpreis <= 20'000 CHF | 5% Rabatt           |
| T3       | 20'000 CHF < Kaufpreis < 25'000 CHF   | 7% Rabatt           |
| T4       | Kaufpreis >= 25'000 CHF               | 8,5% Rabatt         |

### Konkrete Testfälle:

| Testfall | Kaufpreis  | Erwartetes Ergebnis |
| -------- | ---------- | ------------------- |
| T1       | 10'000 CHF | Kein Rabatt         |
| T2       | 18'000 CHF | 5% Rabatt           |
| T3       | 22'000 CHF | 7% Rabatt           |
| T4       | 30'000 CHF | 8,5% Rabatt         |

## Übung 2

Autovermietung: https://www.oldtimers.ch/

| ID  | Beschreibung                          | Erwartetes Resultat | Effektives Resultat | Status | Mögliche Ursache |
| --- | ------------------------------------- | ------------------- | ------------------- | ------ | ---------------- |
| 1   | Sprachwechsel  | Sobald ich DE/FR/EN auswähle sollte die Website in eine andere Sprache sein | Wenn auf DE gedrückt sollte die Sprache deutsch sein | Erfolg   | - |
| 2   | Filteroptionen | Wenn ich in der Suche die Filteroption Marke auf Ferrari stellen sollten nur Autos von der Marke Ferrari dargestellt werden | Ferraris | Erfolg | - |        
| 3   | Überprüfung der Buchungsfunktionalität        | Überprüfung der Buchungsfunktion, ob sie korrekt funktioniert | Buchung wird erfolgreich abgeschlossen | Erfolg | - |
| 4   | Überprüfung der Kundenbenachrichtigung         | Testen, ob Kundenbenachrichtigungen korrekt generiert und versendet werden | Kunden erhalten die Benachrichtigungen | Erfolg | - |
| 5   | Überprüfung der Fahrzeugverfügbarkeit         | Feststellen, ob die Website korrekt die Verfügbarkeit von Fahrzeugen anzeigt | Die Website zeigt die aktuelle Verfügbarkeit korrekt an | Erfolg | - |

## Übung 3
### Black-Box Testfälle:

| Testfall | Beschreibung                                               | Erwartetes Ergebnis                            | Status  |
|----------|------------------------------------------------------------|--------------------------------------------------|---------|
| T1       | Konto erstellen mit gültigen Daten                        | Konto wird erfolgreich erstellt                | Erfolg  |
| T2       | Konto erstellen mit bereits vorhandenem Namen             | Fehlermeldung: "Konto mit diesem Namen existiert bereits" | Erfolg  |
| T3       | Konto erstellen mit ungültigem Anfangssaldo (< 0)        | Fehlermeldung: "Anfangssaldo muss größer oder gleich 0 sein" | Erfolg  |
| T4       | Konto erstellen mit gültigem Anfangssaldo (> 0)          | Konto wird erfolgreich erstellt                | Erfolg  |
| T5       | Konto bearbeiten mit ungültiger Kontonummer              | Fehlermeldung: "Ungültige Kontonummer"          | Erfolg  |
| T6       | Konto bearbeiten (Guthaben abheben)                      | Guthaben wird korrekt abgehoben                | Erfolg  |
| T7       | Konto bearbeiten (Guthaben einzahlen)                    | Guthaben wird korrekt eingezahlt               | Erfolg  |
| T8       | Konto löschen                                             | Konto wird erfolgreich gelöscht               | Erfolg  |
| T9       | Konto löschen mit ungültiger Kontonummer                 | Fehlermeldung: "Ungültige Kontonummer"          | Erfolg  |

### White-Box Testfälle (Bezug auf ExchangeRateOkhttp-Klasse):

| Testfall | Beschreibung                                        | Erwartetes Ergebnis                   | Status  |
|----------|-----------------------------------------------------|----------------------------------------|---------|
| T10      | Gültige Währungspaare für ExchangeRateOkhttp testen | ExchangeRateOkhttp gibt korrekten Wechselkurs zurück | Erfolg  |
| T11      | Umgang mit HTTP-Fehler im ExchangeRateOkhttp       | Fehlermeldung wird korrekt abgefangen  | Erfolg  |
| T12      | Überprüfung des korrekten API-Aufrufs               | ExchangeRateOkhttp ruft das API mit den richtigen Parametern auf | Erfolg  |

### Verbesserungen und Best Practices im Code:
1. **Kommentare und Dokumentation:** Fügen Sie detaillierte Kommentare und Dokumentation im Code hinzu, um die Lesbarkeit und Wartbarkeit zu verbessern.
2. **Exception Handling:** Implementieren Sie robustes Exception Handling, um unerwartete Fehler effektiv zu handhaben und aussagekräftige Fehlermeldungen bereitzustellen.
3. **Kapselung:** Erwägen Sie die Verwendung von Getter- und Setter-Methoden, um den direkten Zugriff auf Klassenvariablen zu minimieren und die Kapselung zu fördern.
4. **Validierung:** Fügen Sie Validierungen hinzu, um sicherzustellen, dass nur gültige Daten in die Anwendung eingegeben werden können.
5. **Verwendung von Konstanten:** Verwenden Sie Konstanten für feststehende Werte wie API-Endpunkte oder Schlüssel, um eine zentrale Steuerung zu ermöglichen.
7. **Testabdeckung:** Implementieren Sie umfassende Tests, um sicherzustellen, dass alle Teile des Codes ordnungsgemäß funktionieren.