/*
 * date.h
 *
 *  Created on: 2 févr. 2021
 *      Author: laari
 */

#ifndef DATE_H_
#define DATE_H_

#include <iostream>
using namespace std;

class date {
private:
	int jour;
	int mois;
	int annee;
	
public:
	date();
	date(int a, int b, int c); 
	virtual ~date();
	bool compareTo(date d);
	void incrementer();
	void afficher() ;
};

#endif /* DATE_H_ */
