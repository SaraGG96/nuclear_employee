## Sara García Garrido

Trabajo sobre la organización del personal de la central nuclear de Springfield.

### Requerimientos

- Gradle
- Java 21

### Descargar y utilizar el proyecto

```
git clone https://github.com/SaraGG96/examen.git
```

### Problemas a resolver:

1. ```EmployeeManagementService employeeService = new EmployeeManagementServiceImpl();```  Impl es la clase, la otra es la interfaz. EmployeeManagementServiceImpl implements EmployeeManagementService.
#### App.java ya es  100% funcional a partir de aquí.
2. Validar ID a no null: this.id = ```Objects.requireNonNull(id, "No puede ser null");```. (sólo para objetos, cambio obligatorio int -> Integer)
3. toString de Employee inicializado, pero no usado en listCrew(). Solución: dentro del for, employee.toString(); y ya está.
4. Enums que deben printarse en español. A los Enum les falta un atributo final String "nombreEspañol" o lo que sea, que sirva para crear el constructor. Entonces, se les agrega el value en (""): **NIGHT("NOCHE");**
5. "En createEmployee no invocas al constructor de Employee, sino que creas el objeto y vuelves a sobreescibir sus propiedades de instancia con los setters". Solución: eliminar todos los setters, redundante. **Employee employee = new Employee(name, id, department, experienceLevel, shift);** ya hace todo el trabajo al pasarle los parámetros arriba.
6. En createEmployee faltaba un print **System.out.println("Empleado " + employee.getName() + " asignado al departamento: " + employee.getDepartment().getNombreEspanol());**
7. implementation libs.guava - eliminar de build
8. Crear el jar (simple) con *"gradle jar"*
9. Ejecutar el jar con **java -jar .\app\build\libs\app.jar**