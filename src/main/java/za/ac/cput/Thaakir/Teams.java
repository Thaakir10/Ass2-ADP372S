package za.ac.cput.Thaakir;

/* Student: Thaakir Ajouhaar
 * Student Number: 217244394
 * Assignment 2
 * ADP372S
 */

import java.util.Objects;

public class Teams {
    private String teamName, id;

    private Teams(TeamsBuilder builder){
        this.teamName = builder.teamName;
        this.id = builder.id;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getId() {
        return id;
    }

    public static class TeamsBuilder {
        private String teamName, id;

        public TeamsBuilder setTeamName(String teamName) {
            this.teamName = teamName;
            return this;
        }

        public TeamsBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public Teams build(){
            return new Teams(this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TeamsBuilder teams = (TeamsBuilder) o;
            return Objects.equals(teamName, teams.teamName) && Objects.equals(id, teams.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(teamName, id);
        }
    }

}
