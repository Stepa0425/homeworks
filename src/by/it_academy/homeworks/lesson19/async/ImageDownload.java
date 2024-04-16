package by.it_academy.homeworks.lesson19.async;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ImageDownload {
    public static void main(String[] args) {
        List<String> imageUrls = Arrays.asList(
                "https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/3/32/Googleplex_HQ_%28cropped%29.jpg/480px-Googleplex_HQ_%28cropped%29.jpg"
        );

        downloadImages(imageUrls);
    }
    public static void downloadImages(List<String> imageUrls) {
        // запускаем асинхронные задачки
        List<CompletableFuture<Void>> futures = imageUrls.stream()
                .map(url -> CompletableFuture.runAsync(() -> downloadImage(url)))
                .toList();

        // для дальнейшего использования положим в массив
        CompletableFuture[] futuresArray = futures.toArray(new CompletableFuture[0]);

        // объединим все Future в один
        CompletableFuture<Void> futuresComposed = CompletableFuture.allOf(futuresArray);

        // дождемся результата
        futuresComposed.join();

        System.out.println("All images downloaded successfully");
    }
    private static void downloadImage(String imageUrl) {
        try {
            URL url = new URL(imageUrl);
            try (InputStream in = url.openStream();
                 FileOutputStream out = new FileOutputStream(getFileName(imageUrl))) {
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = in.read(buffer)) != -1) {
                    out.write(buffer, 0, bytesRead);
                }
                System.out.println("Image downloaded: " + imageUrl);
            }
        } catch (IOException e) {
            System.err.println("Failed to download image: " + imageUrl);
        }
    }

    private static String getFileName(String imageUrl) {
        return imageUrl.substring(imageUrl.lastIndexOf('/') + 1);
    }
}