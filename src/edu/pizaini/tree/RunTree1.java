package edu.pizaini.tree;

import com.sun.source.tree.Tree;
import com.sun.source.tree.TreeVisitor;

import java.util.TreeMap;

public class RunTree1 implements Tree{

    @Override
    public Kind getKind() {
        return null;
    }

    @Override
    public <R, D> R accept(TreeVisitor<R, D> visitor, D data) {
        return null;
    }
}
