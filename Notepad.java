import java.awt.*;

class notepad
{
    public static void main(String args[])
    {
        Frame f=new Frame("Notepad");

        TextArea area=new TextArea("");
        area.setBounds(10,50,400,500);
        f.add(area);    


        MenuBar mb=new MenuBar();
        Menu file=new Menu("File");
        Menu edit=new Menu("Edit");
        Menu format=new Menu("Format");
        Menu view=new Menu("View");
        Menu help=new Menu("Help");

        Menu submenu=new Menu("Sub Menu");

        MenuItem i1=new MenuItem("New");
        MenuItem i2=new MenuItem("New Window");
        MenuItem i3=new MenuItem("open..");
        MenuItem i4=new MenuItem("Save");
        MenuItem i5=new MenuItem("Save as..");
        MenuItem i6=new MenuItem("Page setup..");
        MenuItem i7=new MenuItem("Print..");
        MenuItem i8=new MenuItem("Exit");
        file.add(i1);
        file.add(i2);
        file.add(i3);
        file.add(i4);
        file.add(i5);
        file.add(i6);
        file.add(i7);
        file.add(i8);

        MenuItem a1=new MenuItem("Undo");
        MenuItem a2=new MenuItem("cut");
        MenuItem a3=new MenuItem("copy");
        MenuItem a4=new MenuItem("paste");
        MenuItem a5=new MenuItem("Delete");
        MenuItem a6=new MenuItem("Find Next");
        MenuItem a7=new MenuItem("Find Repalce");
        MenuItem a8=new MenuItem("Select All");
        MenuItem a9=new MenuItem("Time/Date");
        edit.add(a1);
        edit.add(a2);
        edit.add(a3);
        edit.add(a4);
        edit.add(a5);
        edit.add(a6);
        edit.add(a7);
        edit.add(a8);
        edit.add(a9);

        MenuItem b1=new MenuItem("Word Wrap..");
        MenuItem b2=new MenuItem("Font");
       
        format.add(b1);
        format.add(b2);

        
        MenuItem c1=new MenuItem("Zoom");
        MenuItem c2=new MenuItem("status Bar");
        Menu zoom=new Menu("Zoom");
        MenuItem c3=new MenuItem("Zoom In");
        MenuItem c4=new MenuItem("Zoom out");
        MenuItem c5=new MenuItem("Restore Default zoom");
        MenuItem c6=new MenuItem("Status Bar");
        view.add(zoom);
        
    
        view.add(c2);
        zoom.add(c3);
        zoom.add(c4);
        zoom.add(c5);
        zoom.add(c6);

        MenuItem d1=new MenuItem("View help");
        MenuItem d2=new MenuItem("send Feedback");
        MenuItem d3=new MenuItem("About Notepad");
        help.add(d1);
        help.add(d2);
        help.add(d3);
       

        mb.add(file);
        mb.add(edit);
        mb.add(format);
        mb.add(view); 
        mb.add(help);

        f.setMenuBar(mb);
        f.setSize(500,600);
        f.setLayout(null);
        f.setVisible(true);
    }
    
}