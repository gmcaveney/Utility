set OLDDIR=%CD%
cd c:\gitrepo\utility
rmdir /S /Q msmulti
mkdir msmulti
cd msmulti
roo script --file c:\gitrepo\utility\scripts\msmulti.roo > %OLDDIR%\msmulti.log
cd %OLDDIR%
