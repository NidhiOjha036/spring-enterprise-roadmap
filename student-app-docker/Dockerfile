#FROM openjdk:26-ea-oraclelinux9
#ADD target/student-app.jar student-app.jar
#ENTRYPOINT ["java","-jar","/student-app.jar"]

FROM openjdk:26-ea-oraclelinux9

# Install netcat
RUN microdnf install -y nc && microdnf clean all

# Copy JAR
COPY target/student-app.jar /student-app.jar

# Copy wait script
COPY wait-for-mysql.sh /wait-for-mysql.sh
RUN chmod +x /wait-for-mysql.sh

# Start script
ENTRYPOINT ["/wait-for-mysql.sh"]

