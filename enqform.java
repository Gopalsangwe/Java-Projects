import java.awt.*;

class enqform
{
    public static void main(String args[])
    {
        Frame f=new Frame("Enquiry form");

        TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;

        TextArea area=new TextArea("");
        area.setBounds(75,155,350,50);
        f.add(area);    

        TextArea area1=new TextArea("");
        area1.setBounds(15,225,350,50);
        f.add(area1);   

        Font d=new Font("default",Font.BOLD,15);
        Label l=new Label("ENQUIRY FORM");
        l.setBounds(180,30,150,30);
        f.add(l);
        l.setFont(d);

        Label l1=new Label("Date:");
        l1.setBounds(10,55,50,20);
        f.add(l1);

        t1=new TextField("");
        t1.setBounds(60,55,100,20);
        f.add(t1);

        Label l2=new Label("Time:");
        l2.setBounds(300,55,50,20);
        f.add(l2);

        t2=new TextField("");
        t2.setBounds(350,55,100,20);
        f.add(t2);


        Label l3=new Label("Name:");
        l3.setBounds(15,80,50,20);
        f.add(l3);

        t3=new TextField("");
        t3.setBounds(75,80,300,20);
        f.add(t3);


        Label l4=new Label("Father's Name:");
        l4.setBounds(15,105,100,20);
        f.add(l4);

        t4=new TextField("");
        t4.setBounds(115,105,250,20);
        f.add(t4);

        Label l5=new Label("College Name:");
        l5.setBounds(15,130,100,20);
        f.add(l5);

        t3=new TextField("");
        t3.setBounds(115,130,350,20);
        f.add(t3);

        Label l6=new Label("Address:");
        l6.setBounds(15,155,60,20);
        f.add(l6);

        /*t3=new TextField("");
        t3.setBounds(75,155,300,20);
        f.add(t3);*/

        Label l7=new Label("How did you come to know about Educadd:");
        l7.setBounds(15,205,300,20);
        f.add(l7);

        Label l8=new Label("Contact No:");
        l8.setBounds(15,280,65,20);
        f.add(l8);

        t8=new TextField("");
        t8.setBounds(80,280,150,20);
        f.add(t8);

        Label l9=new Label("Email:");
        l9.setBounds(15,305,40,20);
        f.add(l9);

        t9=new TextField("");
        t9.setBounds(60,305,180,20);
        f.add(t9);

        Label l10=new Label("Signature:");
        l10.setBounds(250,305,60,20);
        f.add(l10);

        t8=new TextField("");
        t8.setBounds(310,305,150,20);
        f.add(t8);

       

        Label l11=new Label("Office Use Only:");
        l11.setBounds(190,350,100,20);
        f.add(l11);

        Label l12=new Label("Course Offered:");
        l12.setBounds(15,375,100,20);
        f.add(l12);

        Choice c=new Choice();
        c.setBounds(115,375,75,75);
        c.add("java");
        c.add("java advance");
        c.add("python");
        c.add("HTML");
        c.add("Autocadd");
        c.add("C++");
        c.add("C");
        f.add(c);

        Label l13=new Label("Interested:");
        l13.setBounds(15,405,60,20);
        f.add(l13);

        Checkbox d1=new Checkbox("Yes");
        Checkbox d2=new Checkbox("NO");
        d1.setBounds(80,405,40,25);
        d2.setBounds(130,405,40,25);
        f.add(d1);
        f.add(d2);

        Label l14=new Label("Expected Joining Date:");
        l14.setBounds(15,430,150,20);
        f.add(l14);

        Choice c1=new Choice();
        c1.setBounds(15,455,35,30);
        c1.add("1");
        c1.add("2");
        c1.add("3");
        c1.add("4");
        c1.add("5");
        c1.add("6");
        c1.add("7");
        c1.add("8");
        c1.add("9");
        c1.add("10");
        c1.add("11");
        c1.add("12");
        c1.add("13");
        c1.add("14");
        c1.add("15");
        c1.add("16");
        c1.add("17");
        c1.add("18");
        c1.add("19");
        c1.add("20");
        c1.add("21");
        c1.add("22");
        c1.add("23");
        c1.add("24");
        c1.add("25");
        c1.add("26");
        c1.add("27");
        c1.add("28");
        c1.add("29");
        c1.add("30");
        c1.add("31");
        f.add(c1);

        Label l22=new Label("202");
        l22.setBounds(90,455,23,20);
        f.add(l22);


        Choice c2=new Choice();
        c2.setBounds(50,455,35,30);
        c2.add("1");
        c2.add("2");
        c2.add("3");
        c2.add("4");
        c2.add("5");
        c2.add("6");
        c2.add("7");
        c2.add("8");
        c2.add("9");
        c2.add("10");
        c2.add("11");
        c2.add("12");
        f.add(c2);

        Choice c3=new Choice();
        c3.setBounds(110,455,30,30);
        c3.add("0");
        c3.add("1");
        c3.add("2");
        c3.add("3");
        c3.add("4");
        c3.add("5");
        c3.add("6");
        c3.add("7");
        c3.add("8");
        c3.add("9");
        
        
        f.add(c3);


        /*Label l15=new Label("        /       /20      ");
        l15.setBounds(0,455,150,20);
        f.add(l15);*/

        /*t9=new TextField("");
        t9.setBounds(0,455,100,20);
        f.add(t9);*/

        Label l16=new Label("Demo Given:");
        l16.setBounds(15,480,70,20);
        f.add(l16);

        Checkbox d3=new Checkbox("Yes");
        Checkbox d4=new Checkbox("NO");
        d3.setBounds(90,480,40,25);
        d4.setBounds(140,480,40,25);
        f.add(d3);
        f.add(d4);

        Label l17=new Label("Fess offered:");
        l17.setBounds(250,375,70,20);
        f.add(l17);

        t10=new TextField("");
        t10.setBounds(310,375,100,20);
        f.add(t10);

        Label l18=new Label("Demo Given by:");
        l18.setBounds(250,405,90,20);
        f.add(l18);

        t11=new TextField("");
        t11.setBounds(340,405,100,20);
        f.add(t11);

        Label l19=new Label("Handled by:");
        l19.setBounds(270,440,90,20);
        f.add(l19);

        Label l20=new Label("Note:Update on ECMS");
        l20.setBounds(300,540,150,20);
        f.add(l20);

        Label l21=new Label(":_____________________");
        l21.setBounds(270,505,150,20);
        f.add(l21);

        TextArea area2=new TextArea("");
        area2.setBounds(270,460,200,40);
        f.add(area2);   
        
        Button b=new Button("Submit");
        b.setBounds(170,570,100,50);
        f.add(b);


        f.setSize(500,700);
       f.setLayout(null);
       f.setVisible(true);
    }
}