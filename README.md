# API de Usuarios con Spring Boot

## Requisitos
- Java 24
- PostgreSQL
- Postman (para pruebas)

## Instalación y ejecución
1. Clonar el repositorio:
   ```sh
   git clone https://github.com/DAVIS10201995/Crud.git
   cd Crud
   ```

## URL
   http://localhost:8080/api



##  Endpoints de la API

| Método  | Endpoint          | Descripción                      |
|---------|------------------|----------------------------------|
| **GET**    | `/usuarios`        | Obtener todos los usuarios     |
| **POST**   | `/usuarios`        | Crear un usuario               |
| **GET**    | `/usuarios/{id}`   | Obtener un usuario por ID      |
| **PATCH**  | `/usuarios/{id}`   | Actualizar un usuario por ID   |
| **DELETE** | `/usuarios/{id}`   | Eliminar un usuario por ID     |

 
  
 ## Ejemplo 
GET http://localhost:8080/api/usuarios

  respuesta
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

## Pruebas con Postman

Para facilitar las pruebas, hemos creado una colección de Postman con todos los endpoints de la API.

### **Cómo importar la colección**
1. Abre **Postman**.
2. Haz clic en **"Importar"** en la parte superior izquierda.
3. Selecciona **"Subir archivos"** y elige el archivo `postman/localCRUD.postman_collection.json` de este repositorio.
4. La colección se agregará automáticamente con todos los endpoints configurados.
5. Configura la URL base en Postman: `http://localhost:8080/api/usuarios`.

📌 **Nota:** Asegúrate de que la API está corriendo antes de hacer pruebas.

   
