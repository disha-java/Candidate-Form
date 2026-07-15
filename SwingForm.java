import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingForm {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JLabel h = new JLabel(" CANDIDATE FORM");
        JLabel l1 = new JLabel("First Name");
        JLabel l2 = new JLabel("Last Name");
        JLabel l3 = new JLabel("contact");
        JLabel l4 = new JLabel("course");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3= new JTextField();

        String[] courses = {"B.Tech", "BCA", "M.Tech", "MCA", "MBA"};
        JComboBox<String> courseBox = new JComboBox<>(courses);


        h.setBounds(60,20,450,70);
        l1.setBounds(50,90,150,50);
        l2.setBounds(50,150,150,30);
        l3.setBounds(50,210,150,30);
        l4.setBounds(50,270,150,30);

        t1.setBounds(200,100,150,25);
        t2.setBounds(200,150,150,25);
        t3.setBounds(200,210,150,25);
        courseBox.setBounds(200,270,150,25);

        JButton b1 = new JButton("Submit");
        b1.setBounds(150,350,100,30);
        JButton b2 = new JButton("Clear");
        b2.setBounds(300,350,100,30);

        JTextArea ta = new JTextArea();
        ta.setBounds(70,400,350,200);




        l1.setFont(new Font("Arial", Font.BOLD,22));
        h.setFont(new Font("Arial", Font.BOLD,40));
        l2.setFont(new Font("Arial", Font.BOLD,22));
        l3.setFont(new Font("Arial", Font.BOLD,22));
        l4.setFont(new Font("Arial", Font.BOLD,22));

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String FirstName = t1.getText();
                String LastName = t2.getText();
                String Contact = t3.getText();
                String course = (String) courseBox .getSelectedItem();

                if(FirstName.isEmpty() || LastName.isEmpty() || Contact.isEmpty()){
                    JOptionPane.showMessageDialog(f, "Please fill all fields", "Warning", JOptionPane.WARNING_MESSAGE);
                }
                else {


                    String studentData = "FirstName:" + FirstName + "\n" + "LastName:" + LastName + "\n" + "Contact:" + Contact + "\n" + "Course:" + course + "\n";
                    ta.append(studentData);
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.setText("");
            }
        });


        f.add(ta);
        f.add(b2);
        f.add(h);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(courseBox);
        f.add(b1);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);;

        f.setSize(500,700);

    }
}
