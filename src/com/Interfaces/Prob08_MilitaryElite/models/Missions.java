
package com.Interfaces.Prob08_MilitaryElite.models;

/**
 *
 * @author chobi
 */
public class Missions {
    
    private String codeName;
    private String state;

    public Missions(String codeName, String state) {
        this.setCodeName(codeName);
        this.setState(state);
    }

    public String getCodeName() {
        return codeName;
    }

    private void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public String getState() {
        return state;
    }

    private void setState(String state) {
        this.state = state;
    }
    
    public void CompleteMission(){
        
        if (this.state.equals("inProgress")) {
          this.codeName = "Finished";  
        }
    }

    @Override
    public String toString() {
        
        //Code Name: <codeName> State: <state>
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Code Name: %s State: %s", this.getCodeName(), this.getState()));
        
        return sb.toString();
    }
    
    
}
