package org.shijinglu.lure.core;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.shijinglu.lure.extensions.IData;

/** Roughly equivalent to expr_list in the grammar */
public class NodeList {
    private final List<Node> list;
    private final Set<IData> set;
    private boolean resolvable = false;

    public NodeList() {
        this.list = new ArrayList<>();
        this.set = new HashSet<>();
    }

    public List<Node> getList() {
        return list;
    }

    public Set<IData> getSet() {
        return set;
    }

    synchronized void add(Node n) {
        list.add(n);
        if (!n.isResolvable()) {
            set.add(n.data);
        } else {
            resolvable = true;
        }
    }

    /** @return return true if any node is resolvable. */
    boolean isResolvable() {
        return resolvable;
    }
}
