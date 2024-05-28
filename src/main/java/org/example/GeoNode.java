package org.example;

import java.util.ArrayList;
import java.util.List;

public class GeoNode {
    private String name;
    private List<GeoNode> children;

    public GeoNode(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<GeoNode> getChildren() {
        return children;
    }

    public void addChild(GeoNode child) {
        children.add(child);
    }
}
