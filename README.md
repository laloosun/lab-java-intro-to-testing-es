
![logo_ironhack_blue 7](https://user-images.githubusercontent.com/23629340/40541063-a07a0a8a-601a-11e8-91b5-2f13e4e6b441.png)

# LAB | Java Introducción al Testing

## Introducción

Acabamos de aprender la importancia de una buena cobertura de pruebas y el papel del TDD (Desarrollo Guiado por Pruebas), así que practiquemos un poco más.

<br>

## Requisitos

1. Haz un fork de este repositorio.
2. Clona este repositorio.
3. Añade a tu instructor y a los calificadores de la clase como colaboradores de tu repositorio. Si no estás seguro de quiénes son los calificadores de tu clase, pregunta a tu instructor o consulta la presentación del primer día.
4. En el repositorio, crea un proyecto de Java y añade el código para las siguientes tareas.

## Entrega

Una vez que termines la tarea, envía un enlace URL a tu repositorio o tu solicitud de extracción en el campo de abajo.

<br>

## Instrucciones

1. Empleando TDD, crea un método que tome un número entero n y devuelva una array de todos los números impares de 1 a n.
   - *¡Escribe tus tests primero!*
2. Java tiene ciertas palabras que se consideran "palabras clave de Java". Las palabras clave están reservadas y no se pueden usar como nombres de variables. Empleando TDD, crea un método que tome un String y devuelva `true` si el String contiene cualquier palabra clave de Java.
   - Por ejemplo, `break` es una palabra clave de Java. La cadena `"Don't break my heart"` debería devolver *true*. La cadena `"I love to breakdance"` debería devolver *false*.
   - *Tendrás que usar Google para encontrar una lista de todas las palabras clave de Java.*
3. Crea una clase abstracta llamada `Player` para representar a un jugador en un juego de video. Define las siguientes propiedades: salud, fuerza y vidas.
   - Crea getters y setters para cada propiedad.
   - Añade un constructor para inicializar las propiedades con los valores pasados.
   - Añade un método `decrementLive()` que disminuye las vidas en 1 y restaura la salud a su valor original. Si las vidas son menores o iguales a 0, imprimir "Este personaje está muerto".
   - Añade un método `attack(Player playerToAttack)` que disminuye la salud del jugador, pasado como argumento, por la fuerza del jugador actual.
   - Añade un método `checkHealth()` que verifica si la salud del jugador actual es menor o igual a 0, si es así, llama al método `decrementLive()`.
4. Crea tres subclases de Player - `Warrior`, `Elf` y `Wizard`.
   - La clase `Warrior` debería tener una propiedad adicional de fuerza y un método `convertToElf()` que devuelva una instancia de la clase Elf con las propiedades del guerrero actual.
   - La clase `Elf` debería tener una propiedad adicional `speed`.
   - La clase `Wizard` debería tener una propiedad adicional `spell` y un método `convertToElf()` que devuelva una instancia de la clase Elf con las propiedades del mago actual.
5. Agrega todas los tests necesarias.

<br>  

## FAQs (Preguntas frecuentes)

<br>

<details>  
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">Estoy atascado y no sé cómo resolver el problema o por dónde empezar. ¿Qué debo hacer?</summary>  

 <!-- ✅ -->  

Si estás atascado en tu código y no sabes cómo resolver el problema o por dónde empezar, debes dar un paso atrás y tratar de formular una pregunta clara y directa sobre el problema específico que enfrentas. El proceso que seguirás al tratar de definir esta pregunta te ayudará a limitar el problema y a encontrar soluciones potenciales.

Por ejemplo, ¿estás enfrentando un problema porque no entiendes el concepto o estás recibiendo un mensaje de error que no sabes cómo arreglar? Por lo general, es útil intentar formular el problema de la manera más clara posible, incluyendo cualquier mensaje de error que estés recibiendo. Esto puede ayudarte a comunicar el problema a otras personas y, potencialmente, a obtener ayuda de tus compañeros o recursos en línea.

Una vez que tengas una comprensión clara del problema, deberías poder comenzar a trabajar hacia la solución.

</details>  

<br>

<details>  
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">¿Cómo creo un proyecto Maven en IntelliJ?</summary>  

 <!-- ✅ -->  

Para crear un proyecto Maven en IntelliJ, puedes seguir estos pasos:

1. Abre IntelliJ IDEA y haz clic en el botón "Create New Project".
2. En el diálogo "New Project", selecciona "Maven" como el sistema de compilación.
3. Especifica el nombre del proyecto.
4. En la sección "Project Location", especifica una ubicación donde quieres guardar tu proyecto.
5. Selecciona la casilla de verificación "Create Git repository" para inicializar el repositorio git al crear el proyecto.
6. Haz clic en el botón "Create" para crear el proyecto Maven.

</details>  

<br>

<details>  
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">¿Cuál es el propósito de "Arrays.copyOfRange()" en Java y cómo lo usamos?</summary>  

 <!-- ✅ -->  

  El método `Arrays.copyOfRange()` en Java se utiliza para crear un nuevo array que es una copia de un rango específico de un array existente. Este método es parte de la clase `java.util.Arrays` y se utiliza para copiar elementos de un array a otro, comenzando desde un índice de inicio especificado y terminando en un índice de finalización especificado.

  Aquí hay un ejemplo de cómo usar el método `Arrays.copyOfRange()` en Java:

 ```java  
 import java.util.Arrays;  
 public class Main { 
  public static void main(String[] args) { 
    int[] originalArray = {1, 2, 3, 4, 5}; 
    int[] copiedArray = Arrays.copyOfRange(originalArray, 1, 4);  

    System.out.println("Original Array: " + Arrays.toString(originalArray)); 
    System.out.println("Copied Array: " + Arrays.toString(copiedArray)); 
  } 
 }  
 ```  

  En este ejemplo, el `originalArray` es un array de enteros y el método `s` se utiliza para crear un nuevo array `copiedArray` que es una copia del array original, comenzando en el índice 1 (inclusivo) y terminando en el índice 4 (exclusivo). La salida del programa será:

  ```bash  
  # Original Array: [1, 2, 3, 4, 5] 
  # Copied Array: [2, 3, 4]  
  ```  

  El método `copyOfRange()` puede ser útil en casos en los que se desea crear un nuevo array basado en una parte de un arreglo existente, o para crear una copia de un array por motivos de seguridad. Es importante tener en cuenta que el método `copyOfRange()` solo funciona con arrays y no con otros tipos de colecciones.

</details>  

<br>

<details>  
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">¿Cuál es el proceso "Red, Green, Refactor" en el desarrollo de Java y cómo se puede utilizar?</summary>  

 <!-- ✅ -->  

  El proceso Red, Green, Refactor es una técnica utilizada en el Desarrollo Dirigido por Pruebas (TDD) para escribir software en Java. Involucra los siguientes pasos:

  El TDD se puede usar en Java siguiendo estos pasos:

  1. Red: Escribir un test para una funcionalidad específica, sin escribir el código real para implementar esa funcionalidad.
  2. Green: Escribir el código que implementa la funcionalidad y asegurarse de que pase el test.
  3. Refactor: Mejorar el código, haciéndolo más eficiente y legible, aún asegurándose de que pase el test.

  El proceso Red, Green, Refactor ayuda a los desarrolladores a escribir código más limpio y robusto centrándose en escribir los tests primero y luego escribir el código que implementa esa funcionalidad. Esto ayuda a detectar errores temprano en el proceso de desarrollo, reduciendo el tiempo y esfuerzo total requeridos para completar un proyecto.

  Aquí hay un ejemplo del proceso Red, Green, Refactor en Java utilizando JUnit:

  ```java  
  import org.junit.Assert; 
  import org.junit.Test;  

  public class CalculatorTest { 
    @Test public void testAddition() { 
      Calculator calculator = new Calculator(); 
      int result = calculator.add(3, 4); 
      Assert.assertEquals(7, result); 
    } 
  }  
  ```  

  En este ejemplo, se escribe un test para el método `add()` de la clase `Calculator` usando JUnit. El test llama al método `add()` con los parámetros `3` y `4` y utiliza el método `assertEquals()` para verificar que el resultado sea igual a `7`.

  Para hacer que el test pase, se puede escribir el código para implementar el método `add()`:

  ```java  
  public class Calculator { 
    public int add(int a, int b) { 
      return a + b; 
    } 
  }  
  ```  

  Con la implementación del método `add()`, el test debería pasar al ejecutarse nuevamente. Para mejorar el código, se puede refactorizar para hacerlo más eficiente y legible:

  ```java  
  public class Calculator { 
    public int add(int a, int b) { 
      return a + b; 
    } 
  }  
  ```  

  Este proceso se puede repetir para cada pieza de funcionalidad en el proyecto, asegurándose de que el código cumpla con los requisitos y esté libre de errores. El proceso Red, Green, Refactor es un proceso iterativo que ayuda a mejorar la calidad del código con el tiempo, haciéndolo más robusto y fácil de mantener.

</details>  

<br>

<details>  
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">¿Qué es "Math.random()" en Java y cómo se puede utilizar?</summary>  

 <!-- ✅ -->  

  `Math.random()` es un método de la clase `java.lang.Math` que devuelve un valor double pseudorandom entre 0,0 y 1,0. Este método se puede utilizar para generar números aleatorios para diversos propósitos, como para simulaciones, juegos o aplicaciones que requieren aleatoriedad.

  Aquí hay un ejemplo de cómo `Math.random()` se puede utilizar en un programa de Java:

  ```java  
  public class Main { 
    public static void main(String[] args) {
      double randomNumber = Math.random(); 
      
      System.out.println("Random number between 0.0 and 1.0: " + randomNumber); 
    } 
  }  
  ```  

  En este ejemplo, se genera y se imprime en la consola un número aleatorio entre 0,0 y 1,0. Para generar un número entero aleatorio entre dos valores, se puede escalar y redondear el número aleatorio:

  ```java  
  public class Main { 
    public static void main(String[] args) { 
      int min = 1; 
      int max = 10; 
      int randomInt = min + (int)(Math.random() * ((max - min) + 1)); 

      System.out.println("Random integer between " + min + " and " + max + ": " + randomInt); 
    } 
  }  
  ```  

  En este ejemplo, se genera y se imprime en la consola un número entero aleatorio entre 1 y 10. Tenga en cuenta que `Math.random()` es un generador de números pseudorandom y no es adecuado para propósitos criptográficos, ya que es predecible si se conoce la semilla de recuperación. Para propósitos criptográficos, en su lugar, se debe utilizar un generador de números aleatorios seguro.

</details>  

<br>

<details>  
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">¿Cómo puedo probar la salida estándar en JUnit para un programa Java?</summary>  

 <!-- ✅ -->  

 Para probar la salida estándar en JUnit de un programa Java, puedes usar la clase `ByteArrayOutputStream` y el método `System.setOut()`. La clase `ByteArrayOutputStream` te permite capturar la salida estándar en un búfer, mientras que el método `System.setOut()` redirige la salida estándar al búfer.

 Aquí hay un ejemplo de cómo puedes probar la salida estándar en JUnit:

 ```java  
 import static org.junit.Assert.assertEquals; 
 import java.io.ByteArrayOutputStream; 
 import java.io.PrintStream; 
 import org.junit.Before; 
 import org.junit.Test;  

 public class MainTest { 
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream(); 
  private final PrintStream originalOut = System.out;  

  @Before public void setUpStreams() { 
    System.setOut(new PrintStream(outContent)); 
  }  

  @Test public void testStandardOutput() { 
    Main.main(null); 
    assertEquals("Hello World!", outContent.toString());
  } 
 }  
 ```  

 En este ejemplo, se utiliza la clase `ByteArrayOutputStream` para capturar la salida estándar y el método `System.setOut()` para redirigir la salida estándar al búfer. La anotación `@Before` se utiliza para establecer la salida estándar original. El método `testStandardOutput()` invoca el método `Main.main()` y luego afirma que la salida estándar es igual a "Hello World!" ("¡Hola Mundo!").

</details>  

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">No puedo enviar cambios a mi repositorio. ¿Qué debo hacer?</summary>

  <!-- ✅ -->

  Si no puedes enviar cambios a tu repositorio, aquí hay algunos pasos que puedes seguir:

  1. Verifica tu conexión a internet: Asegúrate de que tu conexión a internet sea estable y funcione.
  2. Verifica la URL de tu repositorio: Asegúrate de estar usando la URL correcta de tu repositorio para enviar tus cambios.
  3. Revisa tus credenciales de Git: Asegúrate de que tus credenciales de Git estén actualizadas y correctas. Puedes revisar tus credenciales usando el siguiente comando:

  ```bash
  git config --list
  ```

  4. Actualiza tu repositorio local: Antes de enviar cambios, asegúrate de que tu repositorio local esté actualizado con el repositorio remoto. Puedes actualizar tu repositorio local usando el siguiente comando:

  ```bash
  git fetch origin
  ```

  5. Revisa posibles conflictos: Si hay conflictos entre tu repositorio local y el repositorio remoto, resuélvelos antes de enviar cambios.
  6. Envía cambios: Una vez que hayas resuelto los conflictos y actualizado tu repositorio local, puedes intentar enviar cambios nuevamente usando el siguiente comando:

  ```bash
  git push origin <branch_name>
  ```

</details>