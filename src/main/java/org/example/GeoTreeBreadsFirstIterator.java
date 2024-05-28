package org.example;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class GeoTreeBreadsFirstIterator implements Iterator<GeoNode> {
    private Queue<GeoNode> queue;

    public GeoTreeBreadsFirstIterator(GeoNode root) {
        queue = new LinkedList<>();
        queue.add(root);
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public GeoNode next() {
        GeoNode currentNode = queue.poll();
        if (currentNode != null) {
            queue.addAll(currentNode.getChildren());
        }
        return currentNode;
    }
}
