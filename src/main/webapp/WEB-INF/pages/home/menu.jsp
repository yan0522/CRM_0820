<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/4/10
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="/commons/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>客户关系管理</title>
    <link rel="stylesheet" type="text/css" href="${ctp }/static/jquery/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="${ctp }/static/jquery/themes/icon.css">
    <script type="text/javascript" src="${ctp }/static/jquery/jquery.easyui.min.js"></script>
    <script type="text/javascript">
        $(function(){
            $('#tt').tree({
                onClick : function(node) {
                    if(node.url){
                        window.parent.document.getElementsByClassName("content").src="${ctp}"+node.url;
                        //window.document.getElementById("content").src="${ctp}" +node.url;
                    }
                }
            });
        });
    </script>
</head>
<body>
<ul id="tt" class="easyui-tree" data-options="url:'${ctp}/static/tree_data1.json',method:'get',animate:true"></ul>
</body>
</html>