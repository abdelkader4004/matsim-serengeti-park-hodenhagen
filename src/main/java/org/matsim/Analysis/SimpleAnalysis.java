package org.matsim.Analysis;

import org.matsim.core.events.EventsUtils;

public class SimpleAnalysis
{
    public static void main (String []args){
var handler =new SimplePersonEventHandler();
var manager = EventsUtils.createEventsManager();
        manager.addHandler(handler);

        // Here is a comment
        EventsUtils.readEvents(manager,"C:\\Users\\dd\\IdeaProjects\\matsim-serengeti-park-hodenhagen\\scenarios\\serengeti-park-v1.0\\output\\output-serengeti-park-v1.0-run1\\serengeti-park-v1.0-run1.output_events.xml.gz");
    }
}
