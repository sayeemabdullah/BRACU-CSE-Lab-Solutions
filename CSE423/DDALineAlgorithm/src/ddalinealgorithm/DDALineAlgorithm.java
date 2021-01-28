/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddalinealgorithm;

/**
 *
 * @author Sayeem Abdullah
 */

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;
import javax.swing.JFrame;

public class DDALineAlgorithm implements GLEventListener{
   
	private GLU glu;
   public void display(GLAutoDrawable drawable) {
      final GL2 gl = drawable.getGL().getGL2();
      gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
//      DDA(gl, -9,-9,0,9);
      //0
      DDA(gl, 10,10,11,40);
      DDA(gl, 30,10,31,40);
      DDA(gl, 10,10,30,10);
      DDA(gl, 10,40,30,40);
      //9
      DDA(gl, 60,10,61,40);
      DDA(gl, 40,40,60,40);
      DDA(gl, 40,20,41,40);
      DDA(gl, 40,20,60,20);
//        DDA(gl,2,2,5,7);
   }
   public void dispose(GLAutoDrawable arg0) {
      //method body
   }
   
   public void init(GLAutoDrawable gld) {
       GL2 gl = gld.getGL().getGL2();
       glu = new GLU();

       gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
       gl.glViewport(-100, -50, 50, 100);
       gl.glMatrixMode(GL2.GL_PROJECTION);
       gl.glLoadIdentity();
       glu.gluOrtho2D(-100.0, 100.0, -100.0, 100.0);
   }

   

   public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4) {
      // method body
   }
   
   
   public void DDA(GL2 gl, float x1, float y1, float x2, float y2) {
       
       gl.glPointSize(3.0f);
       gl.glColor3d(0, 1, 1);
       
       gl.glBegin(GL2.GL_POINTS);

       int dx = (int) (x2 - x1);
       int dy = (int) (y2 - y1);
       double m = dy/dx;
       double x = x1 , y = y1;
       gl.glVertex2d(Math.round(x),Math.round(y));
       if (m>-1 && m<1){
           while(x!=x2){
           x = x + 1;
           y = y + m;
           y = Math.round(y);
           gl.glVertex2d(Math.round(x),Math.round(y));
           }
       }
       else{
           while(y!=y2){
           y = y + 1;
           x = x + (1/m);
           x = Math.round(x);
           gl.glVertex2d(Math.round(x),Math.round(y));
           }
       }

        gl.glEnd();
       
       
    }

   
   
   
   
   
   public static void main(String[] args) {
      //getting the capabilities object of GL2 profile
      final GLProfile profile = GLProfile.get(GLProfile.GL2);
      GLCapabilities capabilities = new GLCapabilities(profile);
      // The canvas 
      final GLCanvas glcanvas = new GLCanvas(capabilities);
      DDALineAlgorithm l = new DDALineAlgorithm();
      glcanvas.addGLEventListener(l);
      glcanvas.setSize(500, 500);
      //creating frame
      final JFrame frame = new JFrame ("09 - 17101009");
      //adding canvas to frame
      frame.getContentPane().add(glcanvas);
      frame.setSize(frame.getContentPane().getPreferredSize());
      frame.setVisible(true);
   }//end of main
}//end of classimport javax.media.opengl.GL2;

