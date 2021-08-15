package com.company.state;

public class StateDemo {
    public static void main() {
        var canvas = new Canvas();
        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
