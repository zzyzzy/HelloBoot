var okbtn = document.getElementById('okbtn');
okbtn.addEventListener('click', checkjoinfrm);
// 입력완료 버튼 클릭시 checkjoinfrm 함수 실행

function checkjoinfrm() {
    var uid = document.getElementById('uid');
    var pwd = document.getElementById('pwd');
    var repwd = document.getElementById('repwd');
    var name = document.getElementById('name');

    if (uid.value == '') {
        alert('아이디를 입력하세요!');
        uid.focus();
    } else if (pwd.value == '') {
        alert('비밀번호를 입력하세요!');
        pwd.focus();
    } else if (repwd.value == '') {
        alert('비밀번호 확인을 입력하세요!');
        repwd.focus();
    } else if (name.value == '') {
        alert('이름을 입력하세요!');
        name.focus();
    } else if (pwd.value != repwd.value) {
        alert('비밀번호가 일치하지 않아요!!');
        pwd.focus();
    } else {
        var frm = document.getElementById('join');
        frm.method = 'post';
        frm.action = '/jjoinok';
        frm.submit();
    }
}


