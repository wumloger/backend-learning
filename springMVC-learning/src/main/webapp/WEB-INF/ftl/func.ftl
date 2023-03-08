<html>
<head lang="en">
    <meta charset="utf-8">
    <title>spring</title>
    <style>
        .main{
            height: 800px;
            width: 100%;
            display: flex;
            justify-content:space-evenly;
        }

        .box{
            display: inline-block;
            height: 400px;
            width: 200px;
            border: 1px solid gray;
            text-align: center;
            align-items:center;
        }
    </style>
</head>
<body>
<div class="main">
<#list list as func>
    <div class="box">
        <img src="${func.fImg}">
        <h3>${func.fName}</h3>
        <p>${func.fDec}</p>
    </div>
</#list>
</div>
</body>
</html>