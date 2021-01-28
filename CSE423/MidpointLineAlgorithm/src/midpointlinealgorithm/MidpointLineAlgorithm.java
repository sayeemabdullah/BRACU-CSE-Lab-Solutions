/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midpointlinealgorithm;

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
 * @author Sayeem Md Abdullah
 */
public class MidpointLineAlgorithm implements GLEventListener {

    private GLU glu;

    public void display(GLAutoDrawable drawable) {
        final GL2 gl = drawable.getGL().getGL2();
        gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
        //0
        MidpointLine(gl, 10,10,15,40);
        MidpointLine(gl, 30,10,35,40);
        MidpointLine(gl, 10,10,30,10);
        MidpointLine(gl, 15,40,35,40);
        //9
        MidpointLine(gl, 60,10,65,40); 
        MidpointLine(gl, 45,40,65,40);
        MidpointLine(gl, 40,20,45,40); 
        MidpointLine(gl, 40,20,60,20);
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

    public int findZone(int dx, int dy) {

        if (dx >= 0 && dy >= 0) {
            dx = Math.abs(dx);
            dy = Math.abs(dy);
            if (dx >= dy) {
                return 0;
            } else {
                return 1;
            }
        } else if (dx <= 0 && dy >= 0) {
            dx = Math.abs(dx);
            dy = Math.abs(dy);
            if (dx >= dy) {
                return 3;
            } else {
                return 2;
            }
        } else if (dx <= 0 && dy <= 0) {
            dx = Math.abs(dx);
            dy = Math.abs(dy);
            if (dx >= dy) {
                return 4;
            } else {
                return 5;
            }
        } else {
            dx = Math.abs(dx);
            dy = Math.abs(dy);
            if (dx >= dy) {
                return 7;
            } else {
                return 6;
            }
        }
    }

    public int convertToZoneZeroForX(int x, int y, int zone) {
        switch (zone) {
            case 1:
                return y;
            case 2:
                return y;
            case 3:
                return -x;
            case 4:
                return -x;
            case 5:
                return -y;
            case 6:
                return -y;
            default:
                return x;
        }
    }

    public int convertToZoneZeroForY(int x, int y, int zone) {
        switch (zone) {
            case 1:
                return x;
            case 2:
                return -x;
            case 4:
                return -y;
            case 5:
                return -x;
            case 6:
                return x;
            case 7:
                return -y;
            default:
                return y;
        }
    }
    
    public void convertFromZeroAndPrint(GL2 gl, int x, int y, int zone){
        
        switch (zone) {
            case 1:
                gl.glVertex2d(y,x);
                return;
            case 2:
                gl.glVertex2d(-y,x);
                return;
            case 3:
                gl.glVertex2d(-x,y);
                return;
            case 4:
                gl.glVertex2d(-x,-y);
                return;
            case 5:
                gl.glVertex2d(-y,-x);
                return;
            case 6:
                gl.glVertex2d(y,-x);
                return;
            case 7:
                gl.glVertex2d(x,-y);
                return;
            default:
                gl.glVertex2d(x,y);
        }
    }

    public void MidpointLine(GL2 gl, int x1, int y1, int x2, int y2) {

        gl.glPointSize(9.0f);
        gl.glColor3d(0, 1, 1);

        gl.glBegin(GL2.GL_POINTS);

        int dx = (x2 - x1);
        int dy = (y2 - y1);
        int zone = findZone(dx, dy);
        int ddx, ddy, xx1, xx2, yy1, yy2, x, y;
        xx1 = convertToZoneZeroForX(x1, y1, zone);
        yy1 = convertToZoneZeroForY(x1, y1, zone);
        xx2 = convertToZoneZeroForX(x2, y2, zone);
        yy2 = convertToZoneZeroForY(x2, y2, zone);
        ddx = (xx2 - xx1);
        ddy = (yy2 - yy1);
        int D = (2 * ddy) - ddx;
        int NE = 2 * (ddy - ddx);
        int E = 2 * ddy;
        x = xx1;
        y = yy1;
        while (x <= xx2) {
            convertFromZeroAndPrint(gl,x,y,zone);
            x++;
            if (D > 0) {
                y++;
                D = D + NE;
            } else {
                D = D + E;
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
        MidpointLineAlgorithm l = new MidpointLineAlgorithm();
        glcanvas.addGLEventListener(l);
        glcanvas.setSize(500, 500);
        //creating frame
        final JFrame frame = new JFrame("09 - 17101009");
        //adding canvas to frame
        frame.getContentPane().add(glcanvas);
        frame.setSize(frame.getContentPane().getPreferredSize());
        frame.setVisible(true);
    }//end of main
}//end of classimport javax.media.opengl.GL2;
