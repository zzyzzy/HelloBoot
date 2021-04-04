var logbtn = document.getElementById('logbtn');
logbtn.addEventListener('click', checkloginfrm);

function checkloginfrm() {
    var uid = document.getElementById('uid');
    var pwd = document.getElementById('pwd');

    if (uid.value == '') {
        alert('아이디 입력하세요!');
        uid.focus();
    } else if (pwd.value == '') {
        alert('비밀번호 입력하세요!');
        pwd.focus();
    } else {
        var frm = document.getElementById('login');
        frm.method = 'post';
        frm.action = '/jloginok';
        frm.submit();
    }
}