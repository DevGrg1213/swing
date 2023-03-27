import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class App extends JFrame{
    private JLabel usernameLabel,passwordLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginBtn, resetBtn;

    public App(){
        setLayout(null);
        usernameLabel = new JLabel("username");
        passwordLabel = new JLabel("password");
        usernameField = new JTextField();
        passwordField = new JPasswordField();
        loginBtn = new JButton("Login");
        resetBtn = new JButton("Reset");

        usernameLabel.setBounds(50,50,100,30);
        usernameField.setBounds(150,50,200,30);

        passwordLabel.setBounds(50,100,100,30);
        passwordField.setBounds(150,100,200,30);

        loginBtn.setBounds(50,150,70,30);
        resetBtn.setBounds(150,150,70,30);
        
        add(usernameLabel);
        add(passwordLabel);
        add(usernameField);
        add(passwordField);
        add(loginBtn);
        add(resetBtn);

        setSize(600, 400);

    }
    public static void main(String[] args) throws Exception {

      App app = new App();
      app.setDefaultCloseOperation(EXIT_ON_CLOSE);
      app.setVisible(true);
    }
}
