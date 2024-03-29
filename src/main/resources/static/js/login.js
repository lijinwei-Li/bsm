/**
 * 请求登录接口
 */
function login() {
    $.ajax({
        //几个参数需要注意一下
        type: "POST",//方法类型
        dataType: "json",//预期服务器返回的数据类型
        url: "/author/login" ,//url
        data: $('#loginForm').serialize(),
        success: function (result) {
            if (result.status == 200 && result.data.status == 1) {
                //重定向到首页
                location.href="./index.html";
            }else{
                alert(result.msg)
                return false;
            }
        },
        error : function() {
            alert("登录异常！");
            window.location.refresh() ;
        },
    });
    return false;
}