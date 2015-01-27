

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class EquipeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class testEquipe
{
    /**
     * Default constructor for test class EquipeTest
     */
    public testEquipe()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testEquipe1()
    {
        Joueur joueur1 = new Joueur("MIL", "Eden", "Hazard", 10);
        Joueur joueur2 = new Joueur("ATT", "Didier", "Drogba", 11);
        Equipe equipe1 = new Equipe("Chelsea FC");
        equipe1.addJoueur(joueur1);
        equipe1.addJoueur(joueur2);
        assertEquals("Equipe [nom=Chelsea FC, listJoueurs=[Joueur [num=10, poste=MIL, prenom=Eden, nom=Hazard, datenaiss=null, nationnalite=null, equipe=Chelsea FC], Joueur [num=11, poste=ATT, prenom=Didier, nom=Drogba, datenaiss=null, nationnalite=null, equipe=Chelsea FC]], championnat=null]", equipe1.toString());
        assertEquals("Joueur [num=10, poste=MIL, prenom=Eden, nom=Hazard, datenaiss=null, nationnalite=null, equipe=Chelsea FC]", joueur1.toString());
        assertEquals("Joueur [num=11, poste=ATT, prenom=Didier, nom=Drogba, datenaiss=null, nationnalite=null, equipe=Chelsea FC]", joueur2.toString());
    }
}

