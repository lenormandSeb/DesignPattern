package singleton.tp1;

import java.util.ArrayList;
import java.util.List;

import singleton.tp1.entities.Entity1;
import singleton.tp1.entities.singleTon;

/**
*
* @author tactfactory
*
* - Modifier le programme pour :
*   - 1 : permettre d'accéder n'importe où dans le projet à la liste d'Entity1
*   - 2 : faire en sorte que les ajouts, suppresions sur la liste d'Entity1 soient préservés durant l'exécution du
*       programme
*   - 3 : que les id des éléments dans la liste ne soient plus saisissables par le développeur et qu'ils deviennent
*       auto-incrémentés
*/
public class SingletonTp1 {
  public static void main(String[] args) {

	singleTon singleton = singleTon.getInstance();

    singleton.getInstance().addEntity();
    
    singleton.getInstance().addEntity();

    System.out.println(String.format("Nombre d'Entity1 %d", singleton.getInstance().getEntity1s().stream().count()));

    
    for (Entity1 item : singleTon.getInstance().getEntity1s()) {
      System.out.println(item);
    }
  }

}
