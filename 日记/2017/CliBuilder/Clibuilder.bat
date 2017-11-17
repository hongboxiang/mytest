echo off

echo 设置CliBuilder工作空间

rem 设置CliBuilder的工作目录
set file=%cd%\4x\CliBuilder.cfg
set workspace=%cd%\workspace\
del %file%
echo [History]>>%file%
echo 1=%workspace%>>%file%
echo [Config]>>%file%
echo SysPath=%workspace%>>%file%
echo CspSysPath=>>%file%
echo SelMethod=0 >>%file%
echo Start=0 >>%file%
echo End=0 >>%file%

echo 启动CliBuilder
call .\4x\CliBuilder.exe

echo next step will copy file to svn

pause

echo 生成4x配置文件

echo export config file for 4x
set exePath4x=.\4x\IniToXml.exe
set workPath4x=.\4x\ 
set output4x=..\mml

rem echo %output4x%

call %exePath4x% %workPath4x% %workspace% %output4x%

echo end export config file for 4x

pause