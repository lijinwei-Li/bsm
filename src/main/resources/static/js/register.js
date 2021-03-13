/**
 * 请求注册接口
 */
function startRegister() {
    var name = $('#name').val();
    var pwd = $('#pwd').val();
    var tPwd = $('#tPwd').val();
    if(name =='' || pwd == '' || tPwd == ''){
        alert('用户名或密码为空！')
        return ;
    }
    if(pwd != tPwd){
        alert('两次密码输入不一致，请重新输入！')
        $('#pwd').val('');
        $('#tPwd').val('');
        return;
    }
    $.ajax({
        //几个参数需要注意一下
        type: "POST",//方法类型
        dataType: "json",//预期服务器返回的数据类型
        url: "/author/register" ,//url
        data: $('#registerForm').serialize(),
        success: function (result) {
            if (result.status == 200) {
                //重定向到首页
                alert(result.msg)
                location.href="./login.html";
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