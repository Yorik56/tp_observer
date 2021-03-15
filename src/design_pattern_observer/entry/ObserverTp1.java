package design_pattern_observer.entry;

import design_pattern_observer.entities.ConcreteObserverBinary;
import design_pattern_observer.entities.ConcreteObserverHex;
import design_pattern_observer.entities.ConcreteObserverOctal;
import design_pattern_observer.entities.ConcreteSubject;
import design_pattern_observer.entities.Observer;

/**
*
* @author tactfactory
*
* - Le programme doit utiliser un design pattern "Observer" afin d'avoir les éléments suivant :
*   - 1 : Un Subject sera observé par 3 observer
*   - 2 : Le Subject possédera un state de type int
*   - 3 : Lors de la modification du state du Subject les observers attachés seront appelé avec :
*       - 1 : Un observer affichera l'entier en hexadécimal
*       - 2 : Un observer affichera l'entier en octal
*       - 3 : Un observer affichera l'entier en binaire
*   - 3 : Le lancement de l'application doit afficher les éléments suivant :
*
*       First state change: 15
*       Hex String: F
*       Octal String: 17
*       Binary String: 1111
*       Second state change: 10
*       Hex String: A
*       Octal String: 12
*       Binary String: 1010
*/
public class ObserverTp1 {
  public static void main(String[] args) {
  	ConcreteSubject s1 = new ConcreteSubject(0,"s1");
  	ConcreteSubject s2 = new ConcreteSubject(1,"s2");
  	ConcreteSubject s3 = new ConcreteSubject(0,"s3");
  	ConcreteSubject s4 = new ConcreteSubject(1,"s4");

  	Observer o1 = new ConcreteObserverHex("o1");
  	Observer o2 = new ConcreteObserverOctal("o2");
  	Observer o3 = new ConcreteObserverBinary("o3");

  	s1.attach(o1);
  	s1.attach(o2);
  	s1.attach(o3);

  	s1.setState(5298490);

  }
}
