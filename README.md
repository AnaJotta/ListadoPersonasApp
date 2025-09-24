# 📋 ListadoPersonasApp

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![GitHub last commit](https://img.shields.io/github/last-commit/AnaJotta/ListadoPersonasApp)
![GitHub repo size](https://img.shields.io/github/repo-size/AnaJotta/ListadoPersonasApp)

Aplicación de consola en Java para gestionar un listado de personas: agregar, listar y buscar personas.

---

## 🔍 Funcionalidades

- Agregar una persona con su nombre (u otros atributos según tu diseño).  
- Listar todas las personas registradas.  
- Buscar una persona específica por nombre (o mediante comparación de objetos).  
- Uso de `equals` y `hashCode` en la clase Persona para que la búsqueda funcione correctamente.

---

📌 Notas importantes

- Se utiliza Scanner.nextLine() para leer entradas de usuario como texto, y luego convertirlas (Integer.parseInt, Double.parseDouble) si es necesario.
- Para que el método indexOf funcione en la búsqueda, la clase Persona debe tener bien implementados equals y hashCode.


