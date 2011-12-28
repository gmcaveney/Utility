set OLDDIR=%CD%
cd c:\code
rmdir /S /Q patentms
mkdir patentms
cd patentms
roo script --file c:\code\scripts\patentms.roo > %OLDDIR%\patentms.log
cd %OLDDIR%
