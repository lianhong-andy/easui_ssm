<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/3
  Time: 1:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script src="js/jquery.min.js"></script>
<script src="js/jquery.easyui.min.js"></script>
<script src="js/locale/easyui-lang-zh_CN.js"></script>
<link rel="stylesheet" href="js/themes/default/easyui.css">
<link rel="stylesheet" href="js/themes/icon.css">

<body class="easyui-layout">
<div region="north" split="true" style="height: 160px;">
    <img src="Logo.png" style="height: 150px;width: 850px;">
</div>
<div region="center">
    <div id="MenusTabs" class="easyui-tabs" fit="true" border="false">
        <div title="首页">
            <div align="center" style="padding-top: 100px;">
                <font color="red" size="15">
                    Welcome ! Enjoy To Use EasyUI!
                </font><br/>
                <font color="red" size="15">
                    欢迎 ! 享受 EasyUI!~
                </font>
            </div>
        </div>
    </div>
</div>
<div region="west" split="true" title="导航菜单" style="width:150px;">
    <ul id="TreeMenus"></ul>
</div>
<div region="south" split="true" style="background-color:gray;height:100px;line-height:80px;"align="center">版权所有 Copy Right</div>
<script type="text/javascript" src="./js/MyEasyUICRUD.js"></script>
</body>
<script>
</script>
</html>