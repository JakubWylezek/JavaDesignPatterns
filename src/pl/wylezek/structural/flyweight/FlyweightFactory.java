package pl.wylezek.structural.flyweight;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String, Relation> relations = Collections.synchronizedMap(new HashMap<>());

    public synchronized Relation createRelation(String description) {
        Relation relation = relations.get(description);
        if(relation == null) {
            relation = new Relation(description);
            relations.put(description, relation);
            System.out.println("Creating new relation: " + relation.getDescription());
        }
        return relation;
    }
}
