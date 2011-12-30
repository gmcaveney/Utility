set OLDDIR=%CD%
cd c:\gitrepo\utility
rmdir /S /Q patentms
mkdir patentms
cd patentms
roo script --file c:\gitrepo\utility\scripts\patentms.roo > %OLDDIR%\patentms.log
cd %OLDDIR%
