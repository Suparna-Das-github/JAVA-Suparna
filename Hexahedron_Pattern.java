
//Created by Suparna

//Creating Hexahedron pattern challenge in Java




public class Program
{
    public static void main(String[] args) {

    String s = " ".repeat(11),s1=" ".repeat(2);
    String d = "_".repeat(18);
    String p = "%".repeat(17); 
    String e = "/%/", e1 = "/%/:/";
    String e2 = "\\ \\:\\";
    String a = s1.repeat(2);


    p("\n"+s+" "+d +"\n"+s+"/"+p+"/\\"+ "\n"+ s1.repeat(5)+e+"\\"+"_".repeat(12)+e+"::\\");
    p(" ".repeat(9)+e+":/\\:\\"+s1.repeat(4)+e+":/\\:\\");

    p(s1.repeat(4)+
    e1+e2+s1.repeat(3)+e1+e2+"\n"
+s1.repeat(3)+" "+e1+s1+e2+a+e1+s1+e2 +"\n"+
s1.repeat(3)+e1+a+e2+s1.repeat(1)+e1+a+e2);

    p(a+" "+e1+
    "_".repeat(6)+e2+e1+"_".repeat(6)+e2);
    p(a+"/"+p+"/:/"+"%".repeat(8)+"\\_\\:\\");


    //second part

    p(a+"\\  "+"_".repeat(14)+" \\:\\"+"_".repeat(8)+e1 +"\n"+ a+" "+e2+s1.repeat(3)+e1+e2+s1.repeat(3)+e1 +"\n"+

    s1.repeat(3)+e2+s1.repeat(2)+e1+"  "+e2+s1.repeat(2)+e1 +"\n"+
s1.repeat(3)+" "+e2
+s1.repeat(1)+e1+"    "+e2+s1.repeat(1)+e1);

    p(a.repeat(2)+e2+e1+"      "+e2+e1 +"\n"+ a.repeat(2)+" " + e2 +"/:/"+"_".repeat(8)+e2+"/:/");

    p(a.repeat(2)+s1
+"\\ \\/"+"%".repeat(12)
+"\\ \\::/" +"\n"+
a.repeat(2)+s1+" \\"+"_".repeat(17)+"\\/");

}
              
    
public static void p(String a) { 
    System.out.println(a);
    }
}
