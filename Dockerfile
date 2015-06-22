FROM java:8
ADD league-play-0.1.0.jar /opt/league-play/
EXPOSE 8080
WORKDIR /opt/league-play/
CMD ["java", "-jar", "league-play-0.1.0.jar"]