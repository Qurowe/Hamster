import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;import de.hamster.debugger.model.Hamster;public class NeuerHamster3 implements de.hamster.model.HamsterProgram {class Wuerfel
{
   public int wuerfeln ()
   {     
      return ( int ) ( Math . random () * 6 ) + 1;
   }
}
class Player
{
	private Hamster h;
	private boolean istRaus=false;
	public Player (Hamster h){
	this.h=h;
	}
	public Hamster getHamster(){return this.h;}
	public boolean getistRaus(){return this.istRaus;}
	public void setistRaus(boolean istRaus) {this.istRaus=istRaus;}
	
	public void geheRaus(){
	this.h.vor();
	this.h.vor();
	this.h.linksUm();
	}
}	
public void main ()
{
Hamster blau= Hamster.getStandardHamster ();
Hamster rot = new Hamster(6,7,Hamster.SUED,0);
Hamster gruen = new Hamster(4,17,Hamster.WEST,0);
Hamster gelb = new Hamster(14,19,Hamster.NORD,0);
Player player[]={new Player(blau),new Player(rot),new Player(gruen),new Player(gelb)};
int playersTurn = 0;
Wuerfel w = new Wuerfel ();
while (true){
Player p=player[playersTurn];
Hamster h=p.getHamster();
if (p.getistRaus()){
int result = w.wuerfeln();
h.schreib("Ich habe drau�en gew�rfelt: " + result);
wegZumLoch();
while (result == 6) {
result = w.wuerfeln();
h.schreib("Ich habe drau�en gew�rfelt: " + result);
//add move and check logic

}
playersTurn=(playersTurn+1)%4;
continue;
}
boolean kannRaus = wuerfelHaus(p.getHamster(),w);
if (kannRaus){ 
p.setistRaus(true);
p.geheRaus();
continue;

}
playersTurn=(playersTurn+1)%4;
}
}

boolean wuerfelHaus(Hamster h,Wuerfel w) {
	int versuch = 0;
	while (versuch < 3) {
	int result = w.wuerfeln();
	h.schreib("Ich habe gew�rfelt: " + result);
	if (result == 6) {
		h.schreib("Ich kann raus");
		return true;
		}
	versuch++;
	}
	return false;
}

class KlasseFigur1 extends Player
{
  
  int schritte = 0; 
 
  void wegZumLoch (int wuerfeln)
  {
      
  
    while (wuerfeln > 0) 
    { 
      switch (schritte){
        case 1 : stepVor (); break;
        case 2 : stepVor (); break;
        case 3 : stepVor (); break;
        case 4 : stepVorLinksUm (); break;
        case 5 : stepVor (); break;
        case 6 : stepVor (); break;
        case 7 : stepVor (); break;
        case 8 : stepVorRechtsUm (); break;
        case 9 : stepVor (); break;
        case 10 : stepVor (); break;
        case 11 : stepVor (); break;
        case 12 : stepVorRechtsUm (); break;
        case 13 : stepVor (); break;
        case 14 : stepVor (); break;
        case 15 : stepVor (); break;
        case 16 : stepVorLinksUm (); break;
        case 17 : stepVor (); break;
        case 18 : stepVor (); break;
        case 19 : stepVor (); break;
        case 20 : stepVorRechtsUm (); break;
        case 21 : stepVor (); break;
        case 22 : stepVor (); break;
        case 23 : stepVor (); break;
        case 24 : stepVorRechtsUm (); break;
        case 25 : stepVor (); break;
        case 26 : stepVor (); break;
        case 27 : stepVor (); break;
        case 28 : stepVorLinksUm (); break;
        case 29 : stepVor (); break;
        case 30 : stepVor (); break;
        case 31 : stepVor (); break;
        case 32 : stepVorRechtsUm (); break;
        case 33 : stepVor (); break;
        case 34 : stepVor (); break;
        case 35 : stepVor (); break;
        case 36 : stepVorRechtsUm (); break;
        case 37 : stepVor (); break;
        case 38 : stepVor (); break;
        case 39 : stepVor (); break;
        case 40 : stepVorLinksUm (); break;
        case 41 : stepVor (); break;
        case 42 : stepVor (); break;
        case 43 : stepVor (); break;
        case 44 : stepVorRechtsUm (); break;
        case 45 : stepVor (); break;
        case 46 : stepVorRechtsUm (); break;
        // Steps bis zum loch 
        case 47 : vorInsLoch (); break;
        case 48 : vorInsLoch (); break;
        case 49 : vorInsLoch (); break;
        case 50 : vorInsLoch (); break; 
        default: break; 
        }
        // steps ins loch 
      wuerfeln--;
      schritte++;  
      
    }
 //   if ( schritte==3 ||schritte==15||schritte==27 ||schritte==39)
 //   {
 //     // sonderfeld Aktion 
 //   } 
 //  sonderfeld muss schritte +1 hoch z�hlen global damit runboyrun stimmt 
 } 
      
      
  void wegZumHaus (int schritte)
  {     
          
      while (schritte > 46) 
    { 
      switch (schritte){
      
        case 1 : stepVor (); break;
        case 2 : stepVor (); break;
        case 3 : stepVor (); break;
        case 4 : stepVorLinksUm (); break;
        case 5 : stepVor (); break;
        case 6 : stepVor (); break;
        case 7 : stepVor (); break;
        case 8 : stepVorRechtsUm (); break;
        case 9 : stepVor (); break;
        case 10 : stepVor (); break;
        case 11 : stepVor (); break;
        case 12 : stepVorRechtsUm (); break;
        case 13 : stepVor (); break;
        case 14 : stepVor (); break;
        case 15 : stepVor (); break;
        case 16 : stepVorLinksUm (); break;
        case 17 : stepVor (); break;
        case 18 : stepVor (); break;
        case 19 : stepVor (); break;
        case 20 : stepVorRechtsUm (); break;
        case 21 : stepVor (); break;
        case 22 : stepVor (); break;
        case 23 : stepVor (); break;
        case 24 : stepVorRechtsUm (); break;
        case 25 : stepVor (); break;
        case 26 : stepVor (); break;
        case 27 : stepVor (); break;
        case 28 : stepVorLinksUm (); break;
        case 29 : stepVor (); break;
        case 30 : stepVor (); break;
        case 31 : stepVor (); break;
        case 32 : stepVorRechtsUm (); break;
        case 33 : stepVor (); break;
        case 34 : stepVor (); break;
        case 35 : stepVor (); break;
        case 36 : stepVorRechtsUm (); break;
        case 37 : stepVor (); break;
        case 38 : stepVor (); break;
        case 39 : stepVor (); break;
        case 40 : stepVorLinksUm (); break;
        case 41 : stepVor (); break;
        case 42 : stepVor (); break;
        case 43 : stepVor (); break;
        case 44 : stepVorRechtsUm (); break;
        case 45 : stepVor (); break;
        case 46 : stepVor (); break;
         
        default: break; 
        } 
          
      schritte --;
      }
      
    // ab hier interaktion um wieder in das Haus zu gehen nur f�r Figur 1
    vor ();
    vor ();
    vor ();
    vor ();
    kehrt ();
      
  }   
      
      
         
      
      
  void stepVor ()
  { 
    vor ();    
  }

  void stepVorLinksUm ()
  {
    vor ();
    linksUm ();
  }
  
  void stepVorRechtsUm ()
  {
    vor ();
    rechtsUm ();
  }
  
  void vorInsLoch ()
  {
    if (vornFrei ())
    {
      vor ();
      if (kornDa())
      {
        nimm ();
      }
      else 
      {
        kehrt ();
        vor ();
        kehrt ();
      }  
    }
  }
  
  // Verbesserung w�re noch schritte auf null zu setzen wenn der Hamster nicht mehr nach vorne gehen kann bei     
}  }