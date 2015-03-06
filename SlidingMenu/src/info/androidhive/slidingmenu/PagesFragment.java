package info.androidhive.slidingmenu;
 
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import org.apache.http.util.ByteArrayBuffer;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
 
public class PagesFragment extends Fragment {
 
    private final String PATH = "/data/data/info.androidhive.slidingmenu/";
    TextView tv;
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pages, container, false);
        super.onCreate(savedInstanceState);
        
        tv = (TextView)view.findViewById(R.id.txtLabel);
        DownloadFromUrl(PATH+"dwn_img.jpg");
		return view;
    }
    public void DownloadFromUrl(String fileName) {
            try {
                    URL url = new URL("http://t3.gstatic.com/images?q=tbn:ANd9GcQs0EPegqi56Alq4vCgC_lVDbZvJtk51RhER7AyDEVA3nUkzjMVK-yDHY3V-w"); //you can write here any link
                    File file = new File(fileName);
 
                    long startTime = System.currentTimeMillis();
                    tv.setText("Starting download......from " + url);
                    URLConnection ucon = url.openConnection();
                    InputStream is = ucon.getInputStream();
                    BufferedInputStream bis = new BufferedInputStream(is);
                    /*
                     * Read bytes to the Buffer until there is nothing more to read(-1).
                     */
                    ByteArrayBuffer baf = new ByteArrayBuffer(50);
                    int current = 0;
                    while ((current = bis.read()) != -1) {
                            baf.append((byte) current);
                    }
 
                    FileOutputStream fos = new FileOutputStream(file);
                    fos.write(baf.toByteArray());
                    fos.close();
                    tv.setText("Download Completed in" + ((System.currentTimeMillis() - startTime) / 1000) + " sec");
            } catch (IOException e) {
                 tv.setText("Error: " + e);
            }
    }
}