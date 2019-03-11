package com.spring.image;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;
import cn.hutool.extra.qrcode.QrConfig;

import java.awt.*;

public class QrCodeTest {
    public static void main(String[] args) {
        QrConfig config = new QrConfig(300, 300);
// 设置边距，既二维码和背景之间的边距
        config.setMargin(3);
        Color foreColor =new Color(238,110,115);
        Color bgColor=new Color(252,228,236);
// 设置前景色，既二维码颜色
        int foreColorRGB=foreColor.getRGB();
        int bgColorRGB=bgColor.getRGB();
        config.setForeColor(foreColorRGB);
// 设置背景色
        config.setBackColor(bgColorRGB);

// 生成二维码到文件，也可以到流
       // QrCodeUtil.generate("https://www.jianshu.com/u/522401c76977", config, FileUtil.file("d:/二维码/1.jpg"));
        QrCodeUtil.generate("https://www.jianshu.com/u/522401c76977", QrConfig.create().setImg("d:/1.jpg"),FileUtil.file("d:/二维码/1.jpg")//写出到的文件
        );
    }
}
