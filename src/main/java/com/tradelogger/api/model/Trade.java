package com.tradelogger.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Trade
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @OneToMany(orphanRemoval = true)
    List<Objective> objectives;

    @OneToMany(orphanRemoval = true)
    List<Risk> risks;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public List<Objective> getObjectives()
    {
        return objectives;
    }

    public void setObjectives(List<Objective> objectives)
    {
        this.objectives = objectives;
    }

    public List<Risk> getRisks()
    {
        return risks;
    }

    public void setRisks(List<Risk> risks)
    {
        this.risks = risks;
    }
}
