package cadastro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Tela2cadastro
 */
@WebServlet("/Tela2cadastro")
public class ServtTela2cadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServtTela2cadastro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter resposta = response.getWriter();
        resposta.write("<html>");
        resposta.write("<head>");
        resposta.write("<title>Confirmação de registro</title>");
        resposta.write("</head>");
        resposta.write("<body>");
        resposta.write("<h3>Registro realizado com sucesso!</h3><br/><br/>");
        resposta.write("<b>Seus dados pessoais:</b><br/>");
        resposta.write(request.getParameter("nome") + " " + request.getParameter("sobrenome"));
        resposta.write("<br/>");
        resposta.write(request.getParameter("rua"));
        resposta.write("<br/>");
        resposta.write(request.getParameter("complemento"));
        resposta.write("<br/>");
        resposta.write(request.getParameter("cidade"));
        resposta.write(", ");
        resposta.write(request.getParameter("cep"));
        resposta.write(", ");
        resposta.write(request.getParameter("estado"));
        resposta.write("<br/>");
        resposta.write("<b>Seus dados profissionais:</b><br/>");
        resposta.write(request.getParameter("empresa"));
        resposta.write("<br/>");
        resposta.write(request.getParameter("ruaEmpresa"));
        resposta.write("<br/>");
        resposta.write(request.getParameter("complementoEmpresa"));
        resposta.write("<br/>");
        resposta.write(request.getParameter("cidadeEmpresa"));
        resposta.write(", ");
        resposta.write(request.getParameter("cepEmpresa"));
        resposta.write(", ");
        resposta.write(request.getParameter("estadoEmpresa"));
        resposta.write("</body></html>");
        resposta.write("<input type=\"hidden\" name=\"nome\" value=\"");
        resposta.write(request.getParameter("nome") + "\">");
        resposta.write("<input type=\"hidden\" name=\"sobrenome\" value=\"");
        resposta.write(request.getParameter("sobrenome") + "\">");
        resposta.write("<input type=\"hidden\" name=\"rua\" value=\"");
        resposta.write(request.getParameter("rua") + "\">");
        resposta.write("<input type=\"hidden\" name=\"complemento\" value=\"");
        resposta.write(request.getParameter("complemento") + "\">");
        resposta.write("<input type=\"hidden\" name=\"cidade\" value=\"");
        resposta.write(request.getParameter("cidade") + "\">");
        resposta.write("<input type=\"hidden\" name=\"cep\" value=\"");
        resposta.write(request.getParameter("cep") + "\">");
        resposta.write("<input type=\"hidden\" name=\"estado\" value=\"");
        resposta.write(request.getParameter("estado") + "\">");
	}

}
