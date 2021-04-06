<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
    

	<div id='main'>

		<h2>게시판-글쓰기</h2>
		<form name="writefrm" id="writefrm" method="post">
			<div><label for="title">제목</label>
				<input type="text" name="title" id="title"></div>
			<div><label for="userid">작성자</label>
				<input type="text" name="userid" id="userid"></div>
			<div><label for="contents" class="dragup">본문내용</label>
				<textarea name="contents" id="contents"></textarea>
			</div>
			<div>
				<label></label>
				<button type="button">입력완료</button>
				<button type="reset">다시입력</button>
			</div>
		</form>

	</div>


