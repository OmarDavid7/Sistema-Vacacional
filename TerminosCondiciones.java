import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;

public class TerminosCondiciones extends JFrame implements ChangeListener, ActionListener {
    
    private JButton boton1, boton2;
    private JCheckBox check1;
    private JLabel label1, label2;
    private JTextArea area1;
    private JScrollPane scroll1;
    String nombre = "";

    public TerminosCondiciones(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Licencia de uso");
        setIconImage(new ImageIcon(getClass().getResource("imagenes/icon.png")).getImage());
        Bienvenida ventanaBienvenida = new Bienvenida();
        nombre = ventanaBienvenida.texto;

        label1 = new JLabel("TERMINOS Y CONDICIONES");
        label1.setBounds(215,5,200,30);
        label1.setFont(new Font("Andale Mono", 1, 14));
        label1.setForeground(new Color(0,0,0));
        add(label1);

        area1 = new JTextArea();
        area1.setEditable(false);
        area1.setFont(new Font("Andale Mono", 0, 9));
        area1.setText("\n\n          TERMINOS Y CONDICIONES" + 
                    "\n\n          A.   PROHIBIDA SU VENTA O DISTRIBUCION SIN AUTORIZACION DE LA EMPRESA." +
                    "\n          B.   PROHIBIDA LA ALTERACION DEL CODIGO FUENTE O DISEÑO DE LAS INTERFACES GRAFICAS." +
                    "\n          C.   LA EMPRESA NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                    "\n\n         LOS ACUERDOS LEGALES EXPUESTOS A CONTINUACION RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
                    "\n         (LA EMPRESA Y EL AUTOR OMAR), NO SE RESPONSABILIZAN DEL USO QUE USTED" +
                    "\n         HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" +
                    "\n         SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." +
                    "\n\n          PARA MAYOR INFORMACION SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" +
                    "\n          https://github.com/OmarDavid7");
        scroll1 = new JScrollPane(area1);
        scroll1.setBounds(10,40,575,200);
        add(scroll1);

        check1 = new JCheckBox("Yo" + nombre + "Acepto");
        check1.setBounds(10,250,300,30);
        check1.addChangeListener(this);
        add(check1);

        boton1 = new JButton("Continuar");
        boton1.setBounds(10,290,100,30);
        boton1.addActionListener(this);
        boton1.setEnabled(false);
        add(boton1);

        boton2 = new JButton("No Acepto");
        boton2.setBounds(120,290,100,30);
        boton2.addActionListener(this);
        boton2.setEnabled(true);
        add(boton2);

        ImageIcon imagen = new ImageIcon("imagenes/coca-cola.png");
        label2 = new JLabel(imagen);
        label2.setBounds(315,135,300,300);
        add(label2);

    }//fin del constructor

    public void stateChanged(ChangeEvent e){
        if(check1.isSelected() == true){
            boton1.setEnabled(true);
            boton2.setEnabled(false);
        }else{
            boton1.setEnabled(false);
            boton2.setEnabled(true);
        }
    
    }//fin del primer evento

    public void actionPerformed(ActionEvent e){

        if(e.getSource() == boton1){
            Principal formularioprincipal = new Principal();
            formularioprincipal.setBounds(0,0,640,535);
            formularioprincipal.setVisible(true);
            formularioprincipal.setResizable(false);
            formularioprincipal.setLocationRelativeTo(null);
            this.setVisible(false);

        }else if(e.getSource() == boton2){
            Bienvenida formulariobienvenida = new Bienvenida();
            formulariobienvenida.setBounds(0,0,350,450);
            formulariobienvenida.setVisible(true);
            formulariobienvenida.setResizable(false);
            formulariobienvenida.setLocationRelativeTo(null);
            this.setVisible(false);
        }

    }//fin del segundo evento

public static void main(String args[]){

    TerminosCondiciones formularioterminos = new TerminosCondiciones();
    formularioterminos.setBounds(0,0,600,360);
    formularioterminos.setVisible(true);
    formularioterminos.setResizable(false);
    formularioterminos.setLocationRelativeTo(null);

}//fin del metodo main
}//fin de la clase 

