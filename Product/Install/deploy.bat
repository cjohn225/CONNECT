set ANT_HOME=%IDE_HOME%\java2\ant
set ANT_OPTS=-Xmx872m -XX:MaxPermSize=512m "-Dcom.sun.aas.instanceName=server"
set JAVA_HOME=C:\Java\jdk1.6.0_13
set PATH=%SystemRoot%\system32;%SystemRoot%;%SystemRoot%\System32\Wbem;%JAVA_HOME%\bin;%ANT_HOME%\bin

ant -buildfile deploy.xml %*

exit /B %ERRORLEVEL%