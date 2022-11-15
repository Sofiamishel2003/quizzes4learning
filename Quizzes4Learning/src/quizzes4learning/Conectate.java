
package quizzes4learning;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author 50250
 */
public class Conectate {
    private String driver="com.mysql.jdbc.Driver";
    private String cadenaConeccion="jdbc:mysql://localhost/quizzes4learning";
    private String usuariobd="root";
    private String passwordbd="";
    public Connection con;
    public Conectate()
    {
        try{
             Class.forName(driver);
        con=DriverManager.getConnection(cadenaConeccion,usuariobd,passwordbd);
        }catch(Exception e)
               {
                   JOptionPane.showMessageDialog(null, "No se pudo abrir :(");
               }
    }
}
