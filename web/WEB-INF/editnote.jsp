<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note</title>
    </head>
    <body>
        <header>
            <h1>Simple Note Keeper</h1>
        </header>
        <main>
            <form method="post" action="note">
            <h2>Edit Note</h2>

            <p>Title: </p>
            <input type="text" name="title" value="${title}">

            <p>Contents: </p>
            <textarea id="contents" name="content" rows="4" cols="50">${content}</textarea>
            <br>
            <input type="submit" value="Save">
            </form>
        </main>
    </body>
</html>
