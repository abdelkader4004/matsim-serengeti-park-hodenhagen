package org.matsim.Analysis;

import org.matsim.api.core.v01.Id;
import org.matsim.api.core.v01.events.PersonArrivalEvent;
import org.matsim.api.core.v01.events.PersonDepartureEvent;
import org.matsim.api.core.v01.events.handler.PersonArrivalEventHandler;
import org.matsim.api.core.v01.events.handler.PersonDepartureEventHandler;
import org.matsim.api.core.v01.population.Person;

import java.util.HashMap;

public class SimplePersonEventHandler implements PersonArrivalEventHandler , PersonDepartureEventHandler {

    private final HashMap <Id<Person>,Double> mapPersonDepartTime=new HashMap<>();
    @Override

    public void handleEvent(PersonArrivalEvent personArrivalEvent) {
var departTime=mapPersonDepartTime.get(personArrivalEvent.getPersonId());
var arrivTime=personArrivalEvent.getTime();
var travelTime=arrivTime-departTime;
       System.out.println("Person: "+ personArrivalEvent.getPersonId() +" Travelled: "+travelTime+" s." );
    }

    @Override
    public void handleEvent(PersonDepartureEvent personDepartureEvent) {
        var departTime=personDepartureEvent.getTime();
        var personId=personDepartureEvent.getPersonId();
        mapPersonDepartTime.put(personId,departTime);
        //System.out.println("Departure: "+ personDepartureEvent.getTime() +" : "+personDepartureEvent.getPersonId() );
    }
}
