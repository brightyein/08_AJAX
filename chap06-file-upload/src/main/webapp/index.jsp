<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajax file upload</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
</head>
<body>
	<h1>AJAX 방식 fild upload (formdata 이용)</h1>
	
	<input type="file" id="file"><br>
	<input type="text" id="description"><br>
	<input type="button" value="파일전송" id="send-file">
	
	<script>
		$("#send-file").click(function() {
			
			// 파일을 보낼 폼데이터 생성
			const formData = new FormData();
			
			formData.append("file", $("#file")[0].files[0]);
			formData.append("description", $(#description).val());
			
			$.ajax({
				url: "/chap06/commons",
				type: "post",
				data: formData,
				contentType: false, // multipart formdata 설정
				processData: false, // 전송 시 파일이 문자열로 넘어가지 않도록 설정
				success: function(data) {
					alert(data);
				},
				error: function(error) {
					console.log(error)
				}
			});
		});
		
	</script>
	
</body>
</html>