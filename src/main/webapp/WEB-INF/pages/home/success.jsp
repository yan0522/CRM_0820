<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="/commons/common.jsp" %>
<html>
<div>
    <table>
        <iframe class="content" name="topFrame" src="${ctp}/header" scrolling="no" frameborder="0" height="80" width="1500" marginwidth="0" marginheight="0"></iframe>
        <iframe class="content" name="menu" src="${ctp}/menu" scrolling="no" frameborder="0" height="580" width="260" marginwidth="0" marginheight="0"></iframe>
        <iframe class="content" name="content" src="${ctp}/welcome" scrolling="no" frameborder="0" height="580" width="1200" marginwidth="0" marginheight="0" ></iframe>
        <iframe class="content" name="bottomFrame" src="${ctp}/footer" scrolling="no" frameborder="0" height="40" width="1500" marginwidth="0" marginheight="0"></iframe>
    </table>
</div>

</html>