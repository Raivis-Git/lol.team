call mvn clean package -DskipTests
mkdir target\dependency
cd target\dependency
jar xf ..\*.jar
mkdir project
xcopy /E /I BOOT-INF\lib project\libc
xcopy /E /I META-INF project\META-INF
xcopy /E /I BOOT-INF\classes project
docker restart backend