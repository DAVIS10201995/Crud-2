# API de Usuarios con Spring Boot

## Requisitos
- Java 17+
- PostgreSQL
- Postman (para pruebas)

## Instalación y ejecución
1. Clonar el repositorio:
   ```sh
   git clone https://github.com/DAVIS10201995/Crud.git
   cd Crud
   ```

## URL
  [text](https://crud-2-production.up.railway.app/api/usuarios)


##  Endpoints de la API

| Método  | Endpoint          | Descripción                      |
|---------|------------------|----------------------------------|
| **GET**    | `/usuarios`        | Obtener todos los usuarios     |
| **POST**   | `/usuarios`        | Crear un usuario               |
| **GET**    | `/usuarios/{id}`   | Obtener un usuario por ID      |
| **PATCH**  | `/usuarios/{id}`   | Actualizar un usuario por ID   |
| **DELETE** | `/usuarios/{id}`   | Eliminar un usuario por ID     |

 
  
 ## ENDPOINTS

### **Obtener todos los usuarios**

```http
GET /api/usuarios
```

**Respuesta exitosa:**

```json
[
    {
        "id": 1,
        "nombre": "Jose Miguel Talavera Uribe",
        "correo": "josemiguel@hotmail.com",
        "edad": 20
    },
    {
        "id": 6,
        "nombre": "Ramon Hermnadez Perez",
        "correo": "ramonhernandez@gmail.com",
        "edad": 25
    },
    {
        "id": 10,
        "nombre": "Ramon Hermnadez Perez",
        "correo": "ramonhernandez@gmail.com",
        "edad": 25
    },
    {
        "id": 12,
        "nombre": "Victor Hugo Sanchez",
        "correo": "sanchezhugo@gmail.com",
        "edad": 30
    },
    {
        "id": 15,
        "nombre": "Victor S",
        "correo": "hugo@gmail.com",
        "edad": 30
    },
    {
        "id": 17,
        "nombre": "Adrian Perez",
        "correo": "Perro@bastardo.com",
        "edad": 21
    },
    {
        "id": 18,
        "nombre": "Victor Barragan",
        "correo": "VICotrro@bastardo.com",
        "edad": 12
    },
    {
        "id": 22,
        "nombre": "hijodesuputamadre",
        "correo": "gfedsrgergegrhjr",
        "edad": 500
    },
    {
        "id": 25,
        "nombre": "Vic",
        "correo": "Vic@example.com",
        "edad": 30
    },
    {
        "id": 26,
        "nombre": "el maki es gay",
        "correo": "makigay@example.com",
        "edad": 21
    },
    {
        "id": 27,
        "nombre": "nuevo nombre",
        "correo": "nuevo correo",
        "edad": 18
    }
]
```
### **Crear un usuario**

```http
POST /api/usuarios
```

**Cuerpo de la solicitud:**

```json
{
    "nombre": "Juan Perez",
    "correo": "juanperez@example.com",
    "edad": 28
}
```

**Respuesta exitosa:**

```json
{
    "id": 28,
    "nombre": "Juan Perez",
    "correo": "juanperez@example.com",
    "edad": 28
}
```

**Errores comunes:**

- **400 Bad Request:** Si faltan campos obligatorios o el formato es incorrecto.
- **409 Conflict:** Si el correo ya está registrado.


### **Actualizar un usuario**

```http
PATCH /api/usuarios/{id}
```

**Cuerpo de la solicitud:**

```json
{
    "nombre": "Juan Actualizado",
    "correo": "juanactualizado@example.com",
    "edad": 29
}
```

**Respuesta exitosa:**

```json
{
    "id": 28,
    "nombre": "Juan Actualizado",
    "correo": "juanactualizado@example.com",
    "edad": 29
}
```

**Errores comunes:**

- **400 Bad Request:** Si el cuerpo de la solicitud tiene un formato incorrecto.
- **404 Not Found:** Si no existe un usuario con el ID proporcionado.

---

### **Eliminar un usuario**

```http
DELETE /api/usuarios/{id}
```

**Respuesta exitosa:**

```json
{
    "mensaje": "Usuario eliminado exitosamente"
}
```

**Errores comunes:**

- **404 Not Found:** Si no existe un usuario con el ID proporcionado.
- **500 Internal Server Error:** Si ocurre un error inesperado en el servidor.

## Pruebas con Postman

Para facilitar las pruebas, hemos creado una colección de Postman con todos los endpoints de la API.






   
