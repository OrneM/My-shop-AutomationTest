# Selenium Automation - Practice Tests (AutomationPractice)

Este repositorio contiene prácticas de **automatización con Selenium WebDriver en Java** usando **JUnit 5**, ejecutadas sobre el sitio de práctica:
http://www.automationpractice.pl/index.php

Incluye dos tests:
- **Prueba1**: búsqueda de un producto.
- **Prueba2**: registro de un usuario completando un formulario (con waits y email aleatorio usando Faker).

---

## 🧰 Tecnologías utilizadas
- Java
- Selenium WebDriver
- JUnit 5
- ChromeDriver
- JavaFaker (para generar datos fake, en este caso email)
- WebDriverWait + ExpectedConditions (esperas explícitas)

---

## ✅ Tests incluidos

### 1) Prueba1 - `searchProduct()`
**Objetivo:** automatizar una búsqueda de producto en el buscador del sitio.

**Flujo automatizado:**
1. Abre Chrome (`ChromeDriver`)
2. Maximiza la ventana y borra cookies
3. Navega a la URL del sitio
4. Escribe `"dress"` en el campo de búsqueda (`id="search_query_top"`)
5. Simula presionar **Enter** (`Keys.ENTER`)
6. Cierra el navegador

📌 Archivo/clase: `Prueba1.java`

---

### 2) Prueba2 - `registerUser()`
**Objetivo:** automatizar el flujo de registro de un usuario completando el formulario.

**Flujo automatizado:**
1. Abre Chrome (`ChromeDriver`)
2. Navega al sitio
3. Maximiza ventana
4. Hace click en **Sign in**
5. Ingresa un email inicial en "Create an account"
6. Hace click en **Create an account**
7. Usa **esperas explícitas** para asegurar que cargue el formulario:
   - espera que el formulario sea visible (`account-creation_form`)
   - espera que el selector de título (`id_gender2`) sea clickeable
8. Completa nombre y apellido
9. Limpia el email del formulario y lo reemplaza por uno **aleatorio** generado con **Faker**
10. Ingresa password
11. Selecciona fecha de nacimiento (día, mes, año) usando `Select`
12. Marca la opción de newsletter (`newsletter`)
13. Hace click en **Register**
14. Cierra el navegador

📌 Archivo/clase: `Prueba2.java`

---

## ▶️ Cómo ejecutar los tests
Podés ejecutar los tests desde IntelliJ IDEA:

1. Abrí el proyecto
2. Andá a la clase `Prueba1` o `Prueba2`
3. Click derecho sobre el método o la clase
4. **Run**

---

## 📝 Notas
- El registro usa un email aleatorio para evitar conflictos por emails repetidos en el sitio.
- Se utilizan **esperas explícitas** para evitar errores por elementos que todavía no cargaron.

---

## 👩‍💻 Autor
Ornela Mansilla
