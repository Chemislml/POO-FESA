public class Ejercicios{

    //PEREZ MOLINA JOSE MANUEL 2208//

        public static void main (String[] args) {

            System.out.println("----------------");

            //Ejercicio numero 1.
            String sm = "Hola";
            int x = sm.length();

            System.out.println("El resultado es = " + x);
            System.out.println("----------------");


            //Ejercio  numero 2.
            String s1 = "Hola";
            boolean b1 = s1.isEmpty();
            System.out.println(b1);

            String s2 = "";
            boolean b2 = s2.isEmpty();
            System.out.println(b2);

            System.out.println("----------------");

            //Ejercicio numero 3.
            String t = "Hola";
            for(int i=0; i<t.length();i++)
            {
                char c = t.charAt(i);
                System.out.println(c);
            }

            System.out.println("----------------");

            //Ejercicio numero 4.
            String xs = "Hola";
            String ys = "Hola";

            if(xs.equals(ys))
            {
                System.out.println("SI pasa por aqui");
            }

            System.out.println("----------------");

            //Ejercicio numero 5.
            String S = "Hola, como estas?";
            int p1 = S.indexOf('a');
            System.out.println(p1); 
            int p2 = S.lastIndexOf(S);
            System.out.println(p2);

            System.out.println("----------------");

            //Ejercicio numero 6.
            String S_ = "Hola, como estas? Estas como querias?";
            int p3 = S_.indexOf("como");
            System.out.println(p3);
            int p4 = S_.indexOf("estas");
            System.out.println(p4);
            int p5 = S_.lastIndexOf("como");
            System.out.println(p5);

            System.out.println("----------------");

            //Ejercicio 7.
            String may = S.toUpperCase();
            System.out.println(may);
            String min = S.toLowerCase();
            System.out.println(min);

            System.out.println("----------------");

            //Ejercicio 8.
            String s = "Hola, como estas?";
            String s1_ = s.substring(0,4);
            System.out.println(s1_);
            String s2_ = s.substring(6,10);
            System.out.println(s2_);
            String s3_ = s.substring(11);
            System.out.println(s3_);

            System.out.println("----------------");

            //Ejercicio 9.

            //enteros
            String s1__ = "1234";
            int i_ = Integer.parseInt(s1__);
            System.out.println(i_);
            String t1 = Integer.toString(i_);
            System.out.println(t1);

            //flotantes
            String s2__ = "1234.56";
            double d = Double.parseDouble(s2__);
            System.out.println(d);
            String t2 = Double.toString(d);
            System.out.println(t2);

            System.out.println("----------------");

            //Ejercicio 10.
            String sp = "Hola, ";
            System.out.println(sp);
            String tp = "que tal?";
            System.out.println(tp);
            String up = s+t;
            System.out.println(up);

            System.out.println("----------------");

            //Ejercicio 11.
            String so = "Hola";
            so = "chau";
            System.out.println(so);

            System.out.println("----------------");

            //Ejercicio 12.
            so += ", chau";
            System.out.println(so);

            System.out.println("----------------");

            //Ejercicio 13
            StringBuilder sb = new StringBuilder();
            sb.append("Hola, ");
            sb.append("Chau");
            System.out.println(sb);

            System.out.println("----------------");

            //Ejercicio 14
            sb = new StringBuilder("Hola");
            sb.setCharAt(2, 'X');
            System.out.println(sb);

            System.out.println("----------------");

        }
    }

//Fin de codigo ejercicios POO

