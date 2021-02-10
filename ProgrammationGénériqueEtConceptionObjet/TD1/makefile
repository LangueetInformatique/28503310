MonPremierProgramme: MonPremierProgramme.o
	g++ MonPremierProgramme.o -o MonPremierProgramme.exe
	
MonPremierProgramme.o: MonPremierProgramme.cpp 
		g++ -c MonPremierProgramme.cpp
		
Paire: Paire.o Parite.o
		g++ Paire.o Parite.o -o Paire.exe
	
Paire.o: Paire.h Parite.h Paire.cpp
		g++ -c Paire.cpp
	
Parite.o: Parite.h Parite.cpp
	g++ -c Parite.cpp
