package com.Interfaces.Prob08_MilitaryElite.models;

import com.Interfaces.Prob08_MilitaryElite.interfaces.LeutenantGeneral;
import com.Interfaces.Prob08_MilitaryElite.interfaces.Private;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author chobi
 */
public class LeutenantGeneralImpl extends PrivateImpl implements LeutenantGeneral {

    private List<Private> privates;

    public LeutenantGeneralImpl(int id, String firstName, String lastName, double salary, List<Private> privates) {
        super(id, firstName, lastName, salary);
        this.privates = new LinkedList<>();
        this.setPrivates(privates);
    }

    @Override
    public List<Private> getPrivates() {
        return this.privates;
    }

    private void setPrivates(List<Private> privat) {
        this.privates = privat;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append(System.lineSeparator())
                .append("Privates:");
        
        this.getPrivates().forEach(p -> {
            sb.append(System.lineSeparator())
                    .append(String.format("  %s", p));
        });
        return sb.toString();
    }

}
