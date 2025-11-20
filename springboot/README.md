```bash
# 1) Install open jdk
choco search temurin
choco install Temurin -y
# 2) Install IntelliJ IDEA (Community is free) using Toolbox App
# 3) Create Spring Boot project: https://start.spring.io/?utm_source=chatgpt.com
# Important add Group/Artifact Dependencies: Spring Web for hello test in 
http://localhost:8080/hello
# 4) Mínimal structure 
# src/main/java/com/seuprojeto/DemoApplication.java
# src/main/java/com/seuprojeto/HelloController.java
# Check errors MVN right panel -> Reload all mvn projects
# 5) Run app
mvnw spring-boot:run
```
