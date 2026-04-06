# Step 1: Use Maven to build the app
FROM maven:3.8.5-openjdk-17 AS build
COPY . /app
WORKDIR /app
RUN mvn clean package

# Step 2: Use a lightweight JRE to run the app
FROM openjdk:17-jdk-slim
COPY --from=build /app/target/payroll-app-1.0-SNAPSHOT.jar /app/payroll-app.jar
WORKDIR /app
CMD ["java", "-jar", "payroll-app.jar"]