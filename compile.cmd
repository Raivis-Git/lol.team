call mvn clean package
mkdir target\dependency
cd target\dependency
jar xf ..\*.jar
mkdir project
xcopy /E /I BOOT-INF\lib project\lib
xcopy /E /I META-INF project\META-INF
xcopy /E /I BOOT-INF\classes project
docker restart springbootapp