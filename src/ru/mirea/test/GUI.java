package ru.mirea.test;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import static org.lwjgl.opengl.GL11.*;

public class GUI {
    private static void initializeOpenGL(){
        try {
            //Задаём размер будущего окна
            Display.setDisplayMode(new DisplayMode(1000, 500));

            //Задаём имя будущего окна
            Display.setTitle("Game");

            //Создаём окно
            Display.create();
        } catch (LWJGLException e) {
            e.printStackTrace();
        }

        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        glOrtho(0,1000,0,500,1,-1);
        glMatrixMode(GL_MODELVIEW);

        /*
         * Для поддержки текстур
         */
        glEnable(GL_TEXTURE_2D);

        /*
         * Для поддержки прозрачности
         */
        glEnable(GL_BLEND);
        glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);


        /*
         * Белый фоновый цвет
         */
        glClearColor(1,1,1,1);
    }

    public static void init() { initializeOpenGL(); }
}

class Main {
    public static void main(String[] args) {
        GUI.init();
    }
}