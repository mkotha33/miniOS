import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import org.eclipse.wb.swing.FocusTraversalOnArray;
class picpuzzle2 extends JFrame implements ActionListener{
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,sample,starB;
Icon star;
Icon ic0=new ImageIcon("C:\\\\Users\\\\Sowmya Vasuki\\\\Downloads\\\\MiniOS-Lazzarus--master\\\\MiniOS-Lazzarus--master\\\\starB0.jpg");
Icon ic10=new ImageIcon("C:\\\\Users\\\\Sowmya Vasuki\\\\Downloads\\\\MiniOS-Lazzarus--master\\\\MiniOS-Lazzarus--master\\\\starB10.jpg");
Icon ic20=new ImageIcon("C:\\\\Users\\\\Sowmya Vasuki\\\\Downloads\\\\MiniOS-Lazzarus--master\\\\MiniOS-Lazzarus--master\\\\starB20.jpg");
Icon samicon1=new ImageIcon("C:\\\\Users\\\\Sowmya Vasuki\\\\Downloads\\\\MiniOS-Lazzarus--master\\\\MiniOS-Lazzarus--master\\\\main.jpg");
Icon samicon2=new ImageIcon("C:\\\\Users\\\\Sowmya Vasuki\\\\Downloads\\\\MiniOS-Lazzarus--master\\\\MiniOS-Lazzarus--master\\\\main2.jpg");
Icon samicon3=new ImageIcon("C:\\\\Users\\\\Sowmya Vasuki\\\\Downloads\\\\MiniOS-Lazzarus--master\\\\MiniOS-Lazzarus--master\\\\main3.jpg");
Icon ic1=new ImageIcon("C:\\\\Users\\\\Sowmya Vasuki\\\\Downloads\\\\MiniOS-Lazzarus--master\\\\MiniOS-Lazzarus--master\\\\1.jpg");
Icon ic2=new ImageIcon("C:\\\\Users\\\\Sowmya Vasuki\\\\Downloads\\\\MiniOS-Lazzarus--master\\\\MiniOS-Lazzarus--master\\\\5.jpg");
Icon ic3=new ImageIcon("C:\\\\Users\\\\Sowmya Vasuki\\\\Downloads\\\\MiniOS-Lazzarus--master\\\\MiniOS-Lazzarus--master\\\\2.jpg");
Icon ic4=new ImageIcon("C:\\\\Users\\\\Sowmya Vasuki\\\\Downloads\\\\MiniOS-Lazzarus--master\\\\MiniOS-Lazzarus--master\\\\7.jpg");
Icon ic5=new ImageIcon("C:\\\\Users\\\\Sowmya Vasuki\\\\Downloads\\\\MiniOS-Lazzarus--master\\\\MiniOS-Lazzarus--master\\\\4.jpg");
Icon ic6=new ImageIcon("C:\\\\Users\\\\Sowmya Vasuki\\\\Downloads\\\\MiniOS-Lazzarus--master\\\\MiniOS-Lazzarus--master\\\\6.jpg");
Icon ic7=new ImageIcon("C:\\\\Users\\\\Sowmya Vasuki\\\\Downloads\\\\MiniOS-Lazzarus--master\\\\MiniOS-Lazzarus--master\\\\8.jpg");
Icon ic8=new ImageIcon("C:\\\\Users\\\\Sowmya Vasuki\\\\Downloads\\\\MiniOS-Lazzarus--master\\\\MiniOS-Lazzarus--master\\\\9.jpg");
Icon ic9=new ImageIcon("C:\\\\Users\\\\Sowmya Vasuki\\\\Downloads\\\\MiniOS-Lazzarus--master\\\\MiniOS-Lazzarus--master\\\\3.jpg");

Icon ic11=new ImageIcon("C:\\\\Users\\\\Sowmya Vasuki\\\\Downloads\\\\MiniOS-Lazzarus--master\\\\MiniOS-Lazzarus--master\\\\12.jpg");
Icon ic12=new ImageIcon("C:\\\\Users\\\\Sowmya Vasuki\\\\Downloads\\\\MiniOS-Lazzarus--master\\\\MiniOS-Lazzarus--master\\\\13.jpg");
Icon ic13=new ImageIcon("C:\\\\Users\\\\Sowmya Vasuki\\\\Downloads\\\\MiniOS-Lazzarus--master\\\\MiniOS-Lazzarus--master\\\\16.jpg");
Icon ic14=new ImageIcon("C:\\\\Users\\\\Sowmya Vasuki\\\\Downloads\\\\MiniOS-Lazzarus--master\\\\MiniOS-Lazzarus--master\\\\11.jpg");
Icon ic15=new ImageIcon("C:\\\\Users\\\\Sowmya Vasuki\\\\Downloads\\\\MiniOS-Lazzarus--master\\\\MiniOS-Lazzarus--master\\\\14.jpg");
Icon ic16=new ImageIcon("C:\\\\Users\\\\Sowmya Vasuki\\\\Downloads\\\\MiniOS-Lazzarus--master\\\\MiniOS-Lazzarus--master\\\\19.jpg");
Icon ic17=new ImageIcon("C:\\\\Users\\\\Sowmya Vasuki\\\\Downloads\\\\MiniOS-Lazzarus--master\\\\MiniOS-Lazzarus--master\\\\17.jpg");
Icon ic18=new ImageIcon("C:\\\\Users\\\\Sowmya Vasuki\\\\Downloads\\\\MiniOS-Lazzarus--master\\\\MiniOS-Lazzarus--master\\\\15.jpg");
Icon ic19=new ImageIcon("C:\\\\Users\\\\Sowmya Vasuki\\\\Downloads\\\\MiniOS-Lazzarus--master\\\\MiniOS-Lazzarus--master\\\\18.jpg");

Icon ic21=new ImageIcon("C:\\\\Users\\\\Sowmya Vasuki\\\\Downloads\\\\MiniOS-Lazzarus--master\\\\MiniOS-Lazzarus--master\\\\24.jpg");
Icon ic22=new ImageIcon("C:\\\\Users\\\\Sowmya Vasuki\\\\Downloads\\\\MiniOS-Lazzarus--master\\\\MiniOS-Lazzarus--master\\\\25.jpg");
Icon ic23=new ImageIcon("C:\\\\Users\\\\Sowmya Vasuki\\\\Downloads\\\\MiniOS-Lazzarus--master\\\\MiniOS-Lazzarus--master\\\\21.jpg");
Icon ic24=new ImageIcon("C:\\\\Users\\\\Sowmya Vasuki\\\\Downloads\\\\MiniOS-Lazzarus--master\\\\MiniOS-Lazzarus--master\\\\27.jpg");
Icon ic25=new ImageIcon("C:\\\\Users\\\\Sowmya Vasuki\\\\Downloads\\\\MiniOS-Lazzarus--master\\\\MiniOS-Lazzarus--master\\\\23.jpg");
Icon ic26=new ImageIcon("C:\\\\Users\\\\Sowmya Vasuki\\\\Downloads\\\\MiniOS-Lazzarus--master\\\\MiniOS-Lazzarus--master\\\\29.jpg");
Icon ic27=new ImageIcon("C:\\\\Users\\\\Sowmya Vasuki\\\\Downloads\\\\MiniOS-Lazzarus--master\\\\MiniOS-Lazzarus--master\\\\28.jpg");
Icon ic28=new ImageIcon("C:\\\\Users\\\\Sowmya Vasuki\\\\Downloads\\\\MiniOS-Lazzarus--master\\\\MiniOS-Lazzarus--master\\\\22.jpg");
Icon ic29=new ImageIcon("C:\\\\Users\\\\Sowmya Vasuki\\\\Downloads\\\\MiniOS-Lazzarus--master\\\\MiniOS-Lazzarus--master\\\\26.jpg");

picpuzzle2(){

super("PICTURE PUZZLE");
setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Sowmya Vasuki\\Downloads\\MiniOS-Lazzarus--master\\MiniOS-Lazzarus--master\\one.png"));
getContentPane().setForeground(new Color(255, 153, 255));
getContentPane().setBackground(new Color(0, 0, 102));

b1=new JButton(new ImageIcon("C:\\Users\\Sowmya Vasuki\\Downloads\\MiniOS-Lazzarus--master\\MiniOS-Lazzarus--master\\1.jpg"));
b1.setBounds(10,80,100,100);
b2=new JButton(new ImageIcon("C:\\Users\\Sowmya Vasuki\\Downloads\\MiniOS-Lazzarus--master\\MiniOS-Lazzarus--master\\5.jpg"));
b2.setBounds(110,80,100,100);
b3=new JButton(new ImageIcon("C:\\Users\\Sowmya Vasuki\\Downloads\\MiniOS-Lazzarus--master\\MiniOS-Lazzarus--master\\2.jpg"));
b3.setBounds(210,80,100,100);
b4=new JButton(new ImageIcon("C:\\Users\\Sowmya Vasuki\\Downloads\\MiniOS-Lazzarus--master\\MiniOS-Lazzarus--master\\7.jpg"));
b4.setBounds(10,180,100,100);
b5=new JButton(new ImageIcon("C:\\Users\\Sowmya Vasuki\\Downloads\\MiniOS-Lazzarus--master\\MiniOS-Lazzarus--master\\4.jpg"));
b5.setBounds(110,180,100,100);
b6=new JButton(new ImageIcon("C:\\Users\\Sowmya Vasuki\\Downloads\\MiniOS-Lazzarus--master\\MiniOS-Lazzarus--master\\6.jpg"));
b6.setBounds(210,180,100,100);
b7=new JButton(new ImageIcon("C:\\Users\\Sowmya Vasuki\\Downloads\\MiniOS-Lazzarus--master\\MiniOS-Lazzarus--master\\8.jpg"));
b7.setBounds(10,280,100,100);
b8=new JButton(new ImageIcon("C:\\Users\\Sowmya Vasuki\\Downloads\\MiniOS-Lazzarus--master\\MiniOS-Lazzarus--master\\9.jpg"));
b8.setBounds(110,280,100,100);
b9=new JButton(new ImageIcon("C:\\Users\\Sowmya Vasuki\\Downloads\\MiniOS-Lazzarus--master\\MiniOS-Lazzarus--master\\3.jpg"));
b9.setBounds(210,280,100,100);
sample=new JButton(new ImageIcon("C:\\Users\\Sowmya Vasuki\\Downloads\\MiniOS-Lazzarus--master\\MiniOS-Lazzarus--master\\main.jpg"));
sample.setBounds(358,123,200,186);
JLabel l2=new JLabel("BLOCK THAT CAN BE SWAPPED WITH ITS NEIGHBOUR");
l2.setForeground(new Color(255, 153, 255));
l2.setBounds(5,15,500,20);
JLabel l3=new JLabel("CLICK ON THE ABOVE IMAGE TO CHANGE");
l3.setBounds(358,320,212,20);
l3.setForeground(new Color(255, 153, 255));

starB=new JButton(new ImageIcon("C:\\Users\\Sowmya Vasuki\\Downloads\\MiniOS-Lazzarus--master\\MiniOS-Lazzarus--master\\starB0.jpg"));
starB.setBounds(330,5,50,50);
star=b9.getIcon();

getContentPane().add(b1);getContentPane().add(b2);getContentPane().add(b3);getContentPane().add(b4);getContentPane().add(b5);getContentPane().add(b6);getContentPane().add(b7);getContentPane().add(b8);getContentPane().add(b9);getContentPane().add(sample);getContentPane().add(l2);getContentPane().add(starB);getContentPane().add(l3);
b1.addActionListener(this); b2.addActionListener(this); b3.addActionListener(this); b4.addActionListener(this); b5.addActionListener(this); b6.addActionListener(this); b7.addActionListener(this); b8.addActionListener(this); b9.addActionListener(this); 
sample.addActionListener(this);
getContentPane().setLayout(null);
JLabel lblImage = new JLabel("IMAGE");
lblImage.setForeground(new Color(255, 153, 255));
lblImage.setBounds(433, 98, 46, 14);
getContentPane().add(lblImage);
setSize(600,500);
setVisible(true);
setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{getContentPane(), b1, b2, b3, b4, b5, b6, b7, b8, b9, sample, l2, starB, l3, lblImage}));
}

public void actionPerformed(ActionEvent e){
if(e.getSource()==b1){
    Icon s1=b1.getIcon();
      if(b2.getIcon()==star){
        b2.setIcon(s1);
        b1.setIcon(star);
      } else if(b4.getIcon()==star){
                    b4.setIcon(s1);
                    b1.setIcon(star);
                   }
  }//end of if

if(e.getSource()==b2){
    Icon s1=b2.getIcon();
      if(b1.getIcon()==star){
        b1.setIcon(s1);
        b2.setIcon(star);
      } else if(b5.getIcon()==star){
                    b5.setIcon(s1);
                    b2.setIcon(star);
                   }
         else if(b3.getIcon()==star){
                    b3.setIcon(s1);
                    b2.setIcon(star);
                   }
  }//end of if

if(e.getSource()==b3){
    Icon s1=b3.getIcon();
      if(b2.getIcon()==star){
        b2.setIcon(s1);
        b3.setIcon(star);
      } else if(b6.getIcon()==star){
                    b6.setIcon(s1);
                    b3.setIcon(star);
                   }
  }//end of if

if(e.getSource()==b4){
    Icon s1=b4.getIcon();
      if(b1.getIcon()==star){
        b1.setIcon(s1);
        b4.setIcon(star);
      } else if(b5.getIcon()==star){
                    b5.setIcon(s1);
                    b4.setIcon(star);
                   }
         else if(b7.getIcon()==star){
                    b7.setIcon(s1);
                    b4.setIcon(star);
                   }
  }//end of if

if(e.getSource()==b5){
    Icon s1=b5.getIcon();
      if(b2.getIcon()==star){
        b2.setIcon(s1);
        b5.setIcon(star);
      } else if(b4.getIcon()==star){
                    b4.setIcon(s1);
                    b5.setIcon(star);
                   }
         else if(b6.getIcon()==star){
                    b6.setIcon(s1);
                    b5.setIcon(star);
                   }
          else if(b8.getIcon()==star){
                    b8.setIcon(s1);
                    b5.setIcon(star);
                   }
  }//end of if

if(e.getSource()==b6){
    Icon s1=b6.getIcon();
      if(b3.getIcon()==star){
        b3.setIcon(s1);
        b6.setIcon(star);
      } else if(b5.getIcon()==star){
                    b5.setIcon(s1);
                    b6.setIcon(star);
                   }
         else if(b9.getIcon()==star){
                    b9.setIcon(s1);
                    b6.setIcon(star);
                   }
}//end of if

if(e.getSource()==b7){
    Icon s1=b7.getIcon();
      if(b4.getIcon()==star){
        b4.setIcon(s1);
        b7.setIcon(star);
      } else if(b8.getIcon()==star){
                    b8.setIcon(s1);
                    b7.setIcon(star);
                   }
 }//end of if

   if(e.getSource()==b8){
    Icon s1=b8.getIcon();
      if(b7.getIcon()==star){
        b7.setIcon(s1);
        b8.setIcon(star);
      } else if(b5.getIcon()==star){
                    b5.setIcon(s1);
                    b8.setIcon(star);
                   }
         else if(b9.getIcon()==star){
                    b9.setIcon(s1);
                    b8.setIcon(star);
                   }

  }//end of if

 if(e.getSource()==b9){
    Icon s1=b9.getIcon();
      if(b8.getIcon()==star){
        b8.setIcon(s1);
        b9.setIcon(star);
      } else if(b6.getIcon()==star){
                    b6.setIcon(s1);
                    b9.setIcon(star);
                   }
  }//end of if

if(e.getSource()==sample){
Icon s1=sample.getIcon();
 if(s1==samicon3){
sample.setIcon(samicon1);
b1.setIcon(ic1);
b2.setIcon(ic2);
b3.setIcon(ic3);
b4.setIcon(ic4);
b5.setIcon(ic5);
b6.setIcon(ic6);
b7.setIcon(ic7);
b8.setIcon(ic8);
b9.setIcon(ic9);
star=b9.getIcon();
starB.setIcon(ic0);
}//eof if
else if(s1==samicon1){
sample.setIcon(samicon2);
b1.setIcon(ic11);
b2.setIcon(ic12);
b3.setIcon(ic13);
b4.setIcon(ic14);
b5.setIcon(ic15);
b6.setIcon(ic16);
b7.setIcon(ic17);
b8.setIcon(ic18);
b9.setIcon(ic19);
star=b6.getIcon();
starB.setIcon(ic10);
}//eof else
else{
sample.setIcon(samicon3);
b1.setIcon(ic21);
b2.setIcon(ic22);
b3.setIcon(ic23);
b4.setIcon(ic24);
b5.setIcon(ic25);
b6.setIcon(ic26);
b7.setIcon(ic27);
b8.setIcon(ic28);
b9.setIcon(ic29);
star=b6.getIcon();
starB.setIcon(ic20);
}//eof else

}
}//end of actionPerformed

public static void main(String args[]){
new picpuzzle2();
}//end of main
}//end of class