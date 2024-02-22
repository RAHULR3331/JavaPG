import java.awt.*;
import java.awt.event.*;
public class choicedemo implements ActionListener{
Frame f ;List c; TextField t1;Button b;
choicedemo()
{
f = new Frame();
f.setSize(300,300);
f.setVisible(true);
f.setLayout(null);

 c=new List(2);
c.setBounds(30,50,100,30);
c.add("Apple");
c.add("Banana");
c.add("Chikku");
c.add("DragonFrt");
f.add(c);
b = new Button("Click "); // name
b.setBounds(20,100,80,30); f.add(b);
t1= new TextField();
t1.setBounds(100, 175,80,20);
f.add(t1);

b.addActionListener(this);

}

public void actionPerformed(ActionEvent ae)
{
	String ctxt=c.getItem(c.getSelectedIndex());
	t1.setText(ctxt);
	System.out.println(c.getSelectedIndex());
	System.out.println(c.getItem(c.getSelectedIndex()));
	
}


public static void main(String[] args) {
	choicedemo f= new choicedemo();
}


}