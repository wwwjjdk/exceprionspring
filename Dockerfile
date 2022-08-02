##
#задает базовый образ
##
FROM openjdk:18-jdk-alpine
##
#expose указывает на необходимость открыть порт
##
LABEL main = "wwwjjdk"
EXPOSE 8080
##
#add копирует в контейнер файлы и папки
##
ADD target/demoSrping260722-0.0.1-SNAPSHOT.jar myapp.jar
##
#предоставляет команду с аргументами для вызова во время выполнения контейнера
##
ENTRYPOINT ["java","-jar","/myapp.jar"]