set OLDDIR=%CD%
cd c:\gitrepo\utility
rmdir /S /Q metasearchmvc
mkdir metasearchmvc
cd metasearchmvc
roo script --file c:\gitrepo\utility\scripts\metasearchmvc.roo > %OLDDIR%\metasearchmvc.log
cd %OLDDIR%
