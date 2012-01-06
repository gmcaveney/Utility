set OLDDIR=%CD%
cd c:\gitrepo\utility
rmdir /S /Q metasearch
mkdir metasearch
cd metasearch
roo script --file c:\gitrepo\utility\scripts\metasearch.roo > %OLDDIR%\metasearch.log
cd %OLDDIR%
