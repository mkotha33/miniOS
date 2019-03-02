
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.text.BadLocationException;
import java.awt.Font;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Terminal extends javax.swing.JInternalFrame {
    String[] s=new String[5];
    String path=new String();
    int caretpos;
    /**
     * Creates new form Terminal
     */
    public Terminal() {
        initComponents();
        path="/home/group_os";
        ta1.append("group_os-x552ld:~>");
        caretpos=14;
        addInternalFrameListener(new InternalFrameAdapter(){
            public void internalFrameClosed(InternalFrameEvent e) {
                //System.out.print("hello");
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        ta1.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 14));

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Terminal");
        setFrameIcon(null);

        ta1.setBackground(new java.awt.Color(0,0,0));
        ta1.setColumns(20);
        ta1.setForeground(new java.awt.Color(255, 255, 255));
        ta1.setRows(5);
        ta1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ta1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(ta1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ta1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ta1KeyPressed
        // TODO add your handling code here:
        int caretpos1 = ta1.getCaretPosition();
        //System.out.println(caretpos+" "+caretpos1);
        if(caretpos1>=caretpos)
        {
            if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE && caretpos1==caretpos) {
                evt.consume();
                ta1.setEditable(false);
            }
            else
                ta1.setEditable(true);
        }
        else
           ta1.setEditable(false); 
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            evt.consume();
            caretpos = ta1.getCaretPosition();
            try {
                int linenum=ta1.getLineOfOffset(caretpos);
                int initial=ta1.getLineStartOffset(linenum);
                ta1.select(initial, caretpos);
                String str=ta1.getSelectedText();
                ta1.select(caretpos,caretpos);
                str=str.substring(str.lastIndexOf('>')+1);
                caretpos=caretpos+15;
                if(str.length()>0)
                {
                    
                    s=str.split(" ");                   
                    if(s[0].equals("cd"))
                    {
                        if(s.length>1){
                            if(s[1].equals("..")){
                                if(path.equals("/home/group_os"))
                                {
                                    ta1.append("\n"+"group_os-x552ld:~>");
                                }
                                else
                                {
                                    path=path.substring(0,path.lastIndexOf("/"));
                                    if("/home/group_os".equals(path))
                                    {
                                        ta1.append("\n"+"group_os-x552ld:~>");
                                    }
                                    else
                                    {
                                        ta1.append("\n"+"group_os-x552ld:~"+path.substring(path.lastIndexOf("/"))+">");
                                    }
                                }
                            }
                            else  {  
                                String p=path;
                                p= p.concat("/");
                                p=p.concat(s[1]);
                                //ta.append("\n"+p);
                                File folder = new File(p);
                                if(folder.exists())
                                {
                                    path=p;
                                    ta1.append("\n"+"group_os-x552ld:~"+path.substring(10)+">");
                                }
                                else
                                {
                                    ta1.append("\n"+"No such file or directory");
                                    if("/home/group_os".equals(path))
                                    {
                                        ta1.append("\n"+"group_os-x552ld:~>");
                                    }
                                    else
                                    {
                                        ta1.append("\n"+"group_os-x552ld:~"+path.substring(10)+">");
                                    }
                                }
                            }
                            
                        }
                        else
                        {
                            ta1.append("\n"+"Invalid syntax");
                            if("/home/group_os".equals(path))
                                {
                                    ta1.append("\n"+"group_os-x552ld:~>");
                                }
                                else
                                {
                                    ta1.append("\n"+"group_os-x552ld:~"+path.substring(10)+">");
                                }
                        }
                    }
                    else if(s[0].equals("ls"))
                    {
                    	ta1.append("\n"+"no files or directories in the current directory"+"\n"+"group_os-x552ld:~>");
                        File folder = new File(path);
                        File[] listOfFiles = folder.listFiles();
                        if(listOfFiles.length>0){
                        for (int i = 0; i < listOfFiles.length; i++) {
                            if(listOfFiles[i].isFile())
                                ta1.append("\n"+"file"+" "+listOfFiles[i].getName());
                            else if(listOfFiles[i].isDirectory())
                                ta1.append("\n"+"directory"+" "+listOfFiles[i].getName()); 
                        }
                        }
                        else
                        {
                            ta1.append("\n"+"No file or directory");
                        }
                        if("/home/group_os".equals(path))
                        {
                            ta1.append("\n"+"group_os-x552ld:~>");
                        }
                        else
                        {
                            ta1.append("\n"+"group_os-x552ld:~"+path.substring(10)+">");
                        }
                    }
                    else if(s[0].equals("redtext"))
                    {
                    	ta1.setForeground(new java.awt.Color(255, 0, 0));
                    	//ta1.append("\n"+path);
                        if("/home/group_os".equals(path))
                        {
                            ta1.append("\n"+"group_os-x552ld:~>");
                        }
                        else
                        {
                            ta1.append("\n"+"group_os-x552ld:~"+path.substring(10)+">");
                        }
                    }
                    else if(s[0].equals("whitetext"))
                    {
                    	ta1.setForeground(new java.awt.Color(255, 255, 255));
                    	//ta1.append("\n"+path);
                        if("/home/group_os".equals(path))
                        {
                            ta1.append("\n"+"group_os-x552ld:~>");
                        }
                        else
                        {
                            ta1.append("\n"+"group_os-x552ld:~"+path.substring(10)+">");
                        }
                    }
                    else if(s[0].equals("greentext"))
                    {
                    	ta1.setForeground(new java.awt.Color(0, 255, 0));
                    	//ta1.append("\n"+path);
                        if("/home/group_os".equals(path))
                        {
                            ta1.append("\n"+"group_os-x552ld:~>");
                        }
                        else
                        {
                            ta1.append("\n"+"group_os-x552ld:~"+path.substring(10)+">");
                        }
                    }
                    else if(s[0].equals("bluetext"))
                    {
                    	ta1.setForeground(new java.awt.Color(0, 0, 255));
                    	//ta1.append("\n"+path);
                        if("/home/group_os".equals(path))
                        {
                            ta1.append("\n"+"group_os-x552ld:~>");
                        }
                        else
                        {
                            ta1.append("\n"+"group_os-x552ld:~"+path.substring(10)+">");
                        }
                    }
                    else if(s[0].equals("yellowtext"))
                    {
                    	ta1.setForeground(new java.awt.Color(255, 255, 0));
                    	//ta1.append("\n"+path);
                        if("/home/group_os".equals(path))
                        {
                            ta1.append("\n"+"group_os-x552ld:~>");
                        }
                        else
                        {
                            ta1.append("\n"+"group_os-x552ld:~"+path.substring(10)+">");
                        }
                    }
                    else if(s[0].equals("whitebackground"))
                    {
                    	ta1.setBackground(new java.awt.Color(255, 255, 255));
                    	//ta1.append("\n"+path);
                        if("/home/group_os".equals(path))
                        {
                            ta1.append("\n"+"group_os-x552ld:~>");
                        }
                        else
                        {
                            ta1.append("\n"+"group_os-x552ld:~"+path.substring(10)+">");
                        }
                    }
                    else if(s[0].equals("blackbackground"))
                    {
                    	ta1.setBackground(new java.awt.Color(0, 0, 0));
                    	//ta1.append("\n"+path);
                        if("/home/group_os".equals(path))
                        {
                            ta1.append("\n"+"group_os-x552ld:~>");
                        }
                        else
                        {
                            ta1.append("\n"+"group_os-x552ld:~"+path.substring(10)+">");
                        }
                    }
                    else if(s[0].equals("greenbackground"))
                    {
                    	ta1.setBackground(new java.awt.Color(0, 255, 0));
                    	//ta1.append("\n"+path);
                        if("/home/group_os".equals(path))
                        {
                            ta1.append("\n"+"group_os-x552ld:~>");
                        }
                        else
                        {
                            ta1.append("\n"+"group_os-x552ld:~"+path.substring(10)+">");
                        }
                    }
                    else if(s[0].equals("redbackground"))
                    {
                    	ta1.setBackground(new java.awt.Color(255, 0, 0));
                    	//ta1.append("\n"+path);
                        if("/home/group_os".equals(path))
                        {
                            ta1.append("\n"+"group_os-x552ld:~>");
                        }
                        else
                        {
                            ta1.append("\n"+"group_os-x552ld:~"+path.substring(10)+">");
                        }
                    }
                    else if(s[0].equals("bluebackground"))
                    {
                    	ta1.setBackground(new java.awt.Color(0, 0, 255));
                    	//ta1.append("\n"+path);
                        if("/home/group_os".equals(path))
                        {
                            ta1.append("\n"+"group_os-x552ld:~>");
                        }
                        else
                        {
                            ta1.append("\n"+"group_os-x552ld:~"+path.substring(10)+">");
                        }
                    }
                    else if(s[0].equals("yellowbackground"))
                    {
                    	ta1.setBackground(new java.awt.Color(255, 255, 0));
                    	//ta1.append("\n"+path);
                        if("/home/group_os".equals(path))
                        {
                            ta1.append("\n"+"group_os-x552ld:~>");
                        }
                        else
                        {
                            ta1.append("\n"+"group_os-x552ld:~"+path.substring(10)+">");
                        }
                    }
                    else if(s[0].equals("echo"))
                    {
                    	ta1.append("\n");
                    	//ta1.append("\n"+path);
                    	for(int i=1;i<s.length;i++) {
                    		ta1.append(s[i]+" ");
                    	}
                    	//ta1.append("\n"+path);
                        if("/home/group_os".equals(path))
                        {
                            ta1.append("\n"+"group_os-x552ld:~>");
                        }
                        else
                        {
                            ta1.append("\n"+"group_os-x552ld:~"+path.substring(10)+">");
                        }
                    }
                    else if(s[0].equals("pwd"))
                    {
                        ta1.append("\n"+path);
                        if("/home/group_os".equals(path))
                        {
                            ta1.append("\n"+"group_os-x552ld:~>");
                        }
                        else
                        {
                            ta1.append("\n"+"group_os-x552ld:~"+path.substring(10)+">");
                        }
                    }
                    else if(s[0].equals("shutdown"))
                    {
                    	System.exit(0);
                    }
                    else if(s[0].equals("play"))
                        {
                    	ta1.append("\n"+"no audio files in current directory");
                            System.out.println("terminal");
                            if(s.length>1){
                                String p=path;
                                p=p.concat("/");
                                p=p.concat(s[1]);
                                System.out.println("terminal");
                                if("/home/group_os".equals(path))
                                {
                                    ta1.append("\n"+"group_os-x552ld:~>");
                                }
                                else
                                {
                                    ta1.append("\n"+"group_os-x552ld:~"+path.substring(10)+">");
                                }
                        
                            }
                            else
                            {
                            //ta1.append("\n"+"Invalid syntax");
                            if("/home/group_os".equals(path))
                                {
                                    ta1.append("\n"+"group_os-x552ld:~>");
                                }
                                else
                                {
                                    ta1.append("\n"+"group_os-x552ld:~"+path.substring(10)+">");
                                }
                            }
                    
                        }
                    else 
                    {
                    	ta1.append("\n"+"invalid command"+"\n"+"group_os-x552ld:~>");
                    }
                
            } 
            } catch (BadLocationException ex) {
                Logger.getLogger(Terminal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
           }
    }//GEN-LAST:event_ta1KeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea ta1;
    // End of variables declaration//GEN-END:variables
}