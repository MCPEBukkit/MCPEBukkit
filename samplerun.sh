#!/bin/sh
/*
Reads dirname, then runs the .jar file (No compile needed to you minejava people xD)
*/
 BINDIR=$(dirname "$(readlink -fn "$0")")
 cd "$BINDIR"
 java -Xmx1024M -jar MCPEBukkit.jar -o true
