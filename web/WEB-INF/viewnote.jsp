<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note</title>
    </head>
    <body>
        <header>
            <h1>Simple Note Keeper</h1>
        </header>
        <main>
            <h2>View Note</h2>
            <div>
                <p><b>Title:</b></p>
                <p>${title}</p>
            </div>
            <div>
                <p><b>Contents:</b></p>
                <br>
                <p>${content}</p>
            </div>
        </main>
        <footer>
            <a href="note?edit">Edit</a>
        </footer>
    </body>
</html>

