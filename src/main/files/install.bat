@ECHO OFF
java -d64 -version  >nul 2>&1
REM set java64bit=%ERRORLEVEL%
if %ERRORLEVEL%==0 (
  .\prunsrv64.exe //IS//MDHIKVISIONSENIORX --Install="%CD%\prunsrv64.exe" --DisplayName="Middleware Hikvision SeniorX" --Jvm=auto --StartPath="%CD%" --Classpath=mdHikvisionSeniorX.jar --StartMode=jvm --StartClass=br.com.telematica.conex.ServiceManager --StartMethod=execute --StartParams=start --StopMode=jvm --StopClass=br.com.telematica.conex.ServiceManager --StopMethod=execute --StopParams=stop --LogPath="%CD%\log" --StdOutput=auto --StdError=auto --Startup=auto --JvmOptions=-Xms512M ++JvmOptions=-Xmx512M
) else (
  .\prunsrv32.exe //IS//MDHIKVISIONSENIORX --Install="%CD%\prunsrv32.exe" --DisplayName="Middleware Hikvision SeniorX" --Jvm=auto --StartPath="%CD%" --Classpath=mdHikvisionSeniorX.jar --StartMode=jvm --StartClass=br.com.telematica.conex.ServiceManager --StartMethod=execute --StartParams=start --StopMode=jvm --StopClass=br.com.telematica.conex.ServiceManager --StopMethod=execute --StopParams=stop --LogPath="%CD%\log" --StdOutput=auto --StdError=auto --Startup=auto --JvmOptions=-Xms512M ++JvmOptions=-Xmx512M
)