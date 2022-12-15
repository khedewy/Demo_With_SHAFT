@echo off
set JAVA_HOME=C:\Users\CompuMisr\.p2\pool\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_17.0.2.v20220201-1208\jre
set path=C:\Users\CompuMisr\.m2\repository\allure\allure-2.20.1\bin;%JAVA_HOME%\bin;%path%
allure serve allure-results
pause
exit