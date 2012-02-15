set OLDDIR=%CD%
set NEWDIR=mssingle
cd c:\gitrepo\utility
rmdir /S /Q %NEWDIR%
mkdir %NEWDIR%
cd %NEWDIR%
roo script --file c:\gitrepo\utility\scripts\%NEWDIR%.roo > %OLDDIR%\%NEWDIR%.log
cd %NEWDIR%
