<!DOCTYPE html>
<html>
<head>
    <title>File Upload & Download</title>
</head>
<body>
    <h1>Upload a File</h1>
    <form method="post" action="upload" enctype="multipart/form-data">
        <input type="file" name="file" required>
        <button type="submit">Upload</button>
    </form>

    <h1>Download Files</h1>
    <ul>
        <li><a href="download?file=example.txt">example.txt</a></li>
        <li><a href="download?file=test.pdf">test.pdf</a></li>
    </ul>
</body>
</html>