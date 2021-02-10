/**
 * 请求登录接口
 */
function login() {
    $.ajax({
        //几个参数需要注意一下
        type: "POST",//方法类型
        dataType: "json",//预期服务器返回的数据类型
        url: "/login/loginByNameAndPwd" ,//url
        data: $('#loginForm').serialize(),
        success: function (result) {
            console.log(result);//打印服务端返回的数据(调试用)
            if (result.code == 200) {
                //重定向到首页
                window.location.replace(result.url);
            };
        },
        error : function() {
            alert("登录异常！");
        }
    });
}