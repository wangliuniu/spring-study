package com.spring.aop;

import cn.hutool.core.util.ImageUtil;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;

@Aspect
public class ImageHandler {
    private static final Logger logger= LoggerFactory.getLogger(ImageHandler.class);
    @Pointcut("execution(* com.spring.aop.ImageCopy.copyImage())")
    public void  handleImage(){

    }
    @Before(value = "handleImage()")
    public void pressTextOnImage() throws IOException {
        logger.info("开始给图片添加水印");
        File srcFile =new File("D:/bg.jpg");
        //        创建一个BufferedImage
        BufferedImage srcImg= ImageIO.read(new FileInputStream(srcFile));
        int width =srcImg.getWidth();
        int height=srcImg.getHeight();
        System.out.println("原图宽："+width+",原图高："+height);

        File destFile =new File("D:/bg1.jpg");
        Color color=new Color(211,71,38);
         int size=20;
        Font font =new Font("微软雅黑",Font.BOLD,30);
        String text="@微博毛毛呀";
        ImageUtil.pressText(srcFile,destFile,text,color,font,(width-text.length()*size)/2,height/2-size,1.0f);

    }
    @AfterReturning("handleImage()")
    public void  grayImage(){
        logger.info("开始将图片变成黑白");
        File srcFile =new File("E:/bg1.jpg");
        File destFile =new File("E:/bg2.jpg");
        ImageUtil.gray(srcFile,destFile);
    }
}
