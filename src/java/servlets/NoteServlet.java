package servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String note1 = request.getParameter("edit");

        //if null load view if not load edit
        if (note1 == null) {

            String title = "";
            String content = "";
            String line;

            String path = getServletContext().getRealPath("/WEB-INF/note.txt");
            // to read files
            BufferedReader br = new BufferedReader(new FileReader(new File(path)));

            title = br.readLine();
            content = br.readLine();
            request.setAttribute("title", title);
            request.setAttribute("content", content);

            Note note = new Note(title, content);

            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
            return;
        } else {

            String title = "";
            String content = "";
            String line;

            String path = getServletContext().getRealPath("/WEB-INF/note.txt");
            // to read files
            BufferedReader br = new BufferedReader(new FileReader(new File(path)));

            title = br.readLine();
            content = br.readLine();
            request.setAttribute("title", title);
            request.setAttribute("content", content);

            Note note = new Note(title, content);

            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
            return;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String path = getServletContext().getRealPath("/WEB-INF/note.txt");

        try {

            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));

            String enteredTitle = request.getParameter("title");
            String enteredContent = request.getParameter("content");

            pw.println(enteredTitle);
            pw.println(enteredContent);
            pw.close();

        } catch (Exception e) {
            e.getStackTrace();
        }

        doGet(request, response);
    }

}
