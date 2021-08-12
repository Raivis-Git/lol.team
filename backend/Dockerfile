#FROM openjdk:13-alpine
#RUN addgroup -S spring && adduser -S spring -G spring
#USER spring:spring
#RUN maven install
#ARG DEPENDENCY=/target/dependency
#COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
#COPY ${DEPENDENCY}/META-INF /app/META-INF
#COPY ${DEPENDENCY}/BOOT-INF/classes /app
#ENTRYPOINT ["java","-cp","app:app/lib/*","lol/team/Application"]
#ENTRYPOINT ["java","-cp","app:app/lib/*","app.jar"]
#ENTRYPOINT ["java", "-jar", "app.jar"]

FROM openjdk:8-alpine
#ARG JAR_FILE=target
#COPY ${JAR_FILE} /lol.team-0.0.1.jar
ADD /target/lol.team-0.0.1.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

# select parent image
#FROM maven:3.6.3-jdk-8
#FROM openjdk:8-jre-alpine
# copy the source tree and the pom.xml to our new container
#COPY ./ ./

# package our application code
#RUN mvn clean package

# set the startup command to execute the jar
#CMD ["java", "-jar", "target/demo-0.0.1-SNAPSHOT.jar"]


#FROM openjdk:8-jdk-alpine
# ----
# Install Maven
#RUN apk add --no-cache curl tar bash
#ARG MAVEN_VERSION=3.3.9
#ARG USER_HOME_DIR="/root"
#RUN mkdir -p /usr/share/maven && \
#curl -fsSL http://apache.osuosl.org/maven/maven-3/$MAVEN_VERSION/binaries/apache-maven-$MAVEN_VERSION-bin.tar.gz | tar -xzC /usr/share/maven --strip-components=1 && \
#ln -s /usr/share/maven/bin/mvn /usr/bin/mvn
#ENV MAVEN_HOME /usr/share/maven
#ENV MAVEN_CONFIG "$USER_HOME_DIR/.m2"
# speed up Maven JVM a bit
#ENV MAVEN_OPTS="-XX:+TieredCompilation -XX:TieredStopAtLevel=1"
#ENTRYPOINT ["/usr/bin/mvn"]
# ----
# Install project dependencies and keep sources
# make source folder
#RUN mkdir -p /usr/src/app
#WORKDIR /usr/src/app
# install maven dependency packages (keep in image)
#COPY pom.xml /usr/src/app
#RUN mvn -e -T 1C install && rm -rf target
# copy other source files (keep in image)
#COPY src /usr/src/app/src