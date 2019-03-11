package com.spring.aop;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ImageUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;
import cn.hutool.extra.qrcode.QrConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import static org.junit.Assert.*;

public class QrcodeTest {

    public static void main(String[] args) {
        QrConfig config = new QrConfig(300, 300);
// 设置边距，既二维码和背景之间的边距
        config.setMargin(3);
       config.setImg("d:/logo.jpg");
// 设置前景色，既二维码颜色（青色）
        Color foreColor = new Color(240, 153, 46);
        Color bgColor = new Color(174, 214, 122);

// 设置背景色（灰色）
        int foreColorRGB = foreColor.getRGB();
        int bgColorRGB = bgColor.getRGB();
        config.setForeColor(foreColor.getRGB());
        config.setBackColor(bgColor.getRGB());

        // 生成二维码到文件，也可以到流
        QrCodeUtil.generate("https://www.jianshu.com/u/d0349e439625", config, FileUtil.file("d:/qrcode.jpg"));


    }
}