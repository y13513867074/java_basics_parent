package com.yzz.study.introduction;

import javax.swing.*;
import java.awt.*;
import java.io.File;

/**
 * java 打开终端窗口
 * File - Open 选择图像文件并打开
 * File - Exit 关闭窗口
 */
public class ImageViewer {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new ImageViewerFrame();
            frame.setTitle("ImageViewer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

/**
 * Swing 是JAVA的GUI工具包
 * Swing包括了图形用户界面（GUI）器件如：文本框，按钮，分隔窗格和表。
 * JFrame GUI程序基础
 */
class ImageViewerFrame extends JFrame {
    /**
     * 标签组件
     */
    private JLabel label;

    /**
     * 文件选择器 负责打开文件，保存文件
     */
    private JFileChooser chooser;

    /**
     * 默认窗口宽度
     */
    private static final int DEFAULT_WIDTH = 300;

    /**
     * 默认窗口高度
     */
    private static final int DEFAULT_HEIGTH = 400;

    /**
     * 构造方法
     */
    public ImageViewerFrame() {
        //设置窗口宽高
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGTH);
        //设置窗口位置
        setLocation(580, 150);

        label = new JLabel();
        add(label);

        chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menu = new JMenu("File");
        menuBar.add(menu);

        JMenuItem openItem = new JMenuItem("Open");
        menu.add(openItem);

        openItem.addActionListener(event -> {

            int result = chooser.showOpenDialog(null);

            if(result == JFileChooser.APPROVE_OPTION) {
                String name = chooser.getSelectedFile().getPath();
                label.setIcon(new ImageIcon(name));
            }
        });

        JMenuItem exitItem = new JMenuItem("Exit");
        menu.add(exitItem);
        exitItem.addActionListener(event -> System.exit(0));
    }

}
