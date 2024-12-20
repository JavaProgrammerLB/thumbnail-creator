package com.yitianyigexiangfa;

import java.io.File;
import java.io.IOException;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.name.Rename;

public class ThumbnailatorHelloWorld {

    public static void main(String[] args) {
        try {
            Thumbnails.of(new File("src/main/resources").listFiles())
                    .size(640, 480)
                    .outputFormat("jpg")
                    .toFiles(Rename.PREFIX_DOT_THUMBNAIL);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
