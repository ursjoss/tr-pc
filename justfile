set windows-shell := ["powershell.exe", "-NoLogo", "-Command"]

@_list:
    just --list --unsorted

repodir := `pwd`

netbeans-plat-version := "22"
java-version := "17"

alias verify-ci := verify-headless

# Builds the entire project - also downloading the harness if needed
#build:
#    ant build -Dnbplatform.default.netbeans.dest.dir={{repodir}}/netbeans-plat/{{ netbeans-plat-version }}/ide

# Creates the zipped application code in dist/trgtd.zip
#build-zip:
#    ant build-zip -Dnbplatform.default.netbeans.dest.dir={{repodir}}/netbeans-plat/{{ netbeans-plat-version }}/ide

# Verifies modules with headless tests
verify-headless:
    ./gradlew check

    
# Verifies all modules - including UI tests
verify:
    ./gradlew check -Dtest.profile=allTests


# Clears the cache of the local development version of ThinkingRock
[linux]
[macos]
clear-cache-dev:
	rm -rI ./build/testuserdir/var/cache/

# Clears the cache of the local development version of ThinkingRock
[windows]
clear-cache-dev:
	rm -r -fo ./build/testuserdir/var/cache/

# Clears the cache of production versions of ThinkingRock
[linux]
clear-cache-prod:
	rm -rI ~/.cache/trgtd/

# Clears the cache of production versions of ThinkingRock
[macos]
clear-cache-prod:
	rm -rI ~/Library/Caches/trgtd/

# Clears the cache of production versions of ThinkingRock
[windows]
clear-cache-prod:
	rm -r -fo env_var('APPDATA')\..\Local\trgtd\Cache\

# Starts the ThinkingRock application from sources
run:
	./gradlew :au.com.trgtd.tr.appl:runNetBeans

