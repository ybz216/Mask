@echo on
@echo =============================================================
@echo $                                                           $
@echo $                        Nepxion Mask                       $
@echo $                                                           $
@echo $                                                           $
@echo $                                                           $
@echo $  Nepxion Studio All Right Reserved                        $
@echo $  Copyright (C) 2017-2050                                  $
@echo $                                                           $
@echo =============================================================
@echo.
@echo off

@title Nepxion Mask
@color 0a

call mvn clean deploy -DskipTests -e -P release

pause