FROM mcr.microsoft.com/openjdk/jdk:21-ubuntu

WORKDIR /toastmastersclubapp

COPY build/libs/ToastmastersClub-0.0.1-SNAPSHOT.jar toastmastersclub.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "toastmastersclub.jar"]