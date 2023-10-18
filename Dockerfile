FROM openjdk:17-jdk

ADD school-manager-server/target/school-manager.jar school-manager.jar

ENTRYPOINT ["java", "-jar", "school-manager.jar"]
