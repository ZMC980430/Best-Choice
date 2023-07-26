package com.bestchoice.acl.helper;

import com.bestchoice.model.acl.Permission;

import java.util.ArrayList;
import java.util.List;

public class PermissionHelper {
    public static List<Permission> build(List<Permission> treeNodes) {
        List<Permission> trees = new ArrayList<>();
        for (Permission treeNode : treeNodes) {
            if(treeNode.getPid()==0){
                treeNode.setLevel(1);
                trees.add(findChildren(treeNode, treeNodes));
            }
        }
        return trees;
    }

    public static Permission findChildren(Permission treeNode, List<Permission> treeNodes) {
        treeNode.setChildren(new ArrayList<>());
        for (Permission node : treeNodes) {
            if(treeNode.getId().longValue()==node.getPid().longValue()) {
                int level = treeNode.getLevel() + 1;
                node.setLevel(level);
                if (treeNode.getChildren() == null) {
                    treeNode.setChildren(new ArrayList<>());
                }
                treeNode.getChildren().add(findChildren(node, treeNodes));
            }
        }
        return treeNode;
    }
}
