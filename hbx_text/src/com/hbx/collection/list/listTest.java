//package com.hbx.collection.list;
//
//
//import java.lang.reflect.Field;
//import java.time.Clock;
//import java.util.*;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//import java.util.stream.Stream;
//
///**
// * Created by 10180885 on 2017/2/8.
// */
//public class listTest {
//
//    private List<TreeNode> createTree(Integer pid, Map<Integer, List<SysPermission>> map){
//        return Optional.ofNullable(map.get(pid)).orElseGet(()->new ArrayList<SysPermission>()).stream().filter(x->x.getParentId() == pid).sorted((x,y)->{return x.getSortNo().compareTo(y.getSortNo());}).map(x->{
//            return new TreeNode(x.getRecId(), x.getParentId(), x.getPermissionName(), x.getIcon(), createTree(x.getRecId(), map));
//        }).collect(Collectors.toList());
//    }
//
//    private List<TreeNode> getTree(boolean onlyModule){
//        EntityWrapper<SysPermission> entityWrapper = new EntityWrapper<>();
//        entityWrapper.where("data_status>0");
//        if (onlyModule){
//            entityWrapper.eq("permission_type", PermissionType.MODULE.getValue());
//        }
//        entityWrapper.orderBy("sort_no");
//        List<SysPermission> list = selectList(entityWrapper);
//        return createTree(0, list.stream().collect(groupingBy(SysPermission::getParentId)));
//    }
//
//    public class TreeNode {
//        private static final long serialVersionUID = 1L;
//
//        private Integer recId;
//        private Integer pid;
//        private String nodeName;
//        private String icon;
//        private List<TreeNode> children;
//
//        public TreeNode(Integer recId, Integer pid, String nodeName, String icon) {
//            this.recId = recId;
//            this.pid = pid;
//            this.nodeName = nodeName;
//            this.icon = icon;
//            this.children = new ArrayList<TreeNode>();
//        }
//
//        public TreeNode(Integer recId, Integer pid, String nodeName, String icon, List<TreeNode> children) {
//            this.recId = recId;
//            this.pid = pid;
//            this.nodeName = nodeName;
//            this.icon = icon;
//            this.children = children;
//        }
//
//        public Integer getRecId() {
//            return recId;
//        }
//
//        public void setRecId(Integer recId) {
//            this.recId = recId;
//        }
//
//        public Integer getPid() {
//            return pid;
//        }
//
//        public void setPid(Integer pid) {
//            this.pid = pid;
//        }
//
//        public String getNodeName() {
//            return nodeName;
//        }
//
//        public void setNodeName(String nodeName) {
//            this.nodeName = nodeName;
//        }
//
//        public String getIcon() {
//            return icon;
//        }
//
//        public void setIcon(String icon) {
//            this.icon = icon;
//        }
//
//        public List<TreeNode> getChildren() {
//            return children;
//        }
//
//        public void setChildren(List<TreeNode> children) {
//            this.children = children;
//        }
//    }
//
//    public static void main(String[] args) {
//        Clock clock = Clock.systemUTC();
//        Clock clock2 = Clock.systemDefaultZone();
//        System.out.println(clock.instant());
//        System.out.println(clock2.instant());
//    }
//}
