# Usar la imagen base de OpenJDK
FROM openjdk:21

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el contenido del proyecto al directorio de trabajo en el contenedor
COPY . .

# Cambiar al directorio donde se encuentran los archivos .java
WORKDIR /app/src/main/java

# Compilar todos los archivos .java dentro del paquete org.example
RUN javac org/example/*.java

# Cambiar al directorio raíz del proyecto para ejecutar la aplicación
WORKDIR /app/src/main/java

# Comando para ejecutar la clase principal
#CMD ["java", "org.example.TowerDefenseGame"]NO encuentra el main
#CMD ["java", "-cp", "/app/src/main/java", "org.example.TowerDefenseGame"]
CMD ["sh", "-c", "java -cp /app/src/main/java org.example.TowerDefenseGame && tail -f /dev/null"]
