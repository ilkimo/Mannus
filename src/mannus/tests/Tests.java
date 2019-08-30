/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mannus.tests;

import mannus.core.Children;
import mannus.core.Kid;

/**
 *
 * @author Kimo
 */
public class Tests {
    public static Children generateChildrenWithoutAge() {
        Children collection = new Children();
        
        try {
            collection.add(new Kid("Alberto", "Rossi"));
            collection.add(new Kid("Alessio", "Giaimo"));
            collection.add(new Kid("Andrea", "Loprete"));
            collection.add(new Kid("Alessandro", "Loprete"));
            collection.add(new Kid("Lorenzo", "d'ALbertas"));
            collection.add(new Kid("Luigi", "Mondo"));
            collection.add(new Kid("Michele", "Ridolfo Nicastro"));
            collection.add(new Kid("Kim Marco", "Viberti"));
            collection.add(new Kid("Gabriele", "Foch"));
            collection.add(new Kid("Claudio", "Berruto"));
            collection.add(new Kid("Francesco", "Vecchia"));
            collection.add(new Kid("Eros", "Vottero"));
            collection.add(new Kid("Tommaso", "Renzi"));
            collection.add(new Kid("Gabriele", "Conti"));
            collection.add(new Kid("Alessandro", "Foresta"));
            collection.add(new Kid("Giacomo", "Davi'"));
            collection.add(new Kid("Alessia", "Bertello"));
            collection.add(new Kid("Alessandra", "Allemanno"));
            collection.add(new Kid("Giuseppina", "Pina"));
            collection.add(new Kid("Marta", "Ramat"));
            collection.add(new Kid("Jessica", "Verdi"));
            collection.add(new Kid("Francesca", "Onesto"));
            collection.add(new Kid("Melissa", "Tani"));
            collection.add(new Kid("Valentina", "Giovinazzo"));
            collection.add(new Kid("Melissa", "Giovinazzo"));
            collection.add(new Kid("Mirko", "Martino"));
            collection.add(new Kid("Francesca", "Sigaudo"));
            collection.add(new Kid("Lilith", "Filafero"));
            collection.add(new Kid("Federica", "Montanari"));
            collection.add(new Kid("Federio", "Benetto"));
            collection.add(new Kid("Massimo", "Martini"));
            collection.add(new Kid("Galileo", "Galilei"));
            collection.add(new Kid("Steven", "Hawkings"));
            collection.add(new Kid("Pitt", "Brad"));
            collection.add(new Kid("Marco", "Monteleone"));
            collection.add(new Kid("Stefano", "Marcon"));
            collection.add(new Kid("Stefano", "Muzio"));
            collection.add(new Kid("Mattia", "Siviero"));
        } catch(Exception e) {System.out.println(e.getMessage());}
        
        return collection;
    }
    
    public static Children generateChildrenWithAge() {
        Children collection = new Children();
        
        try {
            collection.add(new Kid("Alberto", "Rossi", 8));
            collection.add(new Kid("Alessio", "Giaimo", 8));
            collection.add(new Kid("Andrea", "Loprete", 8));
            collection.add(new Kid("Alessandro", "Loprete", 8));
            collection.add(new Kid("Lorenzo", "d'ALbertas", 8));
            collection.add(new Kid("Luigi", "Mondo", 8));
            collection.add(new Kid("Michele", "Ridolfo Nicastro", 8));
            collection.add(new Kid("Kim Marco", "Viberti", 8));
            collection.add(new Kid("Gabriele", "Foch", 8));
            collection.add(new Kid("Claudio", "Berruto", 8));
            collection.add(new Kid("Francesco", "Vecchia", 8));
            collection.add(new Kid("Eros", "Vottero", 8));
            collection.add(new Kid("Tommaso", "Renzi", 8));
            collection.add(new Kid("Gabriele", "Conti", 8));
            collection.add(new Kid("Alessandro", "Foresta", 8));
            collection.add(new Kid("Giacomo", "Davi'", 8));
            collection.add(new Kid("Alessia", "Bertello", 8));
            collection.add(new Kid("Alessandra", "Allemanno", 8));
            collection.add(new Kid("Giuseppina", "Pina", 8));
            collection.add(new Kid("Marta", "Ramat", 8));
            collection.add(new Kid("Jessica", "Verdi", 8));
            collection.add(new Kid("Francesca", "Onesto", 8));
            collection.add(new Kid("Melissa", "Tani", 8));
            collection.add(new Kid("Valentina", "Giovinazzo", 8));
            collection.add(new Kid("Melissa", "Giovinazzo", 8));
            collection.add(new Kid("Mirko", "Martino", 8));
            collection.add(new Kid("Francesca", "Sigaudo", 8));
            collection.add(new Kid("Lilith", "Filafero", 8));
            collection.add(new Kid("Federica", "Montanari", 8));
            collection.add(new Kid("Federio", "Benetto", 8));
            collection.add(new Kid("Massimo", "Martini", 8));
            collection.add(new Kid("Galileo", "Galilei", 8));
            collection.add(new Kid("Steven", "Hawkings", 8));
            collection.add(new Kid("Pitt", "Brad", 8));
            collection.add(new Kid("Marco", "Monteleone", 8));
            collection.add(new Kid("Stefano", "Marcon", 8));
            collection.add(new Kid("Stefano", "Muzio", 8));
            collection.add(new Kid("Mattia", "Siviero", 8));
        } catch(Exception e) {System.out.println(e.getMessage());}
        
        return collection;
    }
    
    
}
