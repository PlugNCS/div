/*
Copyright (C) 2017 Michaël NASS

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License along
with this program; if not, write to the Free Software Foundation, Inc.,
51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA. 

LICENCE : https://www.craftsearch.net/LICENSE.txt
*/
int a,b;
boolean divisible;
void main(){
	saisie();
}

void saisie(){
	a = readInt("Saisissez a");
	b = readInt("Saisissez b");
	mod();
}

void mod(){
	if(a%b==0){
		divisible = true;
		println("a vaut " + a + " et b vaut " + b + ". Ces deux nombres sont divisibles. STC RETURN divisible=" + divisible);
	}
	else{
		divisible = false;
		println("a vaut " + a + " et b vaut " + b + ". Ces deux nombres ne sont pas divisibles. STC RETURN divisible=" + divisible);
	}
	premier();
}

void premier(){
	String choice;
	int i;
	choice = readString("Vérifivation de nombres premiers. Utiliser a ou b ?");
	if(choice.equals("a")){
		for(i=2; i<=sqrt(a); i++){
			if(a%i==0){
				println("a n'est pas premier");
				break;
			}
			else{
				if(i==a-1){
					i=i++;
				}
				println("a est un premier.");
			}
		}
		
	}
	else if(choice.equals("b")){
		for(i=2; i<=sqrt(b); i++){
			if(b%i==0){
				println("b n'est pas premier");
				break;
			}
			else{
				if(i==b-1){
					i=i++;
				}
				println("b est un premier.");
			}
		}
	}
	else{
		println("a ou b, c'est quand meme pas compliqué à écire, si ?!");
		premier();
	}
}


