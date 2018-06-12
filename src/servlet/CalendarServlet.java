package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Event;
import net.arnx.jsonic.JSON;

@WebServlet("/servlet/CalendarServlet")
public class CalendarServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String jsonMsg = null;
        try {
            List<Event> eventList = new ArrayList<Event>();
            Event event = new Event();
            event.setTitle("Javaシステム勉強会");
            event.setStart("2018-05-09");
            eventList.add(event);

            event = new Event();
            event.setTitle("BOLDay");
            event.setStart("2018-05-18");
            eventList.add(event);

            jsonMsg = JSON.encode(eventList);
        } catch (Exception e) {
            System.out.println(e);
        }
        response.setContentType("application/json;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print(jsonMsg);

    }
}
