# Etap 1: Budowanie aplikacji (Maven + JDK)
FROM maven:3.9.6-eclipse-temurin-17 AS build
COPY . /app
WORKDIR /app
RUN mvn clean package -DskipTests

# Etap 2: Uruchamianie aplikacji (tylko JRE)
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]