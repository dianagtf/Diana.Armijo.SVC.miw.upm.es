@echo off
echo -----------------------------------------
echo . (C) MIW -UPM
echo -----------------------------------------
echo .
set workspace=C:\Users\Diana\workspaceIWVG\Diana.Armijo
echo .
cd %workspace%
echo ============ mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent verify --settings settings.xml ... ==================
echo . Se prepara cobertura
call mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent verify --settings settings.xml

echo ============ mvn sonar:sonar ... =======================================================
echo . Se analiza y sube a sonar cloud
call mvn sonar:sonar -Dsonar.organization=dianagtf-github -Dsonar.host.url=https://sonarcloud.io -Dsonar.login=ad43b7a35bd07e7ecae85111827e89420c9a842c --settings settings.xml
pause
