package servlets;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/download")
public class DownloadServlet extends HttpServlet {
    private static final String UPLOAD_DIR = "uploaded";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String fileName = request.getParameter("file");
        if (fileName == null || fileName.isEmpty()) return;

        String filePath = getServletContext().getRealPath("") + File.separator + UPLOAD_DIR + File.separator + fileName;
        File file = new File(filePath);
        if (!file.exists()) return;

        response.setContentType(getServletContext().getMimeType(filePath));
        response.setHeader("Content-Disposition", "attachment; filename=" + fileName);

        try (FileInputStream fis = new FileInputStream(file)) {
            fis.transferTo(response.getOutputStream());
        }
    }
}
