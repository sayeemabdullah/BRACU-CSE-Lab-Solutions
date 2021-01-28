/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midpointcirclealgorithm;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;
import javax.swing.JFrame;

/**
 *
 * @author Sayeem Abdullah
 */
public class MidpointCircleAlgorithm implements GLEventListener {

    private GLU glu;

    public void display(GLAutoDrawable drawable) {
        final GL2 gl = drawable.getGL().getGL2();
        gl.glClear(GL2.GL_COLOR_BUFFER_BIT);

        MidpointCircle(gl, 5, 15 , 1);
        MidpointCircle(gl, 5, 15 , 5);
        MidpointCircle(gl, 5, 15 , 10);
        MidpointCircle(gl, 5, 15 , 15);
        MidpointCircle(gl, 5, 15 , 20);
        MidpointCircle(gl, 5, 15 , 25);
        MidpointCircle(gl, 5, 15 , 30);
        MidpointCircle(gl, 5, 15 , 35);
        MidpointCircle(gl, 5, 15 , 40);
        MidpointCircle(gl, 5, 10 , 40);
        MidpointCircle(gl, 5, 5 , 40);
        MidpointCircle(gl, 5, 0 , 40);
        MidpointCircle(gl, 5, -5 , 40);
        MidpointCircle(gl, 5, -5 , 35);
        MidpointCircle(gl, 5, -5 , 30);
        MidpointCircle(gl, 5, -5 , 25);
        MidpointCircle(gl, 5, -5 , 20);
        MidpointCircle(gl, 5, 0 , 20);
        MidpointCircle(gl, 5, 5 , 20);
        MidpointCircle(gl, 5, 10 , 20);
        
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

    public void CirclePoints(GL2 gl, int dx, int dy, int x, int y) {

        gl.glVertex2d(x+dx, y+dy);
        gl.glVertex2d(y+dx, x+dy);
        gl.glVertex2d(y+dx, -x+dy);
        gl.glVertex2d(x+dx, -y+dy);
        gl.glVertex2d(-x+dx, -y+dy);
        gl.glVertex2d(-y+dx, -x+dy);
        gl.glVertex2d(-y+dx, x+dy);
        gl.glVertex2d(-x+dx, y+dy);

    }

    public void MidpointCircle(GL2 gl, int radius, int dx, int dy) {

        gl.glPointSize(3.0f);
        gl.glColor3d(0, 1, 1);

        gl.glBegin(GL2.GL_POINTS);

        int x, y, d;

        d = 1 - radius;
        x = 0;
        y = radius;
        CirclePoints(gl, dx, dy, x, y);

        while (x < y) {

            if (d < 0) {
                d = d + (2 * x) + 3;
                x++;
            } else {
                d = d + (2 * x) - (2 * y) + 5;
                x++;
                y--;
            }

            CirclePoints(gl, dx, dy, x, y);

        }

        gl.glEnd();
    }

    public static void main(String[] args) {
        //getting the capabilities object of GL2 profile
        final GLProfile profile = GLProfile.get(GLProfile.GL2);
        GLCapabilities capabilities = new GLCapabilities(profile);
        // The canvas 
        final GLCanvas glcanvas = new GLCanvas(capabilities);
        MidpointCircleAlgorithm l = new MidpointCircleAlgorithm();
        glcanvas.addGLEventListener(l);
        glcanvas.setSize(500, 500);
        //creating frame
        final JFrame frame = new JFrame("9 - 17101009");
        //adding canvas to frame
        frame.getContentPane().add(glcanvas);
        frame.setSize(frame.getContentPane().getPreferredSize());
        frame.setVisible(true);
    }//end of main

}
