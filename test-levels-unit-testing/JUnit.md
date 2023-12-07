# **JUnit Features:**

- **Annotations:** `@Test`, `@BeforeAll`, `@BeforeEach`, `@AfterEach`, `@AfterAll`, etc.
- **Assertions:** `assertEquals`, `assertTrue`, `assertFalse`, `assertNotNull`, `assertThrows`, etc.
- **Assumptions:** `assumeTrue`, `assumeFalse`, `assumingThat`.
- **Parameterized Tests:** Testen mit verschiedenen Eingabeparametern.
- **Timeouts:** Begrenzung der maximalen Ausführungszeit eines Tests.
- **Test Suites:** Bündelung von Tests.

**Anwendungsfälle/Beispiele:**

- Annotation `@Test`: Kennzeichnet eine Methode als Testfall.

  ```java
  @Test
  @Order(1) // Reihenfolge der Tests
  void testAddition() {
      // Test code here
  }
  ```

- Assertion `assertEquals`: Überprüft, ob zwei Werte gleich sind.

  ```java
  assertEquals(4, calculator.add(2, 2));
  ```

- Parameterized Tests: Testen mit verschiedenen Eingabeparametern.

  ```java
  @ParameterizedTest
  @ValueSource(ints = {1, 2, 3})
  void testSquare(int value) {
      assertEquals(value * value, square(value));
  }
  ```

- Timeout: Setzt eine maximale Ausführungszeit für einen Test.

  ```java
  @Test
  @Timeout(5) // 5 Sekunden Timeout
  void testLongRunningOperation() {
      // Test code here
  }
  ```

- Test Suites: Zusammenfassen mehrerer Testklassen.
  ```java
  @RunWith(Suite.class)
  @SuiteClasses({CalculatorTest.class, AnotherTestClass.class})
  public class TestSuite {
      // Empty class
  }
  ```

**Referenzseite:**
[JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/)
