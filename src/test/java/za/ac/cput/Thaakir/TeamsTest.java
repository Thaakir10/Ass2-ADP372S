package za.ac.cput.Thaakir;

/* Student: Thaakir Ajouhaar
 * Student Number: 217244394
 * Assignment 2
 * ADP372S
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.util.*;
import java.util.Collection;
import java.util.HashSet;

class TeamsTest
    {
        private static final Collection<Teams> englishTeams = new HashSet();
        private static final List<Teams> spanishTeams = new ArrayList();
        private static final Set<Teams> brazilianTeams = new HashSet();
        private static final Map<String, Teams> frenchTeams = new HashMap();
        private static final Teams englishTeam1 = (new Teams.TeamsBuilder()).setTeamName("Manchester United").setId("team 1").build();
        private static final Teams englishTeam2 = (new Teams.TeamsBuilder()).setTeamName("Liverpool United").setId("team 2").build();
        private static final Teams spanishTeam1 = (new Teams.TeamsBuilder()).setTeamName("FC Barcelona").setId("team 1").build();
        private static final Teams spanishTeam2 = (new Teams.TeamsBuilder()).setTeamName("Real Madrid FC").setId("team 2").build();
        private static final Teams brazilianTeam1 = (new Teams.TeamsBuilder()).setTeamName("Brazil National Football Team").setId("team 1").build();
        private static final Teams brazilianTeam2 = (new Teams.TeamsBuilder()).setTeamName("Santos FC").setId("team 2").build();
        private static final Teams frenchTeam1 = (new Teams.TeamsBuilder()).setTeamName("Paris Saint‑GermainFrance").setId("team 1").build();
        private static final Teams frenchTeam2 = (new Teams.TeamsBuilder()).setTeamName("AS Monaco").setId("team 2").build();

        // adding to a collection
        @Test
        public void collectionAdd()
        {
            englishTeams.add(englishTeam1);
            englishTeams.add(englishTeam2);
            assertNotNull(englishTeams);
            assertEquals(2, englishTeams.size());
            System.out.println("Teams added were: \n" + englishTeam1 + "\n" + englishTeam2);
        }

        // finding in a collection
        @Test
        public void collectionFind()
        {
            String a = "";
            Iterator v = englishTeams.iterator();

            while(v.hasNext()) {
                Teams teams = (Teams)v.next();
                if (teams.equals(englishTeam2)) {
                    assertEquals(teams, englishTeam2);
                    a = teams.getTeamName();
                }
            }

            System.out.println("The english team found is the: " + a);
        }

        // removing from a collection
        @Test
        public void collectionRemove()
        {
            englishTeams.remove(englishTeam1);
            assertEquals(0, englishTeams.size());
            System.out.println(englishTeams);
        }

        // adding to a list
        @Test
        public void addToList()
        {
            spanishTeams.add(spanishTeam1);
            spanishTeams.add(spanishTeam2);
            assertNotNull(spanishTeams);
            assertEquals(2, spanishTeams.size());
            System.out.println("Teams added were: \n" + spanishTeams);
        }

        // finding in a list
        @Test
        public void findInList()
        {
            String s = "";
            Iterator v = spanishTeams.iterator();

            while(v.hasNext()) {
                Teams teams = (Teams) v.next();
                if (teams.equals(spanishTeam2)) {
                    assertEquals(teams, spanishTeam2);
                    s = teams.getTeamName();
                }
            }

            System.out.println("The team found is: " + s);
        }

        // removing from a list
        @Test
        public void removeFromList()
        {
            spanishTeams.remove(spanishTeam2);
            assertEquals(0, spanishTeams.size());
            System.out.println(spanishTeams);
        }

        // adding to a set
        @Test
        public void addToSet()
        {
            brazilianTeams.add(brazilianTeam1);
            brazilianTeams.add(brazilianTeam2);
            assertNotNull(brazilianTeams);
            assertEquals(2, brazilianTeams.size());
            System.out.println("Teams added were: \n" + brazilianTeams);
        }

        // finding in a set
        @Test
        public void findInSet()
        {
            String s = "";
            Iterator v = brazilianTeams.iterator();

            while(v.hasNext()) {
                Teams teams = (Teams)v.next();
                if (teams.equals(brazilianTeam1)) {
                    assertEquals(teams, brazilianTeam1);
                    s = teams.getTeamName();
                }
            }

            System.out.println("The team found is: " + s);
        }

        // removing from a set
        @Test
        public void removeFromSet()
        {
            brazilianTeams.remove(brazilianTeam1);
            assertEquals(0, brazilianTeams.size());
            System.out.println(brazilianTeams);
        }

        // adding to a map
        @Test
        public void addToMap()
        {
            frenchTeams.put(frenchTeam1.getId(), frenchTeam1);
            frenchTeams.put(frenchTeam2.getId(), frenchTeam2);
            assertNotNull(frenchTeams);
            assertEquals(2, frenchTeams.size());
            System.out.println("Teams added were: \n" + frenchTeams);
        }

        // finding in a map
        @Test
        void findInMap()
        {
            String s = "";
            Iterator v = frenchTeams.values().iterator();

            while(v.hasNext()) {
                Teams team = (Teams)v.next();
                if (team.equals(frenchTeam1)) {
                    assertEquals(team, frenchTeam1);
                    s = team.getTeamName();
                }
            }

            System.out.println("The car that was found is the: " + s);
        }

        // removing from a map
        @Test
        void removeFromMap()
        {
            frenchTeams.remove(frenchTeam1.getId());
            assertEquals(0, frenchTeams.size());
            System.out.println(frenchTeams);
        }



}