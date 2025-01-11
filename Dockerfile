#FROM openjdk:17-jdk-alpine
#EXPOSE 8080
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} tarea1.jar
#ENTRYPOINT ["java","-jar","/tarea1.jar"]

# Stage 1: Build the application
FROM maven:3.9-eclipse-temurin-17-alpine AS builder
WORKDIR /build
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Create a smaller runtime image
FROM eclipse-temurin:17-jre-alpine AS runtime
WORKDIR /app
COPY --from=builder /build/target/*.jar tarea1.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/tarea1.jar"]